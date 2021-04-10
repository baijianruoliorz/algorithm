package leetCode.day40;

import jdk.nashorn.internal.runtime.FindProperty;

/**
 * @author liqiqi_tql
 * @date 2021/4/10 -16:11
 */
public class T13 {
    public int romanToInt(String s){
        int length=s.length();
        int sum=0;
        int preNum=getRealNum(s.charAt(0));
        for (int i=1;i<length;i++){
            if (preNum<getRealNum(s.charAt(i))){
                sum-=preNum;
            }else {
                sum+=preNum;
            }
            preNum=getRealNum(s.charAt(i));
        }
        sum+=preNum;
        return sum;
    }

    private int getRealNum(char c) {
        switch (c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return 0;
    }
}
