import java.util.Scanner;

class Demo057 {
    static int sumOfFirstLast(int num) {
        int lastDigit = num % 10;
        while (num >= 10) {
            num /= 10;
        }
        int firstDigit = num;
        return firstDigit + lastDigit;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Sum of first and last digits: " + sumOfFirstLast(num));
        scanner.close();
    }
}