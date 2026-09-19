public class ReverseNum {
    public void ReverseNumber(int n) {
        int reverse = 0;
        while (n > 0) {
            int lastdigit;
            lastdigit = n % 10;
            n = n / 10;
            reverse = (reverse * 10) + lastdigit;
        }
        System.out.print(reverse);
    }

    public static void main(String[] args) {

        ReverseNum obj = new ReverseNum();

        obj.ReverseNumber(7789);
    }
}
