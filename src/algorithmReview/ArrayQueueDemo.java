package algorithmReview;

/**
 * @author liqiqi_tql
 * @date 2021/1/27 -12:05
 */
public class ArrayQueueDemo {

}
class ArrayQueue{
//    表示数组最大容量
    private int maxSize;
//    队列头
    private int front;
//    队列尾
    private int rear;
//    该数据用于存放数据 模拟队列
    private int[] arr;
//    创建对列构造器
    public ArrayQueue(int arrMaxSize){
        maxSize=arrMaxSize;
        arr=new int[maxSize];
//        指向队列头的前一个位置
        front=-1;
//        指向队列尾的数据,即就是队列最后一个数据
        rear=-1;
    }
    //        判断队列是否满了
    public boolean isFull(){
        return rear==maxSize-1;
    }
//    判断队列是否为空
    public boolean isEmpty(){
        return rear==front;
    }
//    添加数据到队列
    public void addQueue(int n){
//        判断队列是否满
        if (isFull()){
            System.out.println("队列满,不能加数据");
            return;
        }
//        队列没满 让read后移
        rear++;
        arr[rear]=n;
    }
//    获取出队列的数据
    public int getQueue(){
//        判断队列是否为空
        if (isEmpty()){
//            throw会直接导致代码return
            throw new RuntimeException("队列为空,不能取数据");
        }
        front++;
        return arr[front];
    }
//    显示队列的所有数据
    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列空的,没有数据!!!");
            return;
        }
        for (int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }
//    显示队列头数据 注意不是取出数据
    public int headQueue(){
//        判断
        if(isEmpty()){
            throw new RuntimeException("队列空的没有数据");
        }
        return arr[front+1];
    }
}
