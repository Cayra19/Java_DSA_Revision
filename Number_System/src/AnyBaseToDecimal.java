import java.util.Scanner;

public class AnyBaseToDecimal {
    public static int convert(int decimal,int base){
        int fNum=0,pow=0;
        while(decimal>0){
            int rem=decimal%10;
            fNum+=rem*(int)Math.pow(base,pow);
            decimal/=10;
            pow++;

        }
        return fNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int decimal = sc.nextInt();
        System.out.print("Enter its base: ");
        int base = sc.nextInt();
        System.out.println(convert(decimal,base));
    }
}
