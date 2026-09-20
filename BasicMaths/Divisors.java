package BasicMaths;

import java.util.Arrays;

public class Divisors {
    public int[] divisors(int n) {
        int count = 0;
        // count divisors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        // create array
        int[] result = new int[count];
        int index = 0;
        // store the divisors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result[index] = i;
                index++;
            }
        }
        // return array
        return result;
    }

    public static void main(String[] args) {
        Divisors obj = new Divisors();
        int[] answer = obj.divisors(63);
        System.out.println(Arrays.toString(answer));
    }
}