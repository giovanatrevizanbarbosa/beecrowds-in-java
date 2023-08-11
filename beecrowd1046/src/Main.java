import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int iniHour, finHour, duracao;

        Scanner scan = new Scanner(System.in);

        iniHour = scan.nextInt();
        finHour = scan.nextInt();
        scan.close();

        duracao = duration(iniHour, finHour);

        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
    }
    static int duration(int iniHour, int finHour){
        if((iniHour >= 0) && (finHour < 24)){
            int totalGame;

            if((iniHour < 12) && (finHour != 0)){
                totalGame = finHour - iniHour;
                return totalGame;
            }else{
                totalGame = 24 - iniHour + finHour;
                return totalGame;
            }
        }
        return 0;
    }
}
