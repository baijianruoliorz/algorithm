package leetCode.day37;

/**
 * @author liqiqi_tql
 * @date 2021/3/31 -19:18
 */
public class T331 {
    public boolean isValidSerialization(String preorder){
        String[] split = preorder.split(",");
        int length = split.length;
        int before=0;
        int after=0;
        for (int i=0;i<length;i++){
            if (i==0&&length==1){
                if (split[0].equals("#")){
                    return true;
                }else {
                    return false;
                }
            }
            if (i==0&&length>1){
                if (split[0].equals("#")){
                    return false;
                }else {
                    after+=2;
                }
            }else if (split[i].equals("#")) {
                before++;
            }else {
                before++;
                after+=2;
            }
            if (before>=after&&i<length-1){
                return false;
            }
            }
return before==after;
        }

    }

