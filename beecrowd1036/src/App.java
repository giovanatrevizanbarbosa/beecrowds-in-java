import java.util.Scanner;

public class App{
    public static void main(String[] args){
        double a, b, c, x1, x2, det;

        Scanner scan = new Scanner(System.in);

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        scan.close();

        det = (b*b) - (4*a*c);

        if((det < 0) || (a == 0)){
            System.out.println("Impossivel calcular");
        }else{
            x1 = (-b + Math.sqrt(det)) / (2*a);
            x2 = (-b - Math.sqrt(det)) / (2*a);
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        }

    }
}
