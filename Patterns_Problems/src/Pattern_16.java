public class Pattern_16 {
    public static void main(String[] args) {
        int is=5,num=1;   //5=2n-1
        for(int i=0;i<4;i++){
            for(int j=1;j<=num;j++){
                System.out.print(j+"\t");
            }
            for(int j=0;j<is;j++){
                System.out.print("\t");
            }
            if(i==4-1) num--;
            for(int j=num;j>=1;j--){
                System.out.print(j+"\t");
            }
            num++;
            is-=2;
            System.out.println();
        }
    }
}
