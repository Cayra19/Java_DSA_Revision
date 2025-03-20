public class Pattern_7 {
    public static void main(String[] args) {
       /* int space=0;
        int star=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<space;j++){
                System.out.print("\t");
            }
            for(int j=0;j<star;j++){
                System.out.print("*\t");
            }
            space++;
            System.out.println();
        } */

//        2nd approach
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) System.out.print("*");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
}
