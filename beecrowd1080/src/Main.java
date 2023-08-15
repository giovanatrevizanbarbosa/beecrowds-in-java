import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int value, i = 1, greater = 0, firstRead = 1, position = 0;

        Scanner scan = new Scanner(System.in);

        while (i <= 100) {
    
            value = scan.nextInt();
    
            if (value >= 0) {
    
                if (firstRead == 1) {
    
                    greater = value;
                    firstRead = 0;
    
                }
    
                if (value > greater) {
    
                    greater = value;
                    position = i;
    
                }
                i++;
            }
        }
        scan.close();
        System.out.println(greater);
        System.out.println(position);
    }
}
