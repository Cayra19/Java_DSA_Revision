public class nPr {
    public static int permutation(int n) {
        int mul = 1;
        for (int i = 1; i <= n; i++) {
            mul *= i;
        }
        return mul;
    }

    public static void main(String[] args) {
        int n = 6, r = 2;
        int nFact = permutation(n);
        int rFact = permutation(n - r);
        System.out.println(n + "P" + r + "= " + nFact / rFact);
    }
}
