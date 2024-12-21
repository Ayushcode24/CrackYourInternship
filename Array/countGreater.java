// Given n array elements, count total no. of elements having atleast one element greater than itself.
import java.util.*;
public class countGreater{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++ ){
            arr[i] = sc.nextInt();
        }
        int count = counter(arr,n);
        System.out.println(  n-count);
    }
    public static int counter(int[] arr, int n){
        int max  = Integer.MIN_VALUE;
        for(int i = 0; i  < n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i]==max){
                count++;
            }
        }
        return count;
    }
}