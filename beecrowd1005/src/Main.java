import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        double a, b, avg;
        Scanner scan = new Scanner(System.in);

        a = scan.nextDouble();
        b = scan.nextDouble();

        avg = ((a*3.5) + (b*7.5)) / 11.0;

        System.out.printf("MEDIA = %.5f\n", avg);
    }
}