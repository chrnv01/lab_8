package ru.mirea.lab_8;

import java.util.Scanner;

public class Num9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long[][] dp = new long[a + 1][b + 1];

        dp[0][0] = 1;
        dp[0][1] = 1;
        dp[1][0] = 1;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        System.out.println("Количество последовательностей: " + dp[a][b]);
    }
}
