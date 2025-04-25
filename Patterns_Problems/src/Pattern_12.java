public class Pattern_12 {
    public static void main(String[] args) {
        int num=0,fibo=1;
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num+"\t");
                int fFibo=fibo+num;
                num=fibo;
                fibo=fFibo;

            }
            System.out.println();
        }
    }
}
