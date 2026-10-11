class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid = 0;

        while(mid<=high){
            if(nums[mid]==0){
                int temp0 = nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp0;

                low++;
                mid++;
            }
            else if(nums[mid]==2){
                int temp1 = nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp1;

                high--;
            }
            else{
                mid++;
            }
        }
       


    }
}