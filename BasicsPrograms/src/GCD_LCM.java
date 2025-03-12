import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter your second number: ");
        int num2=sc.nextInt();
        int oNum1=num1;
        int oNum2=num2;
        if(num1%num2!=0){
            int r=num1%num2;
            num1=r;
        }
        System.out.println("GCD: "+num1);
        System.out.println("LCD: "+(oNum1*oNum2)/num1);
    }
}
