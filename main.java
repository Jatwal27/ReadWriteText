import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Try and catch for Writing to text file
        try {
            FileWriter myWriter = new FileWriter("test.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //Try and catch for reading text file
        try {
            File myObj = new File("test.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (FileNotFoundException exception) {
            System.out.println("An error occurred");
            exception.printStackTrace();
        }
    }
}
