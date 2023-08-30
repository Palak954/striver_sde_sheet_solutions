public class largestElement {

    public static int largest(int[] arr, int n) {
        int largest = arr[0];
        for(int i : arr){
            if(i > largest)
            largest = i;
        }
        return largest;
        // Write your code here.
    }
}
