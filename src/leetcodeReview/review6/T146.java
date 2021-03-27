package leetcodeReview.review6;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2021/3/27 -8:58
 */
public class T146 {
    class LRUCache{
        int capacity;
        Map<Integer,Integer> map;
        LinkedList<Integer> list;
        public LRUCache(int capacity){
            this.capacity=capacity;
            this.list=new LinkedList<>();
            this.map=new HashMap<>();
        }
        public void put(Integer key,Integer value){
            Integer right = map.get(key);
            if (right!=null){
                list.remove(key);
                map.put(key, value);
                list.addLast(key);
                return;
            }
            if (list.size()<capacity){
                list.addLast(key);
                map.put(key, value);
                return;
            }else {
                Integer integer = list.removeFirst();
                map.remove(integer);
                list.add(key);
                map.put(key, value);
                return;
            }
        }
        public Integer get(Integer key){
            Integer value = map.get(key);
            if (!map.containsKey(key)){
                return -1;
            }else {
                list.remove(key);
                list.add(key);
                return value;
            }
        }
    }
}
