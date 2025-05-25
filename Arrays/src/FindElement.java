import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to find its index if exists: ");
        int num = sc.nextInt();
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}
