import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero 1: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o numero 2: ");
        double num2 = scan.nextDouble();

        double sum = soma(num1, num2);
        double sub= subtrair(num1, num2);
        double div= dividir(num1, num2);
        double mult= multiplicar(num1, num2);

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + sub);
        System.out.println(num1 + " % " + num2 + " = " + div);
        System.out.println(num1 + " x " + num2 + " = " + mult);

    }
    public static double soma(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }
    public static double dividir(double num1, double num2){
        return num1 / num2;
    }
    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }
}
