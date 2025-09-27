import java.util.Scanner;
import java.util.Stack;

public class Duplicate_Brackets {
    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        Scanner sc=new Scanner(System.in);
        String exp=sc.nextLine();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch==')'){
                if(st.peek()=='('){
                    System.out.println(true);
                    return;
                }
                while(st.peek()!='('){
                    st.pop();
                }
                st.pop();
            }else {
                st.push(ch);
            }
        }
        System.out.println(false);
    }
}

