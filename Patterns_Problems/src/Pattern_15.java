public class Pattern_15 {
    public static void main(String[] args) {
        int space=2,star=1,num=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<space;j++){
                System.out.print("\t");
            }
            int fnum=num;
            for(int j=0;j<star;j++){
                System.out.print(fnum+"\t");
                if(j<star/2)  fnum++;
                else fnum--;

            }
            if(i<2){
                space--;
                star+=2;
                num++;

            }
            else{
                space++;
                star-=2;
                num--;
            }

            System.out.println();
        }

    }
}
