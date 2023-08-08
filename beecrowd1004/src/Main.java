import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int a, b, prod;
        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        prod = a * b;

        System.out.println("PROD = "+prod);
    }
}