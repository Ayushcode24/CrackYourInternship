import java.util.*;
public class reverseArray{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        for(int i = 0;i < n; i++){
            System.out.print(arr[i] +" ");
        }
        
    }
    public static void reverse(int[] arr){
        int sp = 0;
        int ep = arr.length - 1;
        while(sp < ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }
}