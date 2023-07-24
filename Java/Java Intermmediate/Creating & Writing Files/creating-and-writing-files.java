import java.io.File;
import java.util.Scanner;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Formatter f = new Formatter("tasks.txt");
            int count = 0;
            while (count < 3) {
                String task = input.nextLine();
                f.format("%s%n", task);
                count++;
            }
            f.close();
            
            File x = new File("tasks.txt");
            Scanner sc = new Scanner(x);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
