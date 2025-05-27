import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) max = arr[i];
        }
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (arr[j] >= i) System.out.print("*\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }

}
