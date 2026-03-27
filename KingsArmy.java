import java.util.*;

public class KingsArmy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int R = sc.nextInt();
        int end = sc.nextInt();

        long[][] dp = new long[N + 1][R + 1];

        // start with soldier 1
        dp[1][1] = 1;

        for (int i = 2; i <= N; i++) {
            for (int j = 1; j <= R; j++) {
                for (int k = 1; k <= R; k++) {
                    if (j != k) {
                        dp[i][j] += dp[i - 1][k];
                    }
                }
            }
        }

        System.out.println(dp[N][end]);
    }
}