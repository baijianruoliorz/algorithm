package leetCode.day40;

/**
 * @author liqiqi_tql
 * @date 2021/4/10 -15:53
 */
public class T12 {
    public String intToRoman(int num){
        int[] nums={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romans={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder stringBuilder=new StringBuilder();
        int index=0;
        while (index<13){
            while (num>=nums[index]){
                stringBuilder.append(romans[index]);
                num-=nums[index];
            }
            index++;
        }
        return stringBuilder.toString();
    }
}
