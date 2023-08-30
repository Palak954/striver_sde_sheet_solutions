public class leftRotateArrayBy1 {
    public static int[] rotateArray(int[] arr, int n) {
        int a = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = a;
        int b[] = new int[n];
        for(int i=0;i<n;i++){
            b[i] = arr[i];
        }
        return b;
        // Write your code here.

    }
}