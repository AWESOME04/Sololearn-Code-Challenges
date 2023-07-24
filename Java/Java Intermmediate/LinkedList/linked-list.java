import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> words = new LinkedList<String>();

        while (words.size() < 5) {
            String word = scanner.nextLine();
            words.add(word);
        }

        // Output words with length more than 4 characters
        for (String word : words) {
            if (word.length() > 4) {
                System.out.println(word);
            }
        }
    }
}
