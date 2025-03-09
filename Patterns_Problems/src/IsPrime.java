import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter how many numbers you want to check:");
//        int inp = sc.nextInt();
        /* while (inp > 0) {
            int num = sc.nextInt();
            boolean flag = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println("Prime");
            else System.out.println("not prime");
            inp--;
        } */

//Less time complexity
     /*   while (inp > 0) {
            int num = sc.nextInt();
            int count=0;
            for (int i = 2; i*i < num; i++) {   //need to divide till square root of the num
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count==0) System.out.println("Prime");
            else System.out.println("not prime");
            inp--;
        } */


//print all prime numbers between low and high values
        int low = sc.nextInt();
        int high = sc.nextInt();
        for (int i = low; i <= high; i++) {
            int count = 0;
            for (int div = 2; div * div < i; div++) {
                if (i % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) System.out.println(i+" is a Prime");
//            else System.out.println(i+" is Not a Prime");
        }


    }
}




