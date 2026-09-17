public class CountDigits {

    public int countDigits(int n) {

        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10; // no. of times it is divible by 10 , is the count of digits
        }

        return count;
    }

    public static void main(String[] args) {

        CountDigits obj = new CountDigits();

        System.out.println(obj.countDigits(234));
    }
}
// time complexity: O(log10(N))