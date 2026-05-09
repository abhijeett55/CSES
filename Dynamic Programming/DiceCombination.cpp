/***
CSES Problem Set
Dice Combinations

Time limit: 1.00 s
Memory limit: 512 MB

Your task is to count the number of ways to construct sum n by throwing a dice one or more times. Each throw produces an outcome between 1 and  6.
For example, if n=3, there are 4 ways:

1+1+1
1+2
2+1
3

Input
The only input line has an integer n.
Output
Print the number of ways modulo 10^9+7.
Constraints

1 \le n \le 10^6

Example
Input:
3

Output:
4


 ***/
#include <iostream>
#include <vector>

const int mod = 1e9 + 7;


int main() {
  int n;
  std::cin>>n;
  
  std::vector<int>dp(n+1, 0);
  dp[0]= 1;
  
  for(int i =1; i <= n; i++) {
    for(int j = 1; j <= 6; j++) {
      if(i - j >= 0) {
        dp[i] = (dp[i] + dp[i-j]) % mod;
      }
    }
  }
  std::cout<<dp[n];
}