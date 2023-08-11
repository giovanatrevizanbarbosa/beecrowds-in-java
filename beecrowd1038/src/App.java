import java.util.Scanner;
import java.util.Locale;
public class App{
    public static void main(String[] args){
        double cachorroQuente = 4.0, xSalada = 4.50, xBacon = 5.0, torradaSimples = 2.0, refrigerante = 1.50;
        int code, qtdItem;
        double total = 0;

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        code = scan.nextInt();
        qtdItem = scan.nextInt();
        scan.close();

        switch(code){
            case 1:
                total = cachorroQuente * qtdItem;
                break;
            case 2:
                total = xSalada * qtdItem;
                break;
            case 3:
                total = xBacon * qtdItem;
                break;
            case 4:
                total = torradaSimples * qtdItem;
                break;
            case 5:
                total = refrigerante * qtdItem;
                break;
            default:
                break;
        }

        System.out.printf("Total: R$ %.2f\n", total);
    }
}
