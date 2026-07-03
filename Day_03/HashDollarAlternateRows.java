import java.util.*;

public class HashDollarAlternateRows {
    public static void main(String[] args) {
        int ip = 5;

        for (int i = 1; i <= ip; i++) {
            char ch = (i % 2 == 1) ? '#' : '$';

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}