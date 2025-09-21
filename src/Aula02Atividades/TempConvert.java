import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Graus para a conversão em Fahrenheit: ");
        double grauCel = scan.nextDouble();

       double fah=temp(grauCel);
        System.out.println(grauCel+" graus em Fahrenheit é "+fah);


    }
    public static double temp ( double c) {
       return c * 9/5 + 32;

    }

}
