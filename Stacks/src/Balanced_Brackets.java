import java.util.Scanner;
import java.util.Stack;

public class Balanced_Brackets {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val=closingCases(st,'(');
                if(val==false){
                    System.out.println(val);
                    return;
                }
            } else if(ch=='}'){
                boolean val=closingCases(st,'{');
                if(val==false){
                    System.out.println(val);
                    return;
                }
            }else if(ch==']'){
                boolean val=closingCases(st,'[');
                if(val==false){
                    System.out.println(val);
                    return;
                }
            }
        }
        if(st.size()==0) System.out.println(true);
        else System.out.println(false);
    }
        public static boolean closingCases(Stack<Character> st,char closingChar){
            if (st.size() == 0) {
                return false;
            }
            else if(st.peek()!=closingChar){
                return false;
            }
            else{
                st.pop();
                return true;
            }
        }

}
