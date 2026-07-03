import java.util.*;

public class DecreasingStarPattern {
    public static void main(String[] args) {
        int ip = 5;

        for (int i = ip; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}