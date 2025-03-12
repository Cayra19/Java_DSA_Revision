import java.util.Scanner;

public class InverseOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  //25413
        int count = 1;
        int newNum = 0;
        while (num > 0) {
            int rem = num % 10;
            int mul = (int) Math.pow(10, rem - 1);
            newNum += count * mul;
            num /= 10;
            count++;
        }
        System.out.println(newNum);   //43152
    }
}
