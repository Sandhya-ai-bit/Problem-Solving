package BasicMaths;

public class GCD {

    public int gcd(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 && b == 0) {
            return 0;
        }

        int limit = Math.min(a, b);

        if (limit == 0) {
            return Math.max(a, b);
        }

        int answer = 1;

        for (int i = 1; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        GCD obj = new GCD();

        System.out.println(obj.gcd(48, 18));
    }
}