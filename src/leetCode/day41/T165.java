package leetCode.day41;

/**
 * @author liqiqi_tql
 * @date 2021/4/11 -21:27
 */
public class T165 {
    public int compareVersion(String version1,String version2){
        String[] split = version1.split(".");
        String[] split1 = version2.split(".");
        int[] num1=new int[split.length];
        int[] nums2=new int[split1.length];
        int i=0,j=0;
        for (String s : split) {
            num1[i]=Integer.parseInt(s);
            i++;
        }
        for (String s : split1) {
            nums2[j]=Integer.parseInt(s);
            j++;
        }
        int min = Math.min(i, j);
        for (int s=0;s<min;s++){
            if (num1[s]==nums2[s]){
                continue;
            }
            if (num1[s]>nums2[s]){
                return 1;
            }
            if (num1[s]<nums2[s]){
                return -1;
            }
        }
        if (i>min){
            if (num1[min++]>0){
                return 1;
            }
            if (min==i){
                return 0;
            }
        }
        if (j>min){
            if (nums2[min++]>0){
                return -1;
            }
            if (min==j){
                return 0;
            }
        }
        return 0;
    }
}
