class Solution {
    public static String gcdOfStrings(String str1, String str2) 
	{
		String res = "\"\"";
		 if(!(str1+str2).equals(str2+str1))
		 {
			 return("");
		 }
		 else
		 {
			 int gcd = gcdresult(str1.length(), str2.length());
			 return(str1.substring(0, gcd));
		 }
		
    }
	public static int gcdresult(int len1, int len2) 
	{
		while(len2>0)
		{
			int temp = len2;
			len2 = len1%len2;
			len1 = temp;
		}
		return len1;
	}
}