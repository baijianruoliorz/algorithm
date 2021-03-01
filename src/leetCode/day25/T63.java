package leetCode.day25;

/**
 * @author liqiqi_tql
 * @date 2021/3/1 -14:50
 */
public class T63 {
    public  static String addBinary(String a,String b){
        return Integer.toString(
                Integer.parseInt(a,2)+Integer.parseInt(b,2)
        );
    }

    public static void main(String[] args) {
        String a="100";
        String b="10";
        int c=1;
        System.out.println((char)(c+'0'));
        String s = addBinary(a, b);
        System.out.println(Integer.parseInt(a,2));
        System.out.println(s);
    }
}
