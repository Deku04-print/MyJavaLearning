package Generic;

public class GenericMethods {
    public static void main(String[] args){
        Integer[] myArr1 = {23,43,23,4,4,546,3};
        String[] myArr2 = {"Hello","World"};

        printArray(myArr1);
        printArray(myArr2);


    }


    public static <T> void printArray(T[] myArray){

        for (T element:myArray){
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
