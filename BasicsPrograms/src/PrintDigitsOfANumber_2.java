import java.util.Scanner;

public class PrintDigitsOfANumber_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num=sc.nextInt();
//        reverse of a number
  /*      int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println(rev);
//        printing digits of a number from left to right ->to print in this order we need to reverse the number first
        while(rev!=0){
            int rem=rev%10;
            System.out.println(rem);
            rev/=10;
        } */

//        without reversing the number
        int temp=num;
        int count =0;
        while(temp!=0){
             temp=temp/10;
             count++;
        }
//        System.out.println(count);
        int div=(int)Math.pow(10,count-1);
        while(div!=0){
            int q=num/div;
            System.out.println(q);
            num%=div;
            div/=10;
        }
    }
}
