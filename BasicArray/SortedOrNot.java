package BasicArray;

public class SortedOrNot {
    public static boolean arraySortedOrNot(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 10 };
        int n = arr.length;

        System.out.println(arraySortedOrNot(arr, n));
    }
}
