class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int sum = 0;
        while(x>0)
        {
            sum = (sum*10)+(x%10);
            x/=10;
        }

        if(original == sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}