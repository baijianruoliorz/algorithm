//package leetCode.day37;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author liqiqi_tql
// * @date 2021/4/2 -21:08
// */
//public class T79 {
//    public boolean exist(char[][] board,String word){
//        if (board.length==0){
//            return false;
//        }
//        String des="";
//        for (int i=0;i<board.length;i++) {
//            for (int j=0;j<board[0].length;j++) {
//               dfs(board, "", word, i, j);
//                if (dfs.equals(word)){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    private boolean dfs(char[][] board, String s, String word,int i,int j) {
//        if (s.equals(word)){
//         return s;
//        }
//        if (i<0||j<0||i>=board.length||j>=board[0].length){
//            return " ";
//        }
//        int[][] des=new int[][]{{0,-1},{0,1},{1,0},{-1,0}};
//        for (int s1=0;s1<4;s1++){
//            dfs(board,s+board[i+des[s1][0]][j+des[s1][1]],word,i+des[s1][0],j+des[s1][1]);
//        }
//    }
//}
