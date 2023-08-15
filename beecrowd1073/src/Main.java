import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int i = 0;
        int num = 1;
        int power;
        int value;

        Scanner scan = new Scanner(System.in);
        value = scan.nextInt();
        scan.close();

        if((value < 2000) && (value > 5)){
            while(i < value){
                if(num % 2 == 0){
                    power = (int)Math.pow(num, 2);
                    System.out.println(num + "^2 = " + power);
                }
                i++;
                num++;
            }
        }
    }
}
