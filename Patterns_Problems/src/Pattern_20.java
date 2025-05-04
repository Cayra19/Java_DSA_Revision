public class Pattern_20 {
    public static void main(String[] args) {
        int num=5;
        int mid=num/2;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(j==0||j==num-1) System.out.print("*\t");
               else if(i>=mid){
                   if(i==j||i+j==num-1) System.out.print("*\t");
                   else System.out.print("\t");
                }
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
}
