import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception{
        int a, b, c, d;

        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();

        scan.close();
        
        if(a % 2 == 0){
            if((c >= 0) && (d >=0)){
                if((b > c) && (d > a)){
                    if((c + d) > (a + b)){
                        System.out.println("Valores aceitos");
                    }else{
                        System.out.println("Valores nao aceitos");
                    }
                }else{
                    System.out.println("Valores nao aceitos");
                }
            }else{
                System.out.println("Valores nao aceitos");
            }
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
}
