import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static int convertDecimal(int num,int base,int base1){
        int fNum=0,pow=0,dec=0,ffNum=0;
        while(num>0){
            int rem=num%10;
            fNum+=rem*(int)Math.pow(base,pow);
            num/=10;
            pow++;
        }
        dec=fNum;
        pow=0;
//        System.out.println(dec);
        while (dec >0) {
            int rem = dec % base1;
            dec /= base1;
            ffNum += rem * (int) Math.pow(10, pow);
            pow++;
        }
        return ffNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.print("Enter its base: ");
        int base = sc.nextInt();
        System.out.print("Enter base to convert: ");
        int base1 = sc.nextInt();
        System.out.println(convertDecimal(num,base,base1));
    }
}
