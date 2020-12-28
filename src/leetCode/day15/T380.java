package leetCode.day15;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @author liqiqi_tql
 * @date 2020/12/28 -16:13
 */
public class T380 {
class RandomizedSet{
    private List<Integer> list=new ArrayList<>();
    private Map<Integer,Integer> val2Idx=new HashMap<>();
    private Random random;

    public RandomizedSet(){

    }
    public boolean insert(int val){
        if (val2Idx.containsKey(val)){
            return false;
        }
        val2Idx.put(val,list.size());
        list.add(val);
        return true;
    }
    public boolean remove(int val){
        Integer index=val2Idx.remove(val);
        if (index==null){
            return false;
        }
        int lastIdx=list.size()-1;
        int lastVal=list.get(lastIdx);
        if (index!=lastIdx){
            list.set(index,lastVal);
            val2Idx.put(lastVal,index);
        }
        list.remove(lastIdx);
        return true;
    }
  public int getRandom(){
        return list.get(random.nextInt(list.size()));
  }
    }
}
