import java.util.Scanner;

public class AnyBaseAddition {
    public static int add(int num1, int num2, int base) {
        int fNum = 0, quo = 0, pow = 0;
        while (num1 != 0 || num2 != 0 || quo > 0) {
            int rem1 = num1 % 10;
            int rem2 = num2 % 10;
            num1 /= 10;
            num2 /= 10;
            int remSum = rem1 + rem2 + quo;
            quo = remSum / base;
            remSum %= base;
            fNum += remSum * (int) Math.pow(10, pow);
            pow++;
        }
        return fNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter its base: ");
        int base = sc.nextInt();
        System.out.println(add(num1, num2, base));
    }
}
