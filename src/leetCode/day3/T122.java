package leetCode.day3;

/**
 * @author liqiqi_tql
 * @date 2020/12/7 -11:43
 */
public class T122 {
    String pid="0,1,2,3,4,5,6,7,8,9,10,11,21,24,26";
    String a="10";
    public static void main(String[] args) {
      T122 s=new T122();
      s.pid=s.pid.replace(s.a,"");
        System.out.println(s.pid);
    }
}
