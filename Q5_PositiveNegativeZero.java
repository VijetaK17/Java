
import java.util.Scanner;

public class Q5_PositiveNegativeZero {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Number is zero.");
        } else if (num > 0) {
            System.out.println("Positive Number.");
        } else {
            System.out.println("Negative Number.");
        }
    }
}
