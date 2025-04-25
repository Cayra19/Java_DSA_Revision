//combination pattern and formula is iCj+1={iCj * (i-j)}/j+1
public class Pattern_13 {
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            int iCj=1;
            for(int j=0;j<=i;j++){
                System.out.print(iCj+"\t");
                int iCjp1=iCj*(i-j)/(j+1);
                iCj=iCjp1;
            }
            System.out.println();
        }
    }
}
