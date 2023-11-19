public class Main {
    public static void main(String[] args) {

                int[][] cost = {{0, 1, 4, 4}, {4, 1, 1, 1}, {4, 4, 4, 1}, {4, 4, 4, 0}};
                System.out.println("Минимальная стоимость пути: " + minCostPath(cost));
            }

            static int minCostPath(int cost[][]) {
                int m = cost.length;
                int n = cost[0].length;
                int[][] dp = new int[m][n];

                dp[0][0] = cost[0][0];

                for (int i = 1; i < m; i++)
                    dp[i][0] = dp[i-1][0] + cost[i][0];

                for (int j = 1; j < n; j++)
                    dp[0][j] = dp[0][j-1] + cost[0][j];

                for (int i = 1; i < m; i++)
                    for (int j = 1; j < n; j++)
                        dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + cost[i][j];

                return dp[m-1][n-1];
            }
        }