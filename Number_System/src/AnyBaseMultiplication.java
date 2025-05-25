import java.util.Scanner;

public class AnyBaseMultiplication {
    public static int oneDigitMultiply(int num1,int r2,int base){
        int fNum=0,quo=0,pow = 0,rem=0;
        while (num1 != 0 || quo > 0) {
             int r1=num1%10;
             num1/=10;
            int mul = r1 * r2;
            int num = mul + quo;
            quo = num / base;
            rem=num%base;
            fNum += rem * (int) Math.pow(10, pow);
            pow++;
        }
        return fNum;
    }
    public static int getSum(int num1, int num2, int base) {
        int fNum = 0, quo = 0, pow = 0,rem=0;
        while (num1 != 0|| num2 != 0 || quo > 0 ) {
            int r1 = num1 % 10;
            int r2 = num2 % 10;
            num1/=10;
            num2/=10;
            int add= r1 + r2;
            int num = add + quo;
            quo = num / base;
            rem=num%base;
            fNum += rem * (int) Math.pow(10, pow);
            pow++;
        }
        return fNum;
    }

    public static int getMultiply(int num1,int num2,int base) {
        int fNum=0,pow=0;
        while(num2>0){
            int r2=num2%10;
            num2/=10;
            int mulOneDigit=oneDigitMultiply(num1,r2,base);
            fNum=getSum(fNum,mulOneDigit*(int) Math.pow(10, pow),base);
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
        System.out.println(getMultiply(num1, num2, base));
    }
}
