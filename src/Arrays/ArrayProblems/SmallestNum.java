package Arrays.ArrayProblems;

public class SmallestNum {

    public static void main(String[] args){

        int[] arr ={2, 5, 1, 7, 3};

        int n=arr.length;
        int maxValue=Integer.MAX_VALUE;

        for (int i=0;i<n;i++){
            int current=arr[i];
            if(maxValue>current) {
                maxValue=current;
            }
        }
        System.out.println("The Biggest Number is :" + maxValue);
    }
}
