import java.util.*;

public class CombinationSum {
    public static void main(String[] args){
        int[] nums={2,3,6,7};
        int target=7;
        List<Integer> list=new ArrayList<>();
        solve(nums,target,list,0);
    }
     private static void solve(int[] nums,int target,List<Integer> list,int index)
     // added index for not repeating the same number in the combination
     {
        if(target==0)
        {
            System.out.println(list);
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            if(target>=nums[i]){
            
            list.add(nums[i]);
            solve(nums,target-nums[i],list,i);
            list.remove(list.size()-1);
        }
    }
  
 }
    
}
