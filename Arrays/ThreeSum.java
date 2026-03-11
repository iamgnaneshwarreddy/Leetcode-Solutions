import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);


        for(int i = 0;i<nums.length;i++){
            int l = i+1;
            int r = nums.length-1;
            if(i > 0 && nums[i-1]==nums[i]){
                continue;
            }
            int target = -nums[i];
            while(l<r){
                if(nums[l]+nums[r]>target){
                    r--;
                    continue;
                }
                else if(nums[l]+nums[r]<target){
                    l++;
                    continue;
                }
                else{
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l-1]) l++;
                    while(l < r && nums[r] == nums[r+1]) r--;
                }
            }

        }
        return result;
    }
}