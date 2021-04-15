package leetCode.day44;

/**
 * @author liqiqi_tql
 * @date 2021/4/14 -23:29
 */
public class T231 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
