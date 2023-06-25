import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int num1 = read.nextInt();
       int num2 = read.nextInt();

       //your code goes here

        double pow = Math.pow(num1, num2);
        System.out.println(pow);

       
   }
}
