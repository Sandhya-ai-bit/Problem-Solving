public class Armstrong {
    public boolean isArmstrong(int n) {
        int sum = 0;
        int dup = n;
        int lasdigit;
        while(n>0)
        {
            lasdigit = n %10; // to get last digit
            sum = sum + (lasdigit *lasdigit*lasdigit);
            n = n/10;
        }
        if(sum==dup)
        {
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {

        Armstrong obj = new Armstrong();

        System.out.println(obj.isArmstrong(153));
    }
}
//Time Complexity: O(log10N + 1)
