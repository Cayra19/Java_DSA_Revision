public class Pattern_8 {
    public static void main(String[] args) {
        int n = 5;
        int space = 4;
        int star = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*\t");
            }
            space--;
            System.out.println();
        }

    }

}

