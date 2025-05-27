import java.util.Scanner;

public class DiffOfTwoArrays {
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
//        suppose n2 is greater
        int diff[] = new int[n2];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;
        int c = 0;
        while (k >= 0) {
            int d = 0;
            int arr1Val = 0;
            if (i >= 0) arr1Val = arr1[i];
            else arr1Val = 0;
            if (c + arr2[j] >= arr1Val) {
                d = c + arr2[j] - arr1Val;
                c = 0;

            } else {
                d = c + arr2[j] + 10 - arr1Val;
                c = -1;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] == 0) idx++;
            else break;
        }
        while (idx < diff.length) {
            System.out.println(diff[idx]);
            idx++;
        }
    }
}
