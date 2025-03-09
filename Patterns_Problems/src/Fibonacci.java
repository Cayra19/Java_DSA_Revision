import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter upto how many nos you want to print: ");
        int n=sc.nextInt();
        int n1=0;
        int n2=1;

        /*System.out.print(n1+" "+n2+" ");
        while(n!=0){
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3+" ");
            n--;
        } */
        for(int i=0;i<n;i++){
            System.out.print(n1+" ");
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }

    }
}
