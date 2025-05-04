public class Pattern_18 {
    public static void main(String[] args) {
        int spaces = 0, stars = 7;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < stars; j++) {
                if (i > 0 && i < 7 / 2 && j > 0 && j < stars - 1) {
                    System.out.print("\t");
                } else System.out.print("*\t");
            }
            if (i < 7 / 2) {
                spaces++;
                stars -= 2;
            } else {
                spaces--;
                stars += 2;
            }
            System.out.println();
        }

    }
}
