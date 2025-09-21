import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scan.nextInt();
        boolean verified = verificaPar(num);
        System.out.println("O número "+ num + " é par? " + verified);

    }

    public static boolean verificaPar(int x){
        if(x%2==0){
            return true;
        } else {
            return false;
        }
    }


}
