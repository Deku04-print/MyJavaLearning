package FileJava;

import java.io.*;

public class Files {
    public static void main(String[] args) throws IOException {
        //How to write a file in java


//        try(FileWriter writer = new FileWriter("Test.txt")){
//            writer.write("I like pizzzzzza");
//            System.out.println("File has been writen");
//        }
//        catch (FileNotFoundException e){
//            System.out.println("Could not locate file location..");
//        }
//        catch (IOException e){
//            System.out.println("Could not write a file");
//
//        }

        String filePath = "T:\\Java Training\\Learning\\MyFirstProject\\Test.txt";


        try(BufferedReader bf = new BufferedReader(new FileReader(filePath))){


//            System.out.println("That file exist...");
            String line;
            while ((line = bf.readLine())!=null){
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found..!!");

        }
        catch (IOException e){
            System.out.println("Something wentt Wrong....!!");

        }

    }
}
