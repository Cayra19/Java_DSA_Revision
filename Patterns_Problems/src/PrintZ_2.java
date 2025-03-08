public class PrintZ_2 {
    public static void main(String[] args) {
//        1st method
        for(int i=0;i<=4;i++){
            for(int j=4;j>=0;j--){
                if(i==0||i==4) System.out.print("*");
                else if(i+1==j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
//        2nd method
       /* for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= 4; j++){
                if (i == 0 || i == 4) {
                    System.out.print("* ");
                } else if (i == j + 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        } */

    }
}
