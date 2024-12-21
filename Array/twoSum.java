// Brute Force Approach
import java.util.*;
public class twoSum{
    Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean result = twoSum(arr,target,n)
        System.out.println(result);
        
    }
    public static boolean twoSum(int[] arr, int target, int n ){
        for(int i = 0; i< n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}