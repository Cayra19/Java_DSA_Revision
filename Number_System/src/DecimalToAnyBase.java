import java.util.Scanner;

public class DecimalToAnyBase {
    public static int convertDec(int num, int base) {
        int pow = 0, fNum = 0;
        int quo = 0;
        while (num >= 1) {
            int rem = num % base;
            quo = num / base;
            num = quo;
            fNum = fNum + (rem * (int) Math.pow(10, pow));
            pow++;
        }
        return fNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.print("Enter any base: ");
        int base = sc.nextInt();

        System.out.println(convertDec(num,base));
    }
}
