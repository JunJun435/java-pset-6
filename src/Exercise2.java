import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        do{
            System.out.print("Enter an integer: ");
            number = input.nextInt();
        } while (number <= 0);

        System.out.println(" ");

        while (number > 0) {
            int output = number % 10;
            if ((number / 10) == 0) {
                System.out.print(output + ".");
                number /= 10;
            } else {
                System.out.print(output + ", ");
                number /= 10;
            }
        }
    }
}
