import java.util.*;
public class rotateArray{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k % n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        for(int i = 0 ;i < n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int[] arr, int sp , int ep){
        while(sp < ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }

    }
}