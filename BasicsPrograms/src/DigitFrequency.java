public class DigitFrequency {
    public static void main(String[] args) {
        int num=908900979,dig=0,count=0;
        while(num>0){
            int rem=num%10;
            if(rem==dig) count++;
            num/=10;
        }
        System.out.println(count);
    }
}
