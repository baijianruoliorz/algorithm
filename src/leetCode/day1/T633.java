package leetCode.day1;

/**
 * @author liqiqi_tql
 * @date 2020/12/5 -11:40
 */
public class T633 {
    public boolean judgeSquareSum(int c) {
        long a;
        for (a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }
}
