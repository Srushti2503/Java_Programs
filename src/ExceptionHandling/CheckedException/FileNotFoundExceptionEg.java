package ExceptionHandling.CheckedException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptionEg {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data.txt")) {
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        } catch (IOException e) {
            System.out.println("Error while reading file.");
        }
    }
}
