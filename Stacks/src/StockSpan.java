import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr={2,5,9,3,2,12,6,8,7};
        int[] arr1=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        arr1[0]=1;
//        int pos=1;
        st.push(0);
        for(int i=1;i<arr.length;i++) {
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) {
                arr1[i] = i+1;
            }
            else {
                    arr1[i]=i-st.peek();
                }
            st.push(i);
        }

        for(int a:arr1){
        System.out.println(a);}
    }
}
