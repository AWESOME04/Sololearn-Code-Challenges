import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);
        
        LinkedList<Integer> nums = new LinkedList<Integer>();
        
        while(nums.size()<5){
            int num = scanner.nextInt();
            nums.add(num);
        }
        
        
        int sum = 0;
        //your code goes here
        for (int s: nums){
            sum += s;
        }
        
        System.out.println(sum);
    }
}
