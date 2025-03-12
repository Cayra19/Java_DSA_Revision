import java.util.Scanner;
public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=2;i*i<=num;i++){
            while(num%i==0) {
                System.out.print(i+" ");
                num/=i;
            }
        }
        if(num!=1) System.out.println(num);
    }
}
