package Arrays.arraylist_prob;

import java.util.ArrayList;

public class NewArrayList {

    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(32);
        arr.add(33);
        arr.add(34);
        System.out.println(arr);
        arr.remove(2);
        arr.remove(0);
        System.out.println(arr);


    }
}
