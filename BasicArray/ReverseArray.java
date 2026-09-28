package BasicArray;

public class ReverseArray {
    public void reverse(int[] arr, int n, int i) {
        if (i >= n / 2) {
            return;

        }
        // swapping
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        reverse(arr, n, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        ReverseArray obj = new ReverseArray();
        obj.reverse(arr, arr.length, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}