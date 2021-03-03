package leetCode.day28;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2021/3/3 -19:25
 */
public class LRUCache<K,V> {
    int capacity;
    Map<K,V> map;
    LinkedList<K> list;
    public LRUCache(int capacity){
        this.capacity=capacity;
        this.map=new HashMap<>();
        this.list=new LinkedList<>();
    }
    public void put(K key,V value){
        V v=map.get(key);
//        判断有没有
        if (v!=null){
            list.remove(key);
            list.addLast(key);
            map.put(key,value);
            return;
        }
//如果没有 开始判断容量
        if (list.size()<capacity){
            list.addLast(key);
            map.put(key,value);
        }else {
            K firstKey=list.removeFirst();
            map.remove(firstKey);
            list.addLast(key);
            map.put(key,value);
        }
    }
    public V get (K key){
        V v = map.get(key);
        if (v!=null){
            list.remove(key);
            list.addLast(key);
            return v;
        }
        return null;
    }
}
