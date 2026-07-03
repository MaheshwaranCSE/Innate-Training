import java.util.*;

public class ColumnNumberPattern {
    public static void main(String[] args) {
        int ip = 5;

        for (int i = 1; i <= ip; i++) {
            for (int j = 1; j <= ip; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}