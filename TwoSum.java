
class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
		int test=0,i=0;
        //int result=new int[2];
		int end=nums.length;
		HashMap<Integer, Integer> h1=new HashMap<>();
		
		for(i=0;i<end;i++)
		{
			h1.put(nums[i],i);
		}
        for(int j=0;j<end;j++)
        {
            int difference=target-nums[j];
            if(h1.containsKey(difference) && h1.get(difference)!=j)
                return new int[] {j,h1.get(difference)};
         }
        
        
        return null;
    }	
    
}
