class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
		for(int i=0; i<candies.length; i++)
		{
			if(max < candies[i])
			{
				max = candies[i];
			}
		}

		ArrayList<Boolean> boo = new ArrayList<>();
		for(int i=0; i<candies.length; i++)
		{
			candies[i] = candies[i]+extraCandies;
			if(candies[i]>=max)
			{
				boo.add(true);
			}
			else
			{
				boo.add(false);
			}
		}
		return boo;
    }
}