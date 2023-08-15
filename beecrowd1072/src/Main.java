import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int i = 0;
        int in = 0; 
        int out = 0;
        int readQnt = 0;

        Scanner scan = new Scanner(System.in);
        readQnt = scan.nextInt();
        
        while(i < readQnt){
            int num = 0;
            num = scan.nextInt();
            
            if((num >= 10) && (num <= 20)){
                in++;
            }else{
                out++;
            }
            i++;
        }
        scan.close();
        
        System.out.println(in+" in");
        System.out.println(out+" out");
    }
}