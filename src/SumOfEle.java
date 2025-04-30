
//Calculate the Sum of All Elements in an Array
public class SumOfEle {

    public static void main(String[] args){

        int[] arr={1, 2, 3, 4, 5};
        int sum=0;
        int n = arr.length;
        for(int i=0 ;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of the all elements :"+sum);
    }
}
