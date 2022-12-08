class Solution {
    int count=0;
   int  maxCount=0;
   int  maxValue=0;
    public int majorityElement(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>maxCount||maxCount==0){
                maxCount=count;
                maxValue=nums[i];
            }
            
        }
        return maxValue;
    }
}
