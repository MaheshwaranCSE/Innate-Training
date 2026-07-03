import java.util.*;

public class RowNumberPattern {
    public static void main(String[] args) {
        int ip = 5;

        for (int i = 1; i <= ip; i++) {
            for (int j = 1; j <= ip; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}