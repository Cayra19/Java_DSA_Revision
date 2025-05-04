public class Pattern_19 {
    public static void main(String[] args) {
        int num = 5;
        int mid = num / 2;
        for (int a = 0; a < num; a++) {
            for(int i=0;i<num;i++){
                if(a==0){
                 if(i<=mid||i==num-1) System.out.print("*\t");
                 else System.out.print("\t");
                }
                else if(a<mid){
                    if(i==mid||i==num-1) System.out.print("*\t");
                    else System.out.print("\t");
                }
                else if(a==mid) System.out.print("*\t");
                else if(a<num-1){
                    if(i==0||i==mid) System.out.print("*\t");
                    else System.out.print("\t");
                }
                else{
                    if(i==0||i>=mid) System.out.print("*\t");
                    else System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}

