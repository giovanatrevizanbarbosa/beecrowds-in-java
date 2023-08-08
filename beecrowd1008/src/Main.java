import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        double salarioFixo, totalVendas, novoSalario;
        String nomeFuncionario;

        Scanner scan = new Scanner(System.in);

        nomeFuncionario = scan.next();
        salarioFixo = scan.nextDouble();
        totalVendas = scan.nextDouble();
        
        double comissao = totalVendas * 0.15;

        novoSalario = salarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f\n", novoSalario);

        scan.close();
    }
}