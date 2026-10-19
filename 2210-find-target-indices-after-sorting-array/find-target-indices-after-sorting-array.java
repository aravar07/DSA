class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                res.add(i);
            }
        }

        return res;
    }
}