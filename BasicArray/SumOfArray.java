package BasicArray;

public class SumOfArray {

    public int sum(int arr[], int n) {

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 5};
        int n = arr.length;

        SumOfArray obj = new SumOfArray();

        System.out.println(obj.sum(arr, n));
    }
}