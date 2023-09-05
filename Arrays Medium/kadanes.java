public class kadanes {
    public int maxSubArray(int[] nums) {
        int summ = 0;
        int maxx = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            summ += nums[i];
            maxx = Math.max(summ , maxx);
            if(summ < 0)
            summ = 0;
        }
        
        return maxx;
    }
}
