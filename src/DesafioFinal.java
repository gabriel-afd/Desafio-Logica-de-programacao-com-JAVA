import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {

        String nome = "Gabriel Medeiros";
        String tipoConta = "Corrente";
        double saldo = 1100.10;

        System.out.println("**************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("**************************");

        String menu = """
                **Digite sua opção**
                1-Consultar saldo
                2-Transferir valor
                3-Receber valor
                4-Sair
                """;

        Scanner leitura = new Scanner(System.in);
        int opcao =0;
        while (opcao != 4){
           System.out.println(menu);
           opcao = leitura.nextInt();

           if(opcao == 1){
               System.out.println("O saldo atual é: " + saldo);
           }else if(opcao == 2){
               System.out.println("Qual o valor deseja transferir: ");
               double valorTransferido = leitura.nextDouble();
               if(valorTransferido > saldo){
                   System.out.println("Não há saldo suficiente para fazer essa transferência");
               } else{
                   double saldoAtualizado = saldo - valorTransferido;
                   System.out.println("Saldo atualizado R$ " + saldoAtualizado);
               }
           }else if(opcao == 3){
                   System.out.println("Informe o valor a receber: ");
                   double valorRecebido = leitura.nextDouble();
                   double valorTotal = saldo + valorRecebido;
                   System.out.println("Saldo atualizado: " + valorTotal);
           } else if (opcao !=4){
               System.out.println("Opção inválida");
           }


        }

    }
}
