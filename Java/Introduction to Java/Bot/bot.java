import java.util.Scanner;

public class Program {
    //your code goes here
    /*
    User message: "1", Reply: "Order confirmed"
    User message: "2", Reply: "info@sololearn.com"
    For any other number, the reply should be: "Try again". 
    */
    static void bot(){
        Scanner sc = new Scanner(System.in);
        int message = sc.nextInt();
        if(message == 1){
            System.out.println("Order confirmed");
        }
        else if(message == 2){
            System.out.println("info@sololearn.com");
        }
        else{
            System.out.println("Try again");
        }
    }
    public static void main(String[] args) {
        bot();
    }
}
