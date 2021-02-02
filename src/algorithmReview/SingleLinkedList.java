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
//        第二种方式添加英雄时 需要按照编号的顺序来添加
//        如果有这个排名 则添加失败 并且给出提示
        public void addByOrder(HeroNode heroNode){
//            因为头结点不能动 因此我们需要通过一个辅助指针来帮助找到需要添加的位置
            HeroNode temp=head;
            boolean flag=false;
            while (true){
                if (temp.next==null){
                    break;
                }
                if (temp.next.no>heroNode.no){
//                    位置找到了 就在temp后面插入
                    break;
                }else if (temp.next.no==heroNode.no){
//                    说明编号存在
                    flag=true;
                    break;
                }
//                后移 遍历当前链表
                temp=temp.next;
            }
//            判断flag的值
            if (flag){
//                不能添加 说明编号存在
                System.out.printf("准备插入的英雄的百年好%d 已经存在了 ,不能急加入\n",heroNode.no);
            }else {
//                插入到链表中
                heroNode.next=temp.next;
                temp.next=heroNode;
            }
        }
    }
}
