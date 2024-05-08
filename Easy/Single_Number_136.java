class Solution {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> have = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int count = have.getOrDefault(nums[i], 0) +1;
            have.put(nums[i], count);
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> entry : have.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
            }
        }
        System.out.println(have);
        return result;
    }
}