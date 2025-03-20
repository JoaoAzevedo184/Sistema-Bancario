import model.*;
import service.MenuNavigation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Zelda");
        Cliente cliente2 = new Cliente("Pablo");
        Cliente cliente3 = new Cliente("Darwin");
        Cliente cliente4 = new Cliente("Solteiro");

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);
        banco.adicionarCliente(cliente3);
        banco.adicionarCliente(cliente4);

        Conta contaCorrente1 = new ContaCorrente(cliente1, 1000);
        Conta contaPoupanca1 = new ContaPoupanca(cliente2, 1500);
        Conta contaCorrente2 = new ContaCorrente(cliente3, 1000);
        Conta contaPoupanca2 = new ContaPoupanca(cliente4, 1500);

        banco.criarConta(contaCorrente1);
        banco.criarConta(contaPoupanca1);
        banco.criarConta(contaCorrente2);
        banco.criarConta(contaPoupanca2);

        List<Conta> contas = new ArrayList<>();
        contas.add(contaCorrente1);
        contas.add(contaPoupanca1);
        contas.add(contaCorrente2);
        contas.add(contaPoupanca2);

        MenuNavigation menuNavigation = new MenuNavigation(contas, banco);

        // Operações para o cliente 1
        System.out.println("Operações para o cliente: " + cliente1.getNome());
        menuNavigation.Menu(cliente1, contaCorrente1);

        // Operações para o cliente 2
        System.out.println("Operações para o cliente: " + cliente2.getNome());
        menuNavigation.Menu(cliente2, contaPoupanca1);

        // Operações para o cliente 3
        System.out.println("Operações para o cliente: " + cliente3.getNome());
        menuNavigation.Menu(cliente3, contaCorrente2);

        // Operações para o cliente 4
        System.out.println("Operações para o cliente: " + cliente4.getNome());
        menuNavigation.Menu(cliente4, contaPoupanca2);
    }
}