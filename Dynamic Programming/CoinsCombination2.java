/**
Coin Combinations II
        
Task
Submit
Results
Statistics
Tests

    
    

  

    
CSES - Coin Combinations II




addEventListener("DOMContentLoaded", function (e) {
    const mathElements = document.getElementsByClassName("math");
    const macros = {};
    for (let element of mathElements) {
        katex.render(element.textContent, element, {
            displayMode: element.classList.contains("math-display"),
            throwOnError: false,
            globalGroup: true,
            macros,
        });
    }
});


Time limit: 1.00 s
Memory limit: 512 MB

Consider a money system consisting of n coins. Each coin has a positive integer value. Your task is to calculate the number of distinct ordered ways you can produce a money sum x using the available coins.
For example, if the coins are \{2,3,5\} and the desired sum is 9, there are 3 ways:

2+2+5
3+3+3
2+2+2+3

Input
The first input line has two integers n and x: the number of coins and the desired sum of money.
The second line has n distinct integers c_1,c_2,\dots,c_n: the value of each coin.
Output
Print one integer: the number of ways modulo 10^9+7.
Constraints

1 \le n \le 100
1 \le x \le 10^6
1 \le c_i \le 10^6

Example
Input:
3 9
2 3 5

Output:
3

**/


// #include <iostream>
// #include <vector>
// const int mod = 1e9+7;

// int main() {
//     int n, target;
//     std::cin>>n>>target;
//     std::vector<int>coins(n);
//     for(int i = 0; i < n; i++) std::cin>>coins[i];
//     std::vector<int> dp(target+1, 0);
//     dp[0] = 1;

//     for(int i : coins) {
//         for(int j = i; j <= target;j++) {
//           dp[j] = (dp[j] + dp[j - i]) % mod;
//         }
//     }
//     std::cout<<dp[target]<<"\n";
//     return 0;
// }


import java.util.*;

public class CoinsCombination2 {
    static Scanner sc = new Scanner(System.in);
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
            for(int s = coins[i]; s <= sum; s++) {
                dp[s] = dp[s] + dp[s - coins[i]];
                if(dp[s] >= MOD) {
                    dp[s] -= MOD;
                }
            }
        }
        System.out.println(dp[sum]);
    }
}