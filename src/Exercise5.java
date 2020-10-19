import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        do {
            System.out.print("Enter an integer: ");
            number = input.nextInt();
        } while (number < 0);

        if (number == 0 || number == 1){
            System.out.println("\nNot Prime.");
        } else {
            for (int i = 2; i <= number; i++) {
                if ( i == number) {
                    System.out.println("\nPrime.");
                    break;
                }
                if (number % i == 0) {
                    System.out.println("\nNot Prime.");
                    break;
                }
            }
        }
        input.close();
    }
}
