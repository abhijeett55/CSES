// Your task is to find out how long is the shortest string that forms the given string when repeated. For example, when the input string is abcabcabcabc, the shortest repeating string is abc.

// The string consists of the characters a–z and contains at most 100 characters.

// In a file repeat.py, implement a function find that returns the length of the shortest repeating string.

// def find(s):
//     # TODO

// if __name__ == "__main__":
//     print(find("aaa")) # 1
//     print(find("abcd")) # 4
//     print(find("abcabcabcabc")) # 3
//     print(find("aybabtuaybabtu")) # 7
//     print(find("abcabca")) # 7



import java.util.*;

public  class Repeat {
  static Scanner sc = new Scanner(System.in);
  public static void main(String [] args) {
    String s = sc.nextLine();
    System.out.println(repeat(s));
  }
  
  public static int repeat(String s) {
    int n = s.length();
    
    for(int i = 1; i <= n; i++) {
      String dups = s.substring(0,i);
      if(n% i == 0) {
        boolean valid = false;
        for(int j = 0; j < n; j+=i) {
          if(!s.substring(j, j + i).equals(dups)) {
            valid = true;
            break;
          }
        }
        if(!valid){
          return i;
        }
      }
      
      
    }
    
    return n;
  }
}