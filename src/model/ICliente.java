package model;

import java.util.List;

public interface ICliente {
    List<IConta> getContas();
    void adicionarConta(IConta conta);
    void removerConta(IConta conta);
}
