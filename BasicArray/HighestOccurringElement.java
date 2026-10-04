package BasicArray;
import java.util.*;

public class HighestOccurringElement {
    public int mostFrequentElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int maxFreq = 0;
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            int freq = map.get(nums[i]);

            if (freq > maxFreq) {
                maxFreq = freq;
                answer = nums[i];
            } else if (freq == maxFreq && nums[i] < answer) {
                answer = nums[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        HighestOccurringElement obj = new HighestOccurringElement();

        int[] nums = {2, 4, 3, 2, 5, 4};

        System.out.println(obj.mostFrequentElement(nums));
    }
}