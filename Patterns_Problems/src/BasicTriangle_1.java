public class BasicTriangle_1 {
    public static void main(String[] args) {
        System.out.println("*\n* *\n* * *\n* * * *");
        System.out.println("using for loop");
        for(int i=0;i<6;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
