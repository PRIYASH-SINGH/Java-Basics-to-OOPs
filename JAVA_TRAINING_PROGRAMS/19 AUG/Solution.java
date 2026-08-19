import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] arr, int k)// brute force
     {
        int j=0;
        while(j<k)//we run loop from 0 to k
        {
        int temp=arr[arr.length-1];//put temp value with last array element
        for(int i=arr.length-2;i>=0;i--)
        //from secondlast element till 0 index we move elements one index fwd arr[i+1]=arr[i]
        {
            arr[i+1]=arr[i];
        }
        arr[0]=temp; // then put last element at front index
        j++;
        }
    }
}
