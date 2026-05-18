package Generic;

import java.util.ArrayList;

public class GenericExcercise {
    public static void main(String[] args){

        ArrayList<Object> variables = new ArrayList<>();

        Double doubleNumber= 1.5;
        String name = "Sally";
        Integer intNumber =1;
        Character letter = 'a';
        variables.add(doubleNumber);
        variables.add(name);
        variables.add(intNumber);
        variables.add(letter);

        for (Object item : variables) {
            displayClassName(item); // Calls the method on the current object
        }

    }

    static  <T> void displayClassName(T variable){
        System.out.println(variable.getClass().getName());
    }


}
