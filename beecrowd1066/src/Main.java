import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int n, odd = 0, even = 0, pos = 0, neg = 0;
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            n = scan.nextInt();

            if(n == 0){
                even++;
            }else{
                if(n > 0){
                    pos++;
                }else{
                    neg++;
                }
                if(n % 2 == 0){
                    even++;
                }else{
                    odd++;
                }
            }
        }
        scan.close();
        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
    }
}