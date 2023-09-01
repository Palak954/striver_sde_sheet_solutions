import java.util.ArrayList;

public class missingNumber {
        public int missingnumber(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            al.add(nums[i]);
        }    
        for(int i=0;i<=nums.length;i++){
            if(!al.contains(i))
            return i;
        }
        return -1;
 }
}
