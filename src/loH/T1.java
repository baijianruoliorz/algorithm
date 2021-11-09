package loH;

import java.util.ArrayList;
import java.util.List;
// Scanner scanner = new Scanner(System.in);
//         System.out.println("请输入十进制数字:");
//         Integer in = Integer.parseInt(scanner.next(), 10);

public class T1 {
    public String convert(Integer in) {
//        构建存放结果的列表
        List<Object> list = new ArrayList<Object>();
//        这里对15进行取模 添加到列表里面
        while (true) {
            list.add(in % 15);
            in = in / 15;
            if (in == 0) {
                break;
            }
        }
        StringBuffer str = new StringBuffer(); // 拼接字符串
        for (int i = list.size() - 1; i >= 0; i--) {
            int number = (int) list.get(i);
            if (number == 10) {
                str.append("A");
            } else if (number == 11) {
                str.append("B");
            } else if (number == 12) {
                str.append("C");
            } else if (number == 13) {
                str.append("D");
            } else if (i == 14) {
                str.append("E");
            } else {
                str.append(number);
            }
        }
        return str.toString();
    }
}
