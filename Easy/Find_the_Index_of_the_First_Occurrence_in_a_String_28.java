class Solution {
    public int strStr(String haystack, String needle) {
        int length = needle.length();
		for(int i=0; i<=haystack.length()-length; i++) {
			if(haystack.substring(i, i+length).startsWith(needle)) {
				return i;
			}
		}
		return -1;
    }
}