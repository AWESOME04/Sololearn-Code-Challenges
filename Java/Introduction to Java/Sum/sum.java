import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int total = 0;

        while(num > 0 ){
            total+= num--;
        }
        System.out.println(total);
    }

}
