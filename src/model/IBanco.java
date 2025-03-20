package model;

import java.util.List;

public interface IBanco {
    void criarConta(IConta conta);
    IConta getConta(int numero);
    List<IConta> getContas();
    void fecharConta(IConta conta);
    void adicionarCliente(ICliente clientes);
    void removerCliente(ICliente clientes);
    List<ICliente> getClientes();
}
