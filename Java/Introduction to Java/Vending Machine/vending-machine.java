import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int choice = sc.nextInt();
        switch (choice) {
            case 0:
                System.out.println("Tea");
                break;
            case 1:
                System.out.println("Espresso");
                break;
            case 2:
                System.out.println("Americano");
                break;
            case 3:
                System.out.println("Water");
                break;
            case 4:
                System.out.println("Hot Chocolate");
                break;
            default:
                System.out.println("Invalid");
        }   
    }
}
