package backtracking;
import java.util.*;

public class Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        Backtracking(ans,"",0,0,n);
        return ans;
    }
    public void Backtracking(List<String> ans,
                             String curr,int open,int close,int max){
        if(curr.length()==max*2) {
            ans.add(curr);
            return;
        }
        if(open<max)
            Backtracking(ans,curr+"(",open+1,close,max);
        if(close<open)
            Backtracking(ans,curr+")",open,close+1,max);

    }
}
