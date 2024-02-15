class Solution {
    public int[] plusOne(int[] digits) {
        int s = digits.length-1;
		
		for(int i=s; i>=0; i--) {
			if(digits[i] == 9) {
				digits[i] = 0;
			}
			else {
				digits[i] += 1;
				return digits;
			}
        }
		int[] ans = new int[s+2];
        ans[0] = 1;
		return ans;
    }
}