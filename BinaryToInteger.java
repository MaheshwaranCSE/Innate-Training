import java.util.Scanner;
public class BinaryToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
        int integerValue = binaryToInteger(binaryString);
        System.out.println("The integer value of binary " + binaryString + " is: " + integerValue);
        scanner.close();
    }
    public static int binaryToInteger(String binary) {
        int result = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            char bit = binary.charAt(length - 1 - i);
            if (bit == '1') {
                result += Math.pow(2, i);
            }
        }
        return result;
    }
}