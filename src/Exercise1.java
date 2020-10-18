import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lower bound: ");
        int lower = input.nextInt();

        int upper;
        do {
            System.out.print("Upper bound: ");
             upper = input.nextInt();
        } while (upper < lower);

        int sum = 0;
        for (int x = lower; x <= upper ; x++ ){
            if (x % 2 == 0){
                sum += x;
            }
        }
        DecimalFormat df2 = new DecimalFormat("#.##");
        df2.setGroupingUsed(true);
        df2.setGroupingSize(3);
        System.out.println("\n" + df2.format(sum) + ".");

        input.close();
    }
}
