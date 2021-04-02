package leetCode.day37;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2021/4/2 -14:33
 */
public class T455 {
    public int findContentChildren(int[] grid,int[] size) {
        int j=0;
        int sum=0;
        Arrays.sort(grid);
        Arrays.sort(size);
        for (int i=0;i<size.length;i++){
            if (size[i]>=grid[j]){
                j++;
                sum++;
            }
        }
        return sum;
    }
}
