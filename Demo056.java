import java.util.Scanner;

class Demo056 {
    static int sumOfCubes(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Sum of cubes of digits: " + sumOfCubes(num));
        scanner.close();
    }
}