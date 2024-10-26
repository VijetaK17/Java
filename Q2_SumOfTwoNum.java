import java.util.Scanner;

public class Q2_SumOfTwoNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int Sum = num1 + num2;
            
            System.out.println("Sum of " +  num1  + " and " + num2 + " is " + Sum);
        }
    }
}
