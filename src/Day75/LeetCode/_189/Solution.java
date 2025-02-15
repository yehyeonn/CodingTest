package Day75.LeetCode._189;

/*
class Solution {
    public void rotate(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums) {
            list.add(num);
        }

        Collections.rotate(list, k);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
    }
}*/

class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}