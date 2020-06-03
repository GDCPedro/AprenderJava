package leetcode;

import java.util.LinkedList;
import java.util.List;

// 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。

public class Leetcode_mst29 {
  public static void main(String[] args) {
    //
  }

  public static int[] spiralOrder(int[][] matrix) {
    /**
     * 首先matrix[0]依次打印，然后打印每一个最后的
     */
    // maxtrix的长度
    int matrixLen = matrix.length;
    // 单个数组的长度
    int unitLen = matrix[0].length;
    // 展开成一维的数组
    List<Integer> arr = new LinkedList<Integer>();
  }

  // 翻转矩阵90度
  final int[][] reverseMatrix(int[][] m) {
    // maxtrix的长度
    int mLen = m.length;
    // 单个数组的长度
    int uLen = m[0].length;
    // 单个容器
    int[] tempArr = {};

    // m里的数组个数
    for (int i = 0; i < mLen - 1; i++) {
      for (int j = 0; j < uLen - 1; j++ ) {
        //
      }
    }
  }
}

/**
 * 3 * 3的 00 01 02 10 11 12 20 21 22
 * 
 * 0 1 2 3 4 5 6 7 8 00 01 02 12 22 21 20 10 11 4 * 4的 00 01 02 03 10 11 12 13
 * 20 21 22 23 30 31 32 33
 * 
 * 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 00 01 02 03 13 23 33 32 31 30 20 10 11
 * 12 22 21
 * 
 * 3 -> 7; 4 -> 11
 */