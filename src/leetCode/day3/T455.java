package leetCode.day3;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2020/12/7 -9:29
 */
public class T455 {
public int findContentChildren(int[] grid,int[] size){
    if (grid==null||size==null) {
        return 0;
    }
    Arrays.sort(grid);
    Arrays.sort(size);
    int gi=0,si=0;
    while (gi<grid.length&&si<size.length){
        if (grid[gi]<=size[si]){
            gi++;
        }
        si++;
    }
    return gi;
}

}
