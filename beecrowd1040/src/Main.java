import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        float n1, n2, n3, n4, average;

        Scanner scan = new Scanner(System.in);

        n1 = scan.nextFloat();
        n2 = scan.nextFloat();
        n3 = scan.nextFloat();
        n4 = scan.nextFloat();

        average = ((n1*2) + (n2*3) + (n3*4) + (n4*1)) / 10;

        System.out.printf("Media: %.1f\n", average);

        if(average >= 7){
            System.out.println("Aluno aprovado.");
        }else{
            if(average < 5.0){
                System.out.println("Aluno reprovado.");
            }else{
                if(average >= 5.0 && average <= 6.9){
                    float examGrade;
                    System.out.println("Aluno em exame.");
                    examGrade = scan.nextFloat();
                    scan.close();
                    System.out.printf("Nota do exame: %.1f\n", examGrade);
                    average = (average + examGrade) / 2;
                    if(average >= 5){
                        System.out.println("Aluno aprovado.");
                        System.out.printf("Media final: %.1f\n", average);
                    }else{
                        System.out.println("Aluno reprovado.");
                        System.out.printf("Media final: %.1f\n", average);
                    }
                }
            }
        }
    }
}
