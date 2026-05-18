package LEETCODE_Train;

public class Dupli {


    public static boolean containDup(int[] arr){

        for (int i = 0;i< arr.length;i++){
            for (int j =0+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    return true;
                }
            }
        }


      return false;

    }

    public static void main(String[] args){
        int[] arr1={1,2,3,4};
        boolean result = containDup(arr1);
        System.out.println(result);
    }
}
