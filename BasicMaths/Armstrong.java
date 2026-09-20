package BasicMaths;

public class Armstrong {

    public boolean isArmstrong(int n) {
        int sum = 0;
        int dup = n;
        int lastdigit;

        while (n > 0) {
            lastdigit = n % 10;
            sum = sum + (lastdigit * lastdigit * lastdigit);
            n = n / 10;
        }

        return sum == dup;
    }

    public static void main(String[] args) {
        Armstrong obj = new Armstrong();
        System.out.println(obj.isArmstrong(153));
    }
}
// Time Complexity: O(log10N + 1)
