package leetCode.day1;

/**
 * @author liqiqi_tql
 * @date 2020/12/5 -11:50
 */
public class T345 {

    public String reverseVowels(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while (i < j) {
            while (i < chars.length && !isVowel(chars[i])) {
                i++;
            }
            while (j >= 0 && !isVowel(chars[j])) {
                j--;
            }
            if (i < j) {
                // 进行元音反转
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }
        return String.valueOf(chars);
    }
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ;

}
}
