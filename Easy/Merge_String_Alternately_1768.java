class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merge = "";
		String[] st1 = word1.split("");
		String[] st2 = word2.split("");
		for(int i=0; i<st1.length || i<st2.length; i++)
		{
			if(i<st1.length)
				merge = merge+(st1[i]);
			if(i<st2.length)
				merge = merge+(st2[i]);
		}
        return(merge);
    }
}