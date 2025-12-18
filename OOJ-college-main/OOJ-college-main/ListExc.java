import java.util.Scanner;

public class ListExc {
    public static void main(String[] args) {
        String[] items = {"Apple", "Banana", "Cherry", "Date"};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter index (0–3): ");
            int index = sc.nextInt();

            System.out.println("Item: " + items[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range!");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        }
    }
}
