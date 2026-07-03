import java.util.*;

public class DecreasingSameNumberPattern {
    public static void main(String[] args) {
        int ip = 5;

        for (int i = 1; i <= ip; i++) {
            for (int j = ip; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}