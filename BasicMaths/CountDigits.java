package BasicMaths;

public class CountDigits {

    public int countDigits(int n) {

        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }

    public static void main(String[] args) {

        CountDigits obj = new CountDigits();

        System.out.println(obj.countDigits(234));
    }
}
// time complexity: O(log10(N)) 10 because the number is divided by 10
