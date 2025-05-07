public class nPr {
    public static void main(String[] args) {
        int n=5,r=2,nFact=1;
        for(int i=1;i<=n;i++){
            nFact*=i;
        }
        int rFact=1;
        for(int i=1;i<=(n-r);i++){
            rFact*=i;
        }
        System.out.println("nPr = "+nFact/rFact);
    }
}
