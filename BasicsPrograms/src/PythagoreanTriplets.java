import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter your second number: ");
        int num2=sc.nextInt();
        System.out.print("Enter your third number: ");
        int num3=sc.nextInt();
        int max=Math.max(num1,(Math.max(num2,num3)));
        if(max*max==num1*num1+num2*num2) System.out.println("A pythagorean Triplet");
        else if(max*max==num3*num3+num2*num2) System.out.println("A pythagorean Triplet");
        else if(max*max==num1*num1+num3*num3) System.out.println("A pythagorean Triplet");
        else  System.out.println("Not A pythagorean Triplet");

    }
}
