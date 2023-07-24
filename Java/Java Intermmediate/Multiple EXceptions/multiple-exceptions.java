import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    try {
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
			System.out.println(num1/num2);
	        /*
	        1. Error: division by zero
	        2. Error: wrong value type
	        */
	        //your code goes here
	    } catch(ArithmeticException ex) {
			System.out.println("Error: division by zero");	        
	    } catch(InputMismatchException ex){
			System.out.println("Error: wrong value type");
	    }
	}
}
