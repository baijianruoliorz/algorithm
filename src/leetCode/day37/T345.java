package leetCode.day37;

/**
 * @author liqiqi_tql
 * @date 2021/4/2 -14:53
 */
public class T345 {
    public String reverseVowels(String s){
        char[] chars = s.toCharArray();
        int l=0;
        int r=chars.length-1;
        while (l<r){
            if (!isVowel(chars[l])){
                l++;
                continue;
            }
            if (!isVowel(chars[r])){
                r--;
                continue;
            }
          char c;
          c=chars[l];
          chars[l]=chars[r];
          chars[r]=c;
          l++;
          r--;
        }
     return new String(chars);
    }
    public boolean isVowel(char c){
        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}
