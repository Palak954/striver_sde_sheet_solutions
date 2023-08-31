public class moveZeroesEnd {
    public static int[] moveZeros(int n, int []a) {
        int b[] = new int[n];
        int j = 0;
        for(int i=0;i<n;i++){
            if(a[i] != 0){
                int t = a[j];
                a[j] = a[i];
                a[i] = t;
                j++;
            }
        }
        for(int i=0;i<n;i++){
            b[i] = a[i];
        }
        return b;
    // Write your code here.
}
}