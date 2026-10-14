
public class HistogramLT84 {
    public static void main(String args[]){
        int[] arr={2,1,5,6,2,3};
        solve(arr);
    }
    private static void solve(int[] arr){
        //for left smaller
        for(int i=0;i<arr.length;i++){
            int m=i-1;
            while(m>=0 && arr[m] >=arr[i]){
                m--;
            }

        //for right smaller
        int n=i+1;
        while(n<arr.length && arr[n] >= arr[i]){
            n++;
        }

        int w=n-m-1;
        int a=w*arr[i];
        System.out.println(a);
    }
    
}
}
