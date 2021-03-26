package leetCode.day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/22 -9:14
 */
public class T118 {
   public List<List<Integer>> generate(int numRows){
       List<List<Integer>> res=new ArrayList<>();
           if (numRows<1){
               return res;
           }
           res.add(new ArrayList<>(1));
           List<Integer> list=new ArrayList<>();
           list.add(1);
           res.add(list);
           for (int i=1;i<numRows;i++){
               Integer[] arr=new Integer[i+1];
//               初始化小诀窍
               arr[0]=arr[i]=1;
               for (int x=1;x<i;x++){
                   arr[x]=res.get(i-1).get(x)+res.get(i-1).get(x-1);
               }
//               必须用integer类型 不然会报错
               res.add(Arrays.asList(arr));
           }
           return res;
   }
}
