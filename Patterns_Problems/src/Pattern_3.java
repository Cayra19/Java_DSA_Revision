public class Pattern_3 {
    public static void main(String[] args) {
        int space=5-1;
        int star=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<space;j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <=star; k++) {
                    System.out.print("*\t");
                }
            space--;
            star++;
            System.out.println();
        }
        }
    }

