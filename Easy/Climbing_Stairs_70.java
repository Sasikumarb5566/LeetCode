class Solution {
    public int climbStairs(int n) {
        if(n <= 3) return n;
        int rev1 = 3, rev2 = 2, cur = 0;
        for(int i = 3; i < n; i++) {
            cur = rev1+rev2;
            rev2 = rev1;
            rev1 = cur;
        }
        return cur;
    }
}