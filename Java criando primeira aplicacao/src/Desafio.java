import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        String nome = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("***********************");

        while (opcao != 4) {

            System.out.println("""
                    
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada:
                    """);

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("O saldo atual é R$ " + saldo);
                    break;

                case 2:
                    System.out.println("Informe o valor a receber:");
                    double valorReceber = entrada.nextDouble();

                    saldo += valorReceber;

                    System.out.println("Saldo atualizado R$ " + saldo);
                    break;

                case 3:
                    System.out.println("Informe o valor que deseja transferir:");
                    double valorTransferir = entrada.nextDouble();

                    if (valorTransferir > saldo) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    } else {
                        saldo -= valorTransferir;
                        System.out.println("Saldo atualizado R$ " + saldo);
                    }
                    break;

                case 4:
                    System.out.println("Aplicação encerrada.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        entrada.close();
    }
}