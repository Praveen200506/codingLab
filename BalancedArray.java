
import java.util.*;
public class BalancedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int[] arr = new int[n];
            int sum =0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
                sum +=arr[i];
            }
            if(n==1){
                System.out.println("Yes");
                continue;
            }
            int prevSum =0;
            int i ;
            for (i= 0; i < n-1; i++) {
                if (sum-arr[i] == prevSum) {
                    System.out.println("Yes");
                    break;
                }
                prevSum += arr[i];
                sum -= arr[i];
            }
            if (i == (n-1)) {
                if (sum==0) {
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
        s.close();
    }
}
