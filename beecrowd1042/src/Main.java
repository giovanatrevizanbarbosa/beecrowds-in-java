import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        float a, b, c;

        Scanner scan = new Scanner(System.in);

        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();
        scan.close();

        if(isTriangle(a, b, c)){
            calcPerimeter(a, b, c);
        }else{
            calcArea(a, b, c);
        }
    }

    static boolean isTriangle(float a, float b, float c){
        if((a - b < c) && (a - c < b) && (b - c < a)){
            return true;
        }else{
            return false;
        }
    }

    static void calcArea(float a, float b, float c){
        float area = ((a + b) * c) / 2;
        System.out.printf("Area = %.1f\n", area);
    }
    static void calcPerimeter(float a, float b, float c){
        float perimeter = a + b + c;
        System.out.printf("Perimetro = %.1f\n", perimeter);
    }
}