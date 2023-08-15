import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int test, frogs = 0, mouses = 0, rabbits = 0;
        float total = 0;
        char tGp;
        int qGp = 0;

        Scanner scan = new Scanner(System.in);

        test = scan.nextInt();
        
        int i = 0;
        while(i < test){
            qGp = scan.nextInt();
            tGp = scan.next().charAt(0);

            if((qGp >= 1) && (qGp <= 15)){

                switch (tGp){
                    case 'C':
                        rabbits += qGp;
                        break;
                    case 'R':
                        mouses += qGp;
                        break;
                    case 'S':
                        frogs += qGp;
                        break;
                    default:
                        break;
                }
            }
            i++;
        }
        scan.close();

        total = frogs + mouses + rabbits;

        System.out.printf("Total: %.0f cobaias\n", total);
        System.out.println("Total de coelhos: "+rabbits);
        System.out.println("Total de ratos: "+mouses);
        System.out.println("Total de sapos: "+frogs);
        System.out.printf("Percentual de coelhos: %.2f %%\n", ((float)rabbits / total) * 100);
        System.out.printf("Percentual de ratos: %.2f %%\n", ((float)mouses / total) * 100);
        System.out.printf("Percentual de sapos: %.2f %%\n", ((float)frogs / total) * 100);
    }
}
