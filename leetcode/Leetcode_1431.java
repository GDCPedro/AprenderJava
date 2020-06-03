package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leetcode_1431 {
  public static void main(String[] args) {
    int[] arr = { 2, 3, 5, 1, 3 };
    kidsWithCandies(arr, 3);
  }

  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int len = candies.length;
    List<Boolean> result = new LinkedList<Boolean>();
    int max = 0;

    int[] copiedArr = Arrays.copyOf(candies, len);

    Arrays.sort(candies);

    for (int unit : copiedArr) {
      result.add(unit + extraCandies >= max);
    }

    return result;
  }
}