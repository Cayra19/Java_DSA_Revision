import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int lar = 0, lar2 = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        lar = arr[0];
        lar2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lar) lar = arr[i];
            if (arr[i] < lar2) lar2 = arr[i];
        }
        System.out.println(lar - lar2); // printing greatest-smallest=span of an array
    }

}
