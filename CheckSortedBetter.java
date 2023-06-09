package Array;

public class CheckSortedBetter {
    public static boolean checkSortedBetter(int arr[] , int start){
        if (start >= arr.length-1){
            return true;
        }if (arr[start] > arr[start+1]){
            return false;
        }
        boolean smallAns = checkSortedBetter(arr,start+1);
        return smallAns;
    }
    public static void main(String[] args) {
        // check sortef better code for coder

        int arr[] = {1,2,3};
        System.out.println(checkSortedBetter(arr,0));
    }
}
