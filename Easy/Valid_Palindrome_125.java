class Solution {
    public boolean isPalindrome(String s) {
        String str = "", reverse = "";
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))){
                str += Character.toLowerCase(s.charAt(i));
            }
        }
        for(int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if(reverse.equals(str)) return true;
        else return false;
    }
}