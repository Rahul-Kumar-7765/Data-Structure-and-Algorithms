package Array;

public class CheckSorted {
    public static boolean checkSorted(int arr[]){
        if (arr.length <=1){
            return true;
        }
        int smallArr[] = new int[arr.length-1];
        for (int i=1;i<arr.length;i++){
            smallArr[i-1] = arr[i];
        }
        boolean smallAns = checkSorted(smallArr);
        if (!smallAns){
            return false;
        }
        if (arr[0] <=arr[1]){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        // check sorted or not sorted Array Question
        
        int arr[] = {2,1,3,6,9};
        System.out.println(checkSorted(arr));
    }
}
