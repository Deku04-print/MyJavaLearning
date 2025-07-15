package Arrays.ArrayProblems;

public class BiggestNum {

    public static void main(String[] args){
        int[] arr={10, 4, 6, 8, 12};

        int n=arr.length;
        int maxValue=Integer.MIN_VALUE;

        for (int i=0;i<n;i++){
            int current=arr[i];
            if(maxValue<current) {
                maxValue=current;
            }


        }
        System.out.println("The Biggest Number is :" + maxValue);
    }
}
//maxValue= Math.max(maxValue,arr[i]);