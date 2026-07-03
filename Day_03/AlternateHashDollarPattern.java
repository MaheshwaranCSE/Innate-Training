import java.util.*;

public class AlternateHashDollarPattern {
    public static void main(String[] args) {
        int ip = 5;

        for (int i = 1; i <= ip; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1)
                    System.out.print("#");
                else
                    System.out.print("$");
            }

            System.out.println();
        }
    }
}