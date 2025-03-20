public class Pattern_6 {
    public static void main(String[] args) {
        int row=5;
        int col=6;
        int space=0;
        int star=col/2;
        for(int i=0;i<row;i++){
            for(int j=0;j<star;j++) {
                System.out.print("*\t");
            }
            for(int j=0;j<=space;j++){
                System.out.print("\t");
            }
            for(int j=0;j<star;j++) {
                System.out.print("*\t");
            }
            if(i<row/2){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            System.out.println();
        }
    }
}
