import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int a, b, soma;
        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        soma = a + b;

        System.out.println("SOMA = "+soma);
    }
}