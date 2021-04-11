package leetCode.day40;

/**
 * @author liqiqi_tql
 * @date 2021/4/11 -11:00
 */
public class T264method2 {
    public int nthUglyNumber(int n){
        int[] ans=new int[n+1];
        ans[1]=1;
        for (int i2=1,i3=1,i5=1,idx=2;idx<=n;idx++){
            int a=ans[i2]*2,b=ans[i3]*3,c=ans[i5]*5;
            int min=Math.min(a,Math.min(b,c));
            if (min==a) i2++;
            if (min==b) i3++;
            if (min==c) i5++;
            ans[idx]=min;
        }
        return ans[n];
    }
}
