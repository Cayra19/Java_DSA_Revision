import java.util.Scanner;

public class AnyBaseAddition {
    public static int add(int num1, int num2, int base) {
        int fNum = 0, sum = 0, pow = 0, remSum = 0, power = 0;
        while (num1 != 0 && num2 != 0 && remSum!=1) {
            int rem1 = (num1 % 10) + power;
            int rem2 = num2 % 10;
            num1 /= 10;
            num2 /= 10;
            remSum = rem1 + rem2;
            System.out.println(remSum);
            if (remSum >= base) {
                sum = remSum - base;
                power = 1;
            } else {
                sum = remSum;
                power = 0;
            }
            fNum += sum * (int) Math.pow(10, pow);
            if(num1==0 && num2==0 && power==1) fNum+= power* (int) Math.pow(10, pow+1);
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
