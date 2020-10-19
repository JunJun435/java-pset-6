import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        do {
            System.out.print("Enter an integer: ");
            number = input.nextInt();
        } while (number < 1 || number > 92);

        int a = 0;
        int b = 1 ;
        int c = 1;

        for(int i = 2; i < number; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        DecimalFormat df2 = new DecimalFormat("#.##");
        df2.setGroupingUsed(true);
        df2.setGroupingSize(3);

        System.out.println("\n" + df2.format(c) + ".");

        input.close();
    }
}
