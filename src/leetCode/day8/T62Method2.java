package leetCode.day8;

/**
 * @author liqiqi_tql
 * @date 2020/12/23 -9:21
 */
public class T62Method2 {
    public int uniquePaths(int m,int n){
        int S=m+n-2;
        int D=m-1;
        long ret=1;
        for (int i=1;i<=D;i++){
            ret=ret*(S-D+i)/i;
        }
        return (int)ret;
    }
}
