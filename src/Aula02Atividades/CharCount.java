import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scan.nextLine();
        System.out.println("Digite a letra para saber a quantidade de repetição: ");
        char letra = scan.next().charAt(0);

        int teste= count(palavra, letra);
        System.out.println("A letra "+ letra +" aparece "+ teste +" vezes " + "na palavra "+ palavra);

    }

    public static int count (String y, char x){
        int contador = 0;
        for(int i = 0;i<y.length();i++){
            if(y.charAt(i)==x){
                contador++;
            }
        }
        return contador;
    }

}
