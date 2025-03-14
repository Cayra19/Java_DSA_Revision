public class Pattern_4 {
    public static void main(String[] args) {
        int space =1 ;
        int star = 5 - 1;
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k <space; k++) {
                System.out.print("\t");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*\t");
            }
            space++;
            star--;
            System.out.println();
        }
    }
}
