import java.util.*;

public class InvertedRightTriangleStarPattern {
    public static void main(String[] args) {
        int ip = 5;

        for (int i = 1; i <= ip; i++) {
            for (int sp = 1; sp < i; sp++) {
                System.out.print(" ");
            }

            for (int star = ip; star >= i; star--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}