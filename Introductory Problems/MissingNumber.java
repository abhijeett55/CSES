import java.util.*;


public class MissingNumber {
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args) {
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int missing = n*(n+1)/2;
        System.out.println(missing);
    }
}
