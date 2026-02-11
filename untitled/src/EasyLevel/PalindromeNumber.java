package EasyLevel;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }
    private static boolean isPalindrome(int x) {
        if(x <= 0 ) return false;
        int y = x;
        int saved = 0;
        while(x != 0){

            saved = saved*10 + x%10;
            x /= 10;
        }
        return saved == y;
    }
}

