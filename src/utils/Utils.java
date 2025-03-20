package utils;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    private static List<String> clientes = new ArrayList<>();

    public static void addCliente(String cliente){
        clientes.add(cliente.toUpperCase());
    }
    public static List<String> getClientes() {
        return clientes;
    }

    public static boolean Limites(double valor, double saldo){
        if (valor <= 0) {
            System.out.println("Por favor, insira números positivos e não nulos.");
            return false;
        } else {
            if (valor > saldo) {
                System.out.println("Operação Inválida.");
                return false;
            } else {
                return true;
            }
        }
    }

    public final static String OPCOES_BANCO =
                """
                1 -> Sacar
                2 -> Depositar
                3 -> Transferir
                4 -> Dados da Conta
                5 -> Sair
                """;

}
