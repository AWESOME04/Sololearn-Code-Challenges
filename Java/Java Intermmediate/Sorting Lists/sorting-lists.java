import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[ ] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        Scanner scanner = new Scanner(System.in);
        
        while(nums.size()<5){
            int num = scanner.nextInt();
            //your code goes here
            nums.add(num);

            
        }
        
        //your code goes here
        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));
    }
}
