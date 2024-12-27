public class Palindrome {

    public static void main(String[] args) {
        int num = 7887;

        System.out.print(isPalindrome(num));
    }

    public static boolean isPalindrome(int num){
        int rev = 0;
        int temp = num;
        while(temp !=0){
            int ld = temp%10;
            rev = rev*10+ld;
            temp = temp/10;
        }

        return (rev==num);
    }
}
