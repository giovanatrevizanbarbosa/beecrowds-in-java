import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        double a, b, c, avg;
        Scanner scan = new Scanner(System.in);

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        avg = ((a*2) + (b*3) + (c*5)) / 10.0;

        System.out.printf("MEDIA = %.1f\n", avg);
    }
}