package leetCode.day13;

import java.util.PriorityQueue;

/**
 * @author liqiqi_tql
 * @date 2020/12/26 -16:09
 */
public class MedianFinder {
    private int count;
    private PriorityQueue<Integer> maxheap;
    private PriorityQueue<Integer> minheap;

    public MedianFinder(){
        count=0;
        maxheap=new PriorityQueue<>((x,y)->y-x);
        minheap=new PriorityQueue<>();
    }
    public void addNum(int num){
        count+=1;
        maxheap.offer(num);
        minheap.add(maxheap.poll());
        if ((count&1)!=0){
            maxheap.add(minheap.poll());
        }
    }
    public double findMedian(){
        if ((count&1)==0){
            return (double)(maxheap.peek()+minheap.peek()/2);
        }else {
            return (double)maxheap.peek();
        }
    }
}
