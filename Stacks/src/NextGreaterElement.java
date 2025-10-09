import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        int[] arr1=new int[arr.length];
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                int idx=st.peek();
                arr1[idx]=arr[i];
                st.pop();
            }
             st.push(i);
        }
        while(st.size()!=0){
            int idx=st.peek();
            arr1[idx]=-1;
            st.pop();
        }
        for(int ar:arr1) {
            System.out.print(ar+" ");
        }

    }
}
