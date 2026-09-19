package BasicMaths;

public class prime {

    public boolean isPrime(int n) {

        int count = 0;

        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {
                count++;

                if (n / i != i) {
                    count++;
                }
            }
        }

        return count == 2;
    }

    public static void main(String[] args) {

        prime obj = new prime();

        boolean answer = obj.isPrime(2);

        if (answer) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}