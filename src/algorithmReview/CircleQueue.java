package algorithmReview;

import javafx.scene.shape.Circle;

/**
 * @author liqiqi_tql
 * @date 2021/1/27 -15:18
 */
public class CircleQueue {
    public static void main(String[] args) {

    }
}
class CircleArray{
    //    表示数组最大容量
    private int maxSize;
    //    队列头 变量含义做一个调整: front就指向队列的第一个元素 也就是说arr[front] 初始值为0
    private int front;
    //    队列尾 初始值为0
    private int rear;
    //    该数据用于存放数据 模拟队列
    private int[] arr;
    //    创建对列构造器
    public CircleArray(int arrMaxSize){
        maxSize=arrMaxSize;
        arr=new int[maxSize];
    }
    //        判断队列是否满了
    public boolean isFull(){
        return (rear+1)%maxSize==front;
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
// read本身就变成了最后一个元素 所以不需要加++了
        arr[rear]=n;
//        再将rear后移 这里必须要取模
        rear=(rear+1)%maxSize;
    }
    //    获取出队列的数据
    public int getQueue(){
//        判断队列是否为空
        if (isEmpty()){
//            throw会直接导致代码return
            throw new RuntimeException("队列为空,不能取数据");
        }
//    这里需要分析 front已经指向了第一个元素
//        先把front对应的值保存到零食变量
//        将front后移
//        将临时保存的变量返回
        int i = arr[front];
        front=(front+1)%maxSize;
        return i;
    }
    //    显示队列的所有数据
    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列空的,没有数据!!!");
            return;
        }
//        思路 从front开始遍历
//        思考一下
        for (int i=front;i<front+size();i++){
            System.out.printf("arr[%d]=%d\n",i%maxSize,arr[i%maxSize]);
        }
    }
//    求出当前队列有效的数据
    public int size()
    {
//        rear=2;
//        front=1
//        maxsize=3
        return (rear+maxSize-front)%maxSize;
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
