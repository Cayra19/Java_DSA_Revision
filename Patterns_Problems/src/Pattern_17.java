import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num=sc.nextInt();
        int mid=num/2;
        System.out.println(mid);
        int star=0;
        for(int i=0;i<num;i++){
            if(i==mid) {
                for(int j=0;j<num;j++){
                    System.out.print("*\t");
                }
            }
            else {
                for (int j = 0; j < mid; j++) {
                    System.out.print("\t");
                }
                for (int j = 0; j <= star; j++) {
                    System.out.print("*\t");
                }
            }
            if(i<mid){
                star++;

            }
            else star--;
            System.out.println();
        }
    }
}
