import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        float n1, n2, n3, n4, n5, n6 = 0;
        int positives = 0;

        Scanner scan = new Scanner(System.in);
        n1 = scan.nextFloat();
        n2 = scan.nextFloat();
        n3 = scan.nextFloat();
        n4 = scan.nextFloat();
        n5 = scan.nextFloat();
        n6 = scan.nextFloat();

        scan.close();

        if(n1 > 0){
            positives++;
        }
        if(n2 > 0){
            positives++;
        }
        if(n3 > 0){
            positives++;
        }
        if(n4 > 0){
            positives++;
        }
        if(n5 > 0){
            positives++;
        }
        if(n6 > 0){
            positives++;
        }
         
        System.out.println(positives + " valores positivos");
    }
}