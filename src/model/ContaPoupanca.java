package model;

public class ContaPoupanca extends Conta  implements IConta{

    public ContaPoupanca(Cliente cliente, double saldo) {
        super(cliente,saldo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
