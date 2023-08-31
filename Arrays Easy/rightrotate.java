public class rightrotate {
    public void reverse(int nums[] , int loww , int high){
        while(loww <= high){
            int t = nums[loww];
            nums[loww] = nums[high];

            nums[high] = t;
            loww++;

            high--;

        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums , 0 , n-k-1);
        reverse(nums , n-k , n-1);

        reverse(nums , 0 , n-1);
    }
}