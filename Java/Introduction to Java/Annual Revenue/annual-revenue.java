public class Program {
    public static void main(String[] args) {
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        double sum = 0;
        int length_of_array = revenue.length;

        for(double x: revenue){
            sum += x;
        }
        System.out.println(sum/length_of_array);
       
    }
}
