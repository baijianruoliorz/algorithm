package leetCode.day46;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/4/16 -8:59
 */
public class T341 {
    class NestedIterator implements Iterator<Integer> {
        private List<Integer> vals;
        private Iterator<Integer> cur;


        @Override
        public Integer next() {
            return cur.next();
        }

        @Override
        public boolean hasNext() {
            return cur.hasNext();
        }


    }
}
