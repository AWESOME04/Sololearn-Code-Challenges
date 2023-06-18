import java.util.Scanner;

public class Program {
    //your code goes here
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble(); 

        System.out.println(fahr(c));
    }

    static double fahr(double c){
        double res= 1.8 * c + 32;
        return res;
    }
}
