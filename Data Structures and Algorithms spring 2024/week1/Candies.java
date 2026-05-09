// A gummy candy costs a euros and a chocolate candy costs b euros. What is the maximum number of candies you can buy if you have c euros?
// You may assume that a, b and c are integers in the range 1 \dots 100.
// In a file candies.py, implement the function count that returns the maximum number of candies.
// def count(a, b, c):
//     # TODO

// if __name__ == "__main__":
//     print(count(3, 4, 11)) # 3
//     print(count(5, 1, 100)) # 100
//     print(count(2, 3, 1)) # 0
//     print(count(2, 3, 9)) # 4
// Explanation: In the first test, a gummy candy costs 3 euros and a chocolate candy costs 4 euros. You can buy at most 3 candies with 11 euros. For example, two gummy candies and one chocolate candy cost a total of 10 euros leaving you with 1 euro.


import java.util.*;


public class Candies {
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int resa = c%a;
        int resb = c%b;
        if(c < a && c < b) System.out.println(0);
        else if(c == a)  System.out.println(resa);
        else if(c == b) System.out.println(resb);
        else if(resa > resb)System.out.println(resa);
        else System.out.println(resb);
    }
}
