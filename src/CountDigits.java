public class CountDigits {

    public static void main(String[] args) {
            int x = 9235;
        System.out.println("Number of digits present in : "+x+" is : "+countDigits(x));
    }

    public static int countDigits(int num){
        int numberOfDigits = 0;
        while(num>0){
            num =num/10;
            numberOfDigits++;
        }
        return numberOfDigits ;
    }
}
