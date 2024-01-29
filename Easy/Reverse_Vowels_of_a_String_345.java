class Solution {
    public String reverseVowels(String s) {
        String[] spl = s.split("");
        ArrayList<String> arr = new ArrayList<String>();
        for(int i=0; i<spl.length; i++)
        {
        	char[] c = spl[i].toCharArray();
        	if(c[0] == 'a' ||c[0] == 'A' ||c[0] == 'e' ||c[0] == 'E' ||c[0] == 'I' ||c[0] == 'i' ||c[0] == 'o' ||c[0] == 'O' ||c[0] == 'u' ||c[0] == 'U')
        	{
        		String sr = ""+c[0];
        		spl[i]= "$";
        		arr.add(sr);
        	}
        }
        int j = arr.size()-1;
        String res = "";
        for(int i=0; i<spl.length; i++)
        {
        	if(spl[i].equals("$"))
        	{
        		spl[i] = arr.get(j);
        		j--;
        	}
        	res = res+spl[i];
        }
        return res;
    }
}