import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndices {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> out = new ArrayList<>();
        int i = 0;

        while(i<nums.length && nums[i]<=target){
            if(nums[i]==target){
                out.add(i);
            }
            i++;
        }
        return out;
    }
}
