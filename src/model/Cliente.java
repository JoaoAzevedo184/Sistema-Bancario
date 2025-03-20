package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements ICliente{

    private String nome;
    private List<IConta> conta;

    public Cliente(String nome) {
        this.nome = nome;
        this.conta = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    @Override
    public List<IConta> getContas() {
        return this.conta;
    }

    @Override
    public void adicionarConta(IConta conta) {
        this.conta.add(conta);
    }

    @Override
    public void removerConta(IConta conta) {
        this.conta.remove(conta);
    }
}
