import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;
        int sum = 0;
        int count = 0;

        while (number >= 0) {
            System.out.print("Enter an integer: ");
            number = input.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
            count++;
        }

        double average = (double) sum / count;
        if (count == 0){
            System.out.println("\nError: division by zero.");
        } else {
            DecimalFormat df2 = new DecimalFormat("0.00");
            df2.setGroupingUsed(true);
            df2.setGroupingSize(3);
            System.out.println("\n" + df2.format(average));
        }
        input.close();
    }
}
