public class Pattern_11 {
    public static void main(String[] args) {
        int num=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num+"\t");
                num++;
            }

            System.out.println();
        }
    }
}
