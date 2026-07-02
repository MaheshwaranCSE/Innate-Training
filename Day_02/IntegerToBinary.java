import java.util.Scanner;
public class IntegerToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        String binaryString = Integer.toBinaryString(number);
        System.out.println("Binary representation of " + number + " is: " + binaryString);
    }
}