package Generic;

import java.util.ArrayList;


/* Generic Types Allow you to define a class,
 interface, or Method placeholders(TYPE PARAMETERS)
 for the data types they will work with....!!
  */
public class Problem1 {

    public static void main(String[] args){
        Pair<String,Integer> pair=new Pair<>("Age",21);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }

}
