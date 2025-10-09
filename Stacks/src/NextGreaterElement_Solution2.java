import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement_Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        int[] arr1 = new int[arr.length];
        arr1[arr.length-1]=-1;
        st.push(arr.length - 1);
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0){
                arr1[i] = -1;
            }
            else{
                arr1[i]=arr[st.peek()];
        }
            st.push(i);
    }
//        while(st.size()!=0){
//            int idx=st.peek();
//            arr1[idx]=-1;
//            st.pop();
//        }
        for(int ar:arr1) {
            System.out.print(ar+" ");
        }

    }
}
