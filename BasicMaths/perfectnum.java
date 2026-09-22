package BasicMaths;

public class perfectnum {
     public boolean checkPerfectNumber(int num) {

        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {

        perfectnum obj = new perfectnum();

        System.out.println(obj.checkPerfectNumber(28));
    }
}
