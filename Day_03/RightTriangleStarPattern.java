import java.util.*;

public class RightTriangleStarPattern {
    public static void main(String[] args) {
        int ip = 5;

        for (int i = 1; i <= ip; i++) {
            for (int sp = ip - 1; sp >= i; sp--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}