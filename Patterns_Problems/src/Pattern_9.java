public class Pattern_9 {
    public static void main(String[] args) {
        int space=0;
        int space1=3;
        int star=1;
        for(int i=0;i<5;i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || i + j == 4) System.out.print("*\t");
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
}
