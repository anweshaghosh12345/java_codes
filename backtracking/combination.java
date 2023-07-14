package backtracking;

import java.util.ArrayList;
import java.util.List;

public class combination {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(k==0)
            return res;
        combine(res,n,k,1,new ArrayList<>());
        return res;
    }
    public void combine( List<List<Integer>> res,int n,int k,int strt,List<Integer> temp){
        if(temp.size()==k)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = strt; i <=n ; i++) {
            temp.add(i);
            combine(res,n,k,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}
