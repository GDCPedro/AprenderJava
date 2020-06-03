package leetcode;

/**
 * 面试题10- II. 青蛙跳台阶问题
 * 
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。 答案需要取模
 * 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * 
 */

public class Leetcode_mst10_II {
  public static void main(String[] args) {
    System.out.println(numWays(6));
  }

  static int numWays(int n) {
    if (n <= 1) return 1;
    
    int[] arr = new int[n + 1];
    arr[1] = 1;
    arr[2] = 2;
    
    for (int i = 3; i <= n; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
      arr[i] %= 1000000007;
    }

    return arr[n];
  }
}