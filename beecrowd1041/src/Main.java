import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        float x, y;

        Scanner scan = new Scanner(System.in);

        x = scan.nextFloat();
        y = scan.nextFloat();
        scan.close();

        if((x == 0) && (y == 0)){
            System.out.printf("Origem\n");
        }else{
            if((x == 0) && (y != 0)){
                System.out.printf("Eixo Y\n");
            }else{
                if((y == 0) && (x != 0)){
                    System.out.printf("Eixo X\n");
                }else{
                    if(x > 0){
                        if(y > 0){
                            System.out.printf("Q1\n");
                        }else{
                            System.out.printf("Q4\n");
                        }
                    }else{
                        if(y > 0){
                            System.out.printf("Q2\n");
                        }else{
                            System.out.printf("Q3\n");
                        }
                    }
                }
            }
        }
    }
}
