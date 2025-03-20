package model;

import utils.Utils;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente, double saldo) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (Utils.Limites(valor,saldo)) {
            saldo -= valor;
            System.out.println(cliente.getNome().toUpperCase() + ", você acaba de fazer um saque de R$" + String.format("%.2f", valor) + ". Saldo atual: R$" + String.format("%.2f", saldo) + "\n");
        }
    }

    @Override
    public void depositar(double valor) {
        if (Utils.Limites(valor,saldo)) {
            saldo += valor;
            System.out.println(cliente.getNome().toUpperCase() + ", você acaba de depositar R$" + String.format("%.2f", valor) + ". Saldo atual: R$" + String.format("%.2f", saldo) + "\n");
            }
    }
    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (Utils.Limites(valor,saldo)) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println(cliente.getNome().toUpperCase() + ", você acaba de transferir R$" + String.format("%.2f", valor) + ". Saldo atual: R$" + String.format("%.2f", saldo) + "\n");
        }
    }

    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    public void exibirInformacoes() {
        imprimirInfosComuns();
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}