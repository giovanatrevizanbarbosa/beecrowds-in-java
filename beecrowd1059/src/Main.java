public class Main{
    public static void main(String[] args) throws Exception{
        evenNumbers();
    }
    static void evenNumbers(){
        int i = 1;
        int num = 1;
        while (i <= 100) {
            if (num % 2 == 0) {
               System.out.println(num);
            }
            i++;
            num++;
        }
    }
}
