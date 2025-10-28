import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        int[] arr={6,2,5,4,5,1,6};
        int[] lb=new int[arr.length];
        int[] rb=new int[arr.length];
        Stack<Integer> st=new Stack<>();

//        NSE index on RIGHT
        st.push(0);
       for(int i=1;i<arr.length;i++) {
           while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
               int idx = st.peek();
               rb[idx] = i;
               st.pop();
           }
           st.push(i);
       }
           while(!st.isEmpty()){
               int idx=st.peek();
               rb[idx]=arr.length;
               st.pop();
           }
           for(int ar:rb){
        System.out.print(ar+" ");
           }
        System.out.println();

//           NSE index on LEFT
        st.push(0);
           lb[0]=-1;
        for(int i=1;i<arr.length;i++) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if(st.isEmpty()) lb[i]=-1;
            else{
                lb[i]=st.peek();
            }
            st.push(i);
        }
        for(int ar:lb){
            System.out.print(ar+" ");
        }
        System.out.println();

//        calculating largest area
        int maxArea=0;
        for(int i=0;i<arr.length;i++){
            int len=rb[i]-lb[i]-1;
            int area=arr[i]*len;
//            System.out.println(area);
            if(area>maxArea) maxArea=area;
        }
        System.out.print(maxArea+" ");
        System.out.println();
       }
    }

