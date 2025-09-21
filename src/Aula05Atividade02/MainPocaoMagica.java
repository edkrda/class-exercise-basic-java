package Aula05Atividade02;

import java.util.Scanner;

public class MainPocaoMagica {
    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);
        int opt;
        Pocao pocao= null;
        do{
            System.out.println("1. Criar poção. ");
            System.out.println("2. Ver poção atual. ");
            System.out.println("3. Usar poção. ");
            System.out.println("4. Descartar poção. ");
            System.out.println("5. Sair.");
            System.out.println("Digite sua opção!");
            opt = scan.nextInt();



            switch(opt){
                case 1:
                    int sc;
                    System.out.println("Digite a opção que deseja acessar:");
                    System.out.println("1. Apenas nome");
                    System.out.println("2. Nome + poder");
                    System.out.println("3. Nome + poder + tipo");
                    sc= scan.nextInt();

                    if(sc==1){
                        System.out.println("Digite o nome da poção: ");
                        String nome = scan.next();
                        pocao = new Pocao(nome);
                    } else if(sc==2){
                        System.out.println("Digite o nome da poção: ");
                        String nome = scan.next();
                        System.out.println("Digite o poder: ");
                        int poder = scan.nextInt();
                        pocao = new Pocao(nome, poder);

                    }else if(sc==3){
                        System.out.println("Digite o nome da poção: ");
                        String nome = scan.next();
                        System.out.println("Digite o poder (1 até 100): ");
                        int poder= scan.nextInt();
                        System.out.println("Digite o tipo: ");
                        String tipo= scan.next();
                        pocao = new Pocao(nome, poder, tipo);
                    } else{
                        System.out.println("Opção inválida!");
                    }
                    System.out.println("Poção criada com sucesso!");
                    break;
                case 2:
                    if(pocao==null){
                        System.out.println("Nenhuma poção cadastrada");
                    } else {
                        pocao.imprimir();
                    }

                    break;
                case 3:
                    if(pocao==null){
                        System.out.println("Nenhuma poção cadastrada");
                    } else {
                        System.out.println("1. Usar poção. ");
                        System.out.println("2. Usar poção em um alvo. ");
                        System.out.println("3. Usar poção em um alvo variadas vezes");
                        int acao= scan.nextInt();

                        switch(acao){
                            case 1:
                                pocao.usar();
                                break;
                            case 2:
                                System.out.println("Digite o alvo: ");
                                String alvo= scan.next();
                                pocao.usar(alvo);
                                break;
                            case 3:
                                System.out.println("Digite o alvo: ");
                                String alvo2= scan.next();
                                System.out.println("Digite a quantidade de vezes:");
                                int vezes= scan.nextInt();
                                pocao.usar(alvo2, vezes);
                                break;
                        }

                    }

                    break;
                case 4:
                    if (pocao == null) {
                        System.out.println("Não há poção para descartar.");
                    } else {
                        pocao = null;
                        System.out.println("Poção descartada!");
                    }
                    break;

                case 5:
                    System.out.println("Fechando o Menu...");
                    break;
                default:
                    System.out.println("Opção invalida!");

            }


        }while(opt!=5);

    }
}
