/***    
CSES - Minimizing Coins

Time limit: 1.00 s
Memory limit: 512 MB

Consider a money system consisting of n coins. Each coin has a positive integer value. Your task is to produce a sum of money x using the available coins in such a way that the number of coins is minimal.
For example, if the coins are \{1,5,7\} and the desired sum is 11, an optimal solution is 5+5+1 which requires 3 coins.
Input
The first input line has two integers n and x: the number of coins and the desired sum of money.
The second line has n distinct integers c_1,c_2,\dots,c_n: the value of each coin.
Output
Print one integer: the minimum number of coins. If it is not possible to produce the desired sum, print -1.
Constraints

1 <= n <= 100
1 <= x <= 10^6
1 <= c_i <= 10^6

Example
Input:
3 11
1 5 7

// Output:
// 3 
//  ***/


// #include <iostream>
// #include <vector>
// #include <cstring>
// #include <climits>


// int MinimizingCoins(std::vector<int>& coins, int n, int target) {
//     const int INF = 1e9;
//     std::vector<int>dp(target+1, INF);
//     dp[0] = 0;
//     for(int i = 0; i < n; i++) {
//         for(int j = coins[i] ; j  <= target; j++) {
//             dp[j] = std::min(dp[j], 1+ dp[j - coins[i]]);
//         }
//     }
//     return (dp[target] == INF) ? -1 : dp[target];
// }

// int main() {
//     int n, x;
//     std::cin>>n>>x;
//     std::vector<int> coins(n);
//     for(auto& x: coins) {
//         std::cin>>x;
//     }
//     std::cout<<MinimizingCoins(coins, n, x);
// }

import java.util.*;

public class MinimizingCoins {
    static final int MOD = 1000000007;
    public static void main(String [] args) {
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int coins[] = new int[n];
        for(int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        int dp[] = new int[sum+1];
        dp[0] = 1;

        for(int i = 0; i < n; i++) {
            for(int s = sum; s >= coins[i]; s--) {
                dp[s] = Math.min(dp[s], dp[s - coins[i]] );
            }
        }
        System.out.println(dp[sum]);
    }
}