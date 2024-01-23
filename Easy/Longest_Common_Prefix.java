class Solution {
    public String longestCommonPrefix(String[] strs) {
       ArrayList<Integer> len = new ArrayList<Integer>();
		for(String s: strs)
		{
			len.add(s.length());
		}
		Collections.sort(len);
		String st = "";
		
		for(int i=0; i<len.get(0); i++)
		{
            boolean value = false;
			int count = 1;
			for(int j=1; j<strs.length; j++)
			{
				if(strs[0].charAt(i) == strs[j].charAt(i))
				{
					count++;
				}
                else
				{
					value = true;
				}
			}
			if(count == strs.length)
			{
				st += strs[0].charAt(i);
			}
            if(value == true)
			{
				break;
			}
		}
        return(st);
    }
}