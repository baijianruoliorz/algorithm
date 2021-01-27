package algorithmReview;

/**
 * @author liqiqi_tql
 * @date 2021/1/27 -11:33
 */
public class sparseArray {
//    P9 以五子棋为例 创建一个原始的二维数组11 * 11
//    0: 表示没有旗子 1表示黑子 2表蓝子
public static void main(String[] args) {
    int chessArr1[][] =new int[11][11];
    chessArr1[1][2]=1;
    chessArr1[2][3]=2;
//    输出原始的二位数组
    for (int[] ints : chessArr1) {
        for (int anInt : ints) {
            System.out.printf("%d\t",anInt);
        }
        System.out.println();
    }
//    将二维数组转成稀疏数组
//    先遍历二维数组 得到非0 数据的个数
    int sum=0;
    for (int i=0;i<11;i++){
        for (int j=0;j<11;j++){
            if (chessArr1[i][j]!=0){
                sum++;
            }
        }
    }
    System.out.println(sum);
//    创建对应的稀疏数组
    int sparseArr[][]=new int[sum+1][3];
//    给稀疏数组赋值 第一行
    sparseArr[0][0]=11;
    sparseArr[0][1]=11;
    sparseArr[0][2]=sum;
//    现在把二维数组的非零数据存到稀疏数组中即可
//    用于记录第几个是非0 数据
    int count=0;
    for(int i=0;i<11;i++) {
        for (int j = 0; j < 11; j++) {
            if (chessArr1[i][j] != 0){
                count++;
                sparseArr[count][0]=i;
                sparseArr[count][1]=i;
                sparseArr[count][2]=chessArr1[i][j];
            }
        }
    }
//    输出稀疏数组的形式
    System.out.println();
    System.out.println("得到的稀疏数组的形式为~~~~");
    for (int i = 0; i < sparseArr.length; i++) {
        System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
    }

    //将稀疏数组返回到二维数组
//    先读取稀疏数组第一行 得到原始二维数组
    int chessArr2[][]=new int[sparseArr[0][0]][sparseArr[0][1]];
//    在读取稀疏数组后几行的数据(从第二行开始),并赋值给原始二维数组即可
    for (int i = 1; i < sparseArr.length; i++) {
        chessArr2[sparseArr[i][0]][sparseArr[i][1]]=sparseArr[i][2];
    }

}


}
