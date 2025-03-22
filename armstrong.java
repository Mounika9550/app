import java.util.Scanner;

public class armstrong {
    public static boolean isArmstrong(int number) {
        int sum = 0;
        int temp = number;
        int numberOfDigits = String.valueOf(number).length();
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numberOfDigits);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}