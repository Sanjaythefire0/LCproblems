class Solution {
    public int majorityElement(int[] nums) {
        int el=nums[0];
        int cnt=1;
        int n=nums.length;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==el){
                cnt++;
            }if(nums[i]!=el){
                cnt--;
            }
            if(i!=n-1&&cnt==0){
                el=nums[i+1];
            }
        }
        return el;
        
    }
}
