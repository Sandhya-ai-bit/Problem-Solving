public class palindrome {
    public boolean PalindromeNum(int n) {
        int reverse = 0;
        int lastdigit;
        int dup = n;
        while (n > 0) {
            lastdigit = n % 10;
            reverse = (reverse * 10) + lastdigit;
            n = n / 10;
        }
        if (dup == reverse) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        palindrome obj = new palindrome();

        System.out.println(obj.PalindromeNum(77));
    }
}
// Time Complexity: O(log10N + 1)
