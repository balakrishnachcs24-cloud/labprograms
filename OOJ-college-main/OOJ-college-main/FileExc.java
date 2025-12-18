import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = sc.nextLine();

        try {
            File file = new File(filename);
            Scanner fileReader = new Scanner(file); // may throw FileNotFoundException

            System.out.println("File opened successfully!");
            fileReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}
