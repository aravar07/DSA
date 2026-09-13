class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                boolean found = false;
                if(nums2[j]==nums1[i]){
                    for(int k = j+1;k<nums2.length;k++){
                        if(nums2[k]>nums1[i]){
                            res.add(nums2[k]);
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        res.add(-1);
                    }
                }
            }
        }
        int[] ans = new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}