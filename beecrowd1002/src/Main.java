import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // área de uma circunferência é: area = π . (raio*raio)
        double area, pi, raio;
        pi = 3.14159;
        
        Scanner scan = new Scanner(System.in);

        raio = scan.nextDouble();
        scan.close();

        area = pi * (raio * raio);

        System.out.printf("A=%.4f\n", area);

    }
}
