import java.util.ArrayList;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++) {
            int result = target - nums[i];

            if(numbers.contains(result) && numbers.indexOf(result) != i) {
                return new int [] {i, numbers.indexOf(result)};
            }
        }
        throw new RuntimeException("erro");
    }
}