public class Leetcode_837 {
  /**
   * 爱丽丝以 0 分开始，并在她的得分少于 K 分时抽取数字。 抽取时，她从 [1, W] 的范围中随机获得一个整数作为分数进行累计，其中 W 是整数。
   * 每次抽取都是独立的，其结果具有相同的概率。
   * 
   * 当爱丽丝获得不少于 K 分时，她就停止抽取数字。 爱丽丝的分数不超过 N 的概率是多少？
   * 
   */

  /**
   * 相当于计算值超过K的时候但不超过N的概率
   */
  public static void main(String[] args) {
    System.out.println(new21Game(21, 17, 10));
  }

  static double new21Game(int N, int K, int W) {
    double[] dp = new double[K + W];
    double sum = 0;

    for (int i = K; i < K + W; i++) {
      dp[i] = i <= N ? 1.0 : 0.0;
      sum += dp[i];
    }

    if (K - 1 >= 0 && W > 0)
      dp[K - 1] = sum / W;

    for (int i = K - 2; i >= 0; i--) {
      dp[i] = dp[i + 1] - (1.0 / W) * (dp[i + 1 + W] - dp[i + 1]);
    }

    return dp[0];
  }
}