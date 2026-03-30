package FileJava;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) throws IOException {
        //How to write a file in java


        try(FileWriter writer = new FileWriter("Test.txt")){
            writer.write("I like pizzzzzza");
            System.out.println("File has been writen");
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file location..");
        }
        catch (IOException e){
            System.out.println("Could not write a file");

        }
    }
}
