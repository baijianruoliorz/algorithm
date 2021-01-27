package algorithmReview;

/**
 * @author liqiqi_tql
 * @date 2021/1/27 -15:45
 */
public class SingleLinkedList {
    class HeroNode{
        public int no;
        public String name;
        public String nickName;
//        指向下一个节点
        public HeroNode next;

        public HeroNode(int no, String name, String nickName) {
            this.no = no;
            this.name = name;
            this.nickName = nickName;
        }

        @Override
        public String toString() {
            return "HeroNode{" +
                    "no=" + no +
                    ", name='" + name + '\'' +
                    ", nickName='" + nickName + '\'' +

                    '}';
        }
    }

    class SingleLinkedListDemo{
//        先初始化一个头结点 头结点不要动
        private HeroNode head=new HeroNode(0,"","");
//        添加节点到单向链表
//        思路 当不考虑编号顺序是
//        找到当前链表的最后一个节点
//        将最后这个节点的next指向新的节点
        public void add(HeroNode heroNode){
//            因为head节点不能动 因此需要辅助遍历temp
            HeroNode temp=head;
//            遍历链表 找到最后
            while (true) {
                if (temp.next == null) {
                    break;
                }
                //            当跳出while循环时 temp就指向了链表的最后遍历
                temp=temp.next;

            }
            temp.next=heroNode;
        }
        public void list(){
//            判断链表是否为空
            if (head.next==null){
                System.out.println("链表为空");
                return;
            }
//            因为头结点 不能动 所以我们需要一个辅助变量来遍历
            HeroNode temp=head.next;
            while (true){
//                判断是否到链表最后
                if(temp==null){
                    break;
                }
//                输出节点信息
                System.out.println(temp);
                temp=temp.next;
            }
        }
    }
}
