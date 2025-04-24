public class Pattern_10 {
    public static void main(String[] args) {
        int os=5/2,is=-1;
        for(int i=0;i<5;i++){
//            System.out.println(os+" "+is);
            for(int j=1;j<=os;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int k=1;k<=is;k++){
                System.out.print("\t");
            }
            if(i>0 && i<4) System.out.print("*\t");
            if(i<2){
                os--;
                is+=2;
            }else{
                os++;
                is-=2;
            }
            System.out.println();
        }
    }
}
