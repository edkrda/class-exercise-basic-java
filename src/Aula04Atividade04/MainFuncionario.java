package Aula04Atividade04;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Funcionario novoFuncionario = null;
        int opt;

        do{
            System.out.println("1. Criar Funcionario");
            System.out.println("2. Mostrar Folha de Pagamento");
            System.out.println("3. Sair");
            System.out.println("Digite o número que deseja acessar: ");
            opt= scan.nextInt();
            scan.nextLine();

            switch(opt){
                case 1:
                    System.out.println("Digite o nome do funcionario: ");
                    String nome = scan.nextLine();
                    System.out.println("Digite o cracha do funcionario: ");
                    int cracha = scan.nextInt();
                    System.out.println("Digite o Tipo Vinculo (H/N): ");
                    char tipoVinculo = scan.next().toUpperCase().charAt(0);

                    novoFuncionario = new Funcionario(cracha, nome, tipoVinculo);

                    if(tipoVinculo=='H'){
                        System.out.println("Digite o valor por hora: ");
                        float valorHora = scan.nextFloat();
                        novoFuncionario.setValorHora(valorHora);

                        System.out.println("Digite a quantidade de horas trabalhadas: ");
                        float qntHora= scan.nextFloat();
                        novoFuncionario.setQntHora(qntHora);
                    } else if (tipoVinculo=='N'){
                        System.out.println("Digite o salario: ");
                        float salario= scan.nextFloat();
                        novoFuncionario.setSalario(salario);
                    } else {
                        System.out.println("Tipo invalido!");
                    }

                    System.out.println("Digite o valor do desconto: ");
                    float valorDesconto = scan.nextFloat();
                    novoFuncionario.setValorDesconto(valorDesconto);


                    System.out.println("Funcionario cadastrado com sucesso!");

                    break;
                case 2:
                    if(novoFuncionario==null){
                        System.out.println("Funcionario inválido! Crie um para continuar.");
                    } else {
                        System.out.println("--- Folha de Pagamento ---");
                        System.out.println(novoFuncionario.imprimir());
                    }

                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (opt!=3);
    }
}
