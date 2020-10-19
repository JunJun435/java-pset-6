
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        do {
            System.out.print("Enter an integer: ");
            number = input.nextInt();
        } while (number <= 0);

        int sum = 0;

        while (number > 0) {
            int output = number % 10;
            if (output % 2 == 1) {
                sum += output;
            }
            number /= 10;
        }
        DecimalFormat df2 = new DecimalFormat("#.##");
        df2.setGroupingUsed(true);
        df2.setGroupingSize(3);

        System.out.println("\n" +df2.format(sum) + ".");
        input.close();
    }
}
