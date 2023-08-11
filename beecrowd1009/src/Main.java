import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int numeroFuncionario, horasTrabalhadas;
        float valorPorHora, salario;

        Scanner scan = new Scanner(System.in);

        numeroFuncionario = scan.nextInt();
        horasTrabalhadas = scan.nextInt();
        valorPorHora = scan.nextFloat();

        scan.close();

        salario = horasTrabalhadas * valorPorHora;

        System.out.printf("NUMBER = %d\n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}