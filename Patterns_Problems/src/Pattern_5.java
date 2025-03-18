public class Pattern_5 {
    public static void main(String[] args) {
        int n=5;
        int star=1;
        int space=n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++) {
                System.out.print("\t");
            }
            for(int k=0;k<star;k++) {
                System.out.print("*\t");
            }
                if(i<n/2){
                    space--;
                    star+=2;
                }
                else{
                    space++;
                    star-=2;
                }

            System.out.println();
            }


        }
    }

