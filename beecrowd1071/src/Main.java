import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int n1 = 0;
        int n2 = 0;
        int min = 0;
        int max = 0;
        int i = 0;
        int sum = 0;
        
        Scanner scan = new Scanner(System.in);

        n1 = scan.nextInt();
        n2 = scan.nextInt();
        scan.close();

        if(n1 > n2){       
            min = n2;         
            max = n1;         
        }else{
            min = n1;
            max = n2;
        }
        
        i = (min + 1);

        while(i < max){
            if(i % 2 != 0){

                sum = sum + i;

            }
            ++i;
        }
        System.out.println(sum);
    }
}
