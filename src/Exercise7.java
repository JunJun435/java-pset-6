import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        do {
            System.out.print("Enter an integer: ");
            number = input.nextInt();
        } while (number <= 0);


        System.out.print("\n1, " + number);

        for( int i = 2; i <= (number / i); i++ ) {

            if (number % i == 0) {
                int divisible = number / i;
                System.out.print( ", " + i + ", " + divisible);
            }
        }
        System.out.print(".");
        input.close();
    }
}
