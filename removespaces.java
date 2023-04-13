import java.util.Scanner;

public class removespaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        String newString = inputString.replaceAll(" ", "");
        System.out.println("Original string: " + inputString);
        System.out.println("New string without spaces: " + newString);
    }
