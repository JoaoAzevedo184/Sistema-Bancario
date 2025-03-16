package model;
import utils.Utils;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        Utils.addCliente(cliente.getNome());
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Por favor, insira números positivos e não nulos.");
            return false;
        } else {
            if (valor > saldo) {
                System.out.println("Saldo insuficiente");
                return false;
            } else {
                saldo -= valor;
                System.out.println(cliente.getNome().toUpperCase() + ", você acaba de fazer um saque de R$" + String.format("%.2f", valor) + ". Saldo atual: R$" + String.format("%.2f", saldo) + "\n");
                return true;
            }
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Por favor, insira números positivos e não nulos.");
            return;
        } else {
            if (valor > saldo) {
                System.out.println("Operação Inválida.");
            } else {
                saldo += valor;
                System.out.println(cliente.getNome().toUpperCase() + ", você acaba de depositar R$" + String.format("%.2f", valor) + ". Saldo atual: R$" + String.format("%.2f", saldo) + "\n");
            }
        }
    }
    @Override
    public void transferir(double valor, IConta contaDestino) {
        if(this.sacar(valor)){
            contaDestino.depositar(valor);
        }else{
            System.out.println("Operação Inválida.");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}