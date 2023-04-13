import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter a character: ");
        char charToFind = scanner.next().charAt(0);
        scanner.close();

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == charToFind) {
                count++;
            }
        }
        System.out.println("The count of '" + charToFind + "' in the string is: " + count);
    }
}
