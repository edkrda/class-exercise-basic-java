package Aula03Atividade02;

import java.util.Scanner;

/*
- Criar classe Pessoa
ATRIBUTOS privados:
 - cpf: String
 - nome: String
 - sexo: char
 - idade: int

 METODOS de acesso:
  -setCPF e getCPF String
  -setNome e getNome String
  -setSexo e getSexo char
  setIdade e getIdade int

  Metodo de saida String - retorna string formatada contendo dado de todos


 */

public class Main {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        Pessoa pessoa= null;
        int opcao;


      do{
           System.out.println("---- Menu ----");
           System.out.println("1. Criar pessoa");
           System.out.println("2. Mostrar pessoa");
           System.out.println("3. Sair");
           System.out.println("Digite a opção desejada: ");

           while(!scan.hasNext()){
               System.out.println("Opção invalida");
               scan.next();
           }
           opcao= scan.nextInt();
           scan.nextLine();
           switch (opcao) {
               case 1:
                   pessoa = new Pessoa();
                   System.out.println("Digite o nome: ");
                   pessoa.setNome(scan.nextLine());



                   System.out.println("Digite o CPF: ");
                   pessoa.setCpf(scan.nextLine());

                   System.out.println("Digite o sexo: ");
                   pessoa.setSexo(scan.next().toUpperCase().charAt(0));

                   System.out.println("Digite a idade: ");
                   pessoa.setIdade(scan.nextInt());

                   break;
               case 2:
                   if (pessoa != null) {
                       System.out.println("==== Dados ====:");
                       System.out.println(pessoa.imprimir());
                   } else {
                       System.out.println("Ainda não uma pessoa cadastrada.");
                   }
                   break;
               case 3:
                   System.out.println("Encerrando o programa...");
                   break;
               default:
                   System.out.println("Opção inválida!");
           }


       } while (opcao!=3);

        scan.close();

    }
}
