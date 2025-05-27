import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 1st array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of 2nd array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int max = 0;
        if (n1 > n2) max = n1;
        else max = n2;
        int sum[] = new int[max];

//basic sum if equal length
         /*   for (int i = 0; i < n1; i++) {
                sum[i] = arr1[i]+ arr2[i];
            }*/
        int c=0;
        int k=sum.length-1;
        int i=arr1.length-1;
        int j=arr2.length-1;
        while(k>=0){
            int pow=c;
            if(i>=0){
                pow+=arr1[i];
            }
            if(j>=0){
                pow+=arr2[j];
            }
            c=pow/10;
            pow=pow%10;
            sum[k]=pow;
            k--;
            i--;
            j--;
        }
        if(c!=0) System.out.println(c);

        for (int l = 0; l< max; l++) {
            System.out.println(sum[l]);
        }
    }
}
