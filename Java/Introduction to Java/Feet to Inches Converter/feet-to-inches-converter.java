import java.util.Scanner;

public class Program {
    //your code goes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double foot = sc.nextDouble(); 
        convert(foot);
    }    

    static void convert(double foot){
        System.out.println(foot * 12);
    }
        
    
}
