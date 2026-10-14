import java.util.*;
public class TemperatureLT739 {
    public static void main(String[] args){
        int[] temp={73,74,75,71,69,72,76,73};
        solve(temp);
        
    }
    private static void solve(int[] temp){
        int ans[]=new int[temp.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<temp.length;i++){
         while(!st.isEmpty() && temp[i]>=temp[st.peek()]){
            int idx=st.pop();
            ans[idx]=i-idx;
         }   
         st.push(i);
        }
        System.out.println(Arrays.toString(ans));
    }
    
}
