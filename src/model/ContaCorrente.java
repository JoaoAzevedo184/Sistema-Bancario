package model;

public class ContaCorrente extends Conta implements IConta{
    public ContaCorrente(Cliente cliente, double saldo) {
        super(cliente,saldo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}
