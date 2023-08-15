import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int number = 0;
        int count = 1;

        Scanner scan = new Scanner(System.in);

        number = scan.nextInt();
        scan.close();

        if((number >= 1) && (number <= 1000)){

            while(number >= count){
                if (count % 2 != 0) {
                    System.out.println(count);
                }
                count++;
            }
        }
    }
}
