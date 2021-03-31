package leetCode.day37;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/31 -10:42
 */
public class T22 {
    public List<String> generateParenthesis(int n){
        List<String> res=new ArrayList<>();
        if (n==0){
            return res;
        }
        dfs("",0,0,n,res);
        return res;
    }

    private void dfs(String curStr, int left, int right, int n, List<String> res) {
        if (left==n&&right==n){
            res.add(curStr);
            return;
        }
        if (left<right){
            return;
        }
        if (left<n){
            dfs(curStr+"(",left+1,right,n,res);
        }
        if (right<n){
            dfs(curStr+")",left,right+1,n,res);
        }
    }
}
