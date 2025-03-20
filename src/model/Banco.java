package model;

import java.util.ArrayList;
import java.util.List;

public class Banco implements IBanco{
    private List<IConta> conta;
    private List<ICliente> cliente;

    public Banco() {
        this.conta = new ArrayList<>();
        this.cliente = new ArrayList<>();
    }

    @Override
    public void adicionarCliente(ICliente cliente) {
        this.cliente.add(cliente);
    }

    @Override
    public void removerCliente(ICliente cliente) {
        this.cliente.remove(cliente);
    }

    @Override
    public List<ICliente> getClientes() {
        return this.cliente;
    }

    @Override
    public void criarConta(IConta conta) {
        this.conta.add(conta);
    }

    @Override
    public void fecharConta(IConta conta) {
        this.conta.remove(conta);
    }

    @Override
    public IConta getConta(int numero) {
        for (IConta conta : this.conta) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    @Override
    public List<IConta> getContas() {
        return this.conta;
    }
}
