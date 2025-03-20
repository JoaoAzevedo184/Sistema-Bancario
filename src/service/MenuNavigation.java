package service;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import model.Banco;
import model.Cliente;
import model.Conta;
import model.IConta;
import static utils.Utils.OPCOES_BANCO;

public class MenuNavigation {
    private List<Conta> contas;
    private Banco banco;

    public MenuNavigation(List<Conta> contas, Banco banco) {
        this.contas = contas;
        this.banco = banco;
    }

    public void Menu(Cliente cliente, Conta conta){
        Scanner teclado = new Scanner(System.in);
        int escolha;
        double valor;
        System.out.printf("=== Funcionalidades disponíveis no Banco , %s ===\n", cliente.getNome());
        while(true) {
            try {
            System.out.println(OPCOES_BANCO);
            escolha = teclado.nextInt();
            switch (escolha){
                case 1 :
                    System.out.print("Quanto senhor deseja sacar? R$");
                    valor = teclado.nextDouble();
                    System.out.println();
                    conta.sacar(valor);
                    break;
                case 2 :
                    System.out.print("Quanto senhor deseja depositar? R$");
                    valor = teclado.nextInt();
                    System.out.println();
                    conta.depositar(valor);
                    break;
                case 3 :
                    System.out.print("Quanto senhor deseja transferir? R$");
                    valor = teclado.nextDouble();
                    System.out.println();
                    System.out.print("Para quem o senhor deseja transferir? ");
                    int numeroContaDestino = teclado.nextInt();
                    IConta contaDestino = banco.getConta(numeroContaDestino);
                    if (contaDestino != null) {
                        conta.transferir(valor, contaDestino);
                    } else {
                        System.out.println("Conta de destino não encontrada.");
                    }
                    break;
                case 4:
                    System.out.println("Aqui estão seus dados bancários.");
                    conta.exibirInformacoes();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                teclado.next(); // Limpa a entrada inválida
            } catch (RuntimeException e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }
    }
}
