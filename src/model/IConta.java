package model;

public interface IConta {
    int getNumero();
    double getSaldo();
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, IConta contaDestino);
    void imprimirExtrato();
}
