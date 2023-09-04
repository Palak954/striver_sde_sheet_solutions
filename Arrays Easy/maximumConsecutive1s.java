public class maximumConsecutive1s {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1)
            count++;
            else{
                if(count > maxx)
                maxx = count;
                count = 0;
            }
        }
                if(count > maxx)
                maxx = count;
                count = 0;

                return maxx;
    }
}
