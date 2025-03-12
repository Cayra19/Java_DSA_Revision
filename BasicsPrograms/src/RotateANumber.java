import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args) {
        // we need a multiplier and divisor.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.print("Enter nth rotation: ");
        int k=sc.nextInt();
        int t=num;
        int length=0;
        while(t!=0){
            t/=10;
            length++;
        }
        k%=length;
        if(k<0) k+=length;
        int div=(int)Math.pow(10,k);
        int q=num/div;
        int rem=num%div;
        int count=0;
        int temp=q;
        while(temp>0){
            temp/=10;
            count++;
        }
        int newNum=rem*(int)Math.pow(10,count)+q;
        System.out.println(newNum);

    }
}
