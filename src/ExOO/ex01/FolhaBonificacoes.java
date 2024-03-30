package ExOO.ex01;

import java.util.Scanner;

public class FolhaBonificacoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[10];
        int indice = 0;

        System.out.println("~~~~~~ Folha de bonificações XYZ ~~~~~~");

        int opcao;
        do {
            System.out.println("\nPara interação no sistema escolha uma opção disponível: ");
            System.out.println("> Digite 1: Para cadastrar um novo Funcionário.");
            System.out.println("> Digite 2: Para listar os funcionários já cadastrados.");
            System.out.println("> Digite 0: Para sair do programa.");

            opcao = sc.nextInt();
            sc.nextLine();

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

                    Funcionario funcionario = null;
                    if (cargo.equalsIgnoreCase("gerente")) {
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
                    System.out.println("\nSaindo do programa...");
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
