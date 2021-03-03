package leetCode.day28;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2021/3/3 -19:16
 */
public class LRUCacheBeta {
    class LRUCache {
        int capacity;
        LinkedHashMap<Integer, Integer> cache;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            cache = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry eldest) {
                    return cache.size() > capacity;
                }
            };
        }

        public int get(int key) {
            return cache.getOrDefault(key, -1);
        }

        public void put(int key, int value) {
            cache.put(key, value);
        }
    }
}
