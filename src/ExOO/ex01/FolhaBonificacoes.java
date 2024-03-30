package ExOO.ex01;

import java.util.Scanner;

public class FolhaBonificacoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[10]; // Criar array de funcionários
        int indice = 0; // Define a primeira posição do item no array

        System.out.println("~~~~~~ Folha de bonificações XYZ ~~~~~~");

        int opcao;
        do {
            System.out.println("\nPara interação no sistema escolha uma das opções disponíveis: ");
            System.out.println("          1: Cadastrar novo Funcionário.");
            System.out.println("          2: Listar funcionários já cadastrados.");
            System.out.println("          0: Sair do programa.");
            System.out.println("-------------------------------------------------------------");

            opcao = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.println("\nInsira os dados do Funcionário: ");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Salário: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();

                    Funcionario funcionario = null; // começa vazio pra dizer que não tem nada dentro desse array
                    if (cargo.equalsIgnoreCase("gerente") || cargo.equalsIgnoreCase("Gerente")) {
                        funcionario = new Gerente(nome, cpf, salario);
                    } else if (cargo.equalsIgnoreCase("designer")) {
                        funcionario = new Designer(nome, cpf, salario);
                    } else if (cargo.equalsIgnoreCase("programador")) {
                        funcionario = new Programador(nome, cpf, salario);
                    }

                    funcionarios[indice] = funcionario;
                    indice++;
                    break;

                case 2:
                    System.out.println("\nFuncionários cadastrados:");
                    for (int i = 0; i < indice; i++) {
                        System.out.println(funcionarios[i]);
                    }
                    break;

                case 0:
                    System.out.println("\nXoxo, Gossip Girl...");
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
