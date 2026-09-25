package BasicArray;

public class CountOdd {

    public int countOdd(int[] arr, int n) {

        int counter = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] % 2 != 0) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 7, 11};
        int n = arr.length;

        CountOdd obj = new CountOdd();

        System.out.println(obj.countOdd(arr, n));
    }
}