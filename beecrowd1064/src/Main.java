import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        evenNumbers();
    }
    static void evenNumbers(){
        Scanner scan = new Scanner(System.in);
        float number = 0;
        float sum = 0;
        int positives = 0;
        int count = 0;
        float average = 0;

        while(count < 6){
            number = scan.nextFloat();
            if(number > 0){
                positives++;
                sum += number;
            }
            count++;
        }
        scan.close();

        System.out.println(positives + " valores positivos");
        average = sum / positives;
        System.out.printf("%.1f\n", average);
    }
}
