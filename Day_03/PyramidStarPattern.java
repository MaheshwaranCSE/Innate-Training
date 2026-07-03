import java.util.*;

public class PyramidStarPattern {
    public static void main(String[] args) {
        int ip = 5;

        for (int i = 1; i <= ip; i++) {
            for (int sp = 1; sp <= ip - i; sp++) {
                System.out.print(" ");
            }

            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}