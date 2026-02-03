class Solution {
    public int singleNumber(int[] nums) {
        int i;
        int j,count=0;
        for(i=0;i<nums.length;i++)
        {
            for(j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count=count+1;
                }
            }
            if(count==1)
            {
                System.out.println(+nums[i]);
            }        
        }
        return 0;
        
    }
}
