import java.util.*;

public class MultiplicationTrianglePattern {
    public static void main(String[] args) {
        int ip = 8;

        for (int i = 1; i <= ip; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }
}