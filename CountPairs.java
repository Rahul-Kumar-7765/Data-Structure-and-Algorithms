package Array;

import java.util.Scanner;

public class CountPairs {
    public static void main(String[] args) {
        // count pairs in Array

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = sc.nextInt();
        int count =0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==sum){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
