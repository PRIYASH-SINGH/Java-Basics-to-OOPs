import java.util.*;

public class CombinationSum2 {
    public static void main(String[] args)
    {
        int[] candidates={10,1,2,7,6,1,5};
        Arrays.sort(candidates);
        int target=8;
        List<Integer> list=new ArrayList<>();
        solve(candidates,target,list,0);
    }
    public static void solve(int[] candidates,int target,List<Integer> list,int start)
    {
        if(target==0)
        {
            System.out.println(list);
            return;            
        }
        for(int i=start;i<candidates.length;i++)
        {
            if(i >start && candidates[i]==candidates[i-1])
            {
                continue;
            }
            if(target>=candidates[i])
            {
            list.add(candidates[i]);
            solve(candidates,target-candidates[i],list,i+1);
            list.remove(list.size()-1);
        }
    }
}

}
