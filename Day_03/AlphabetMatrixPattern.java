import java.util.*;

public class AlphabetMatrixPattern {
    public static void main(String[] args) {
        int ip = 5;
        int inc = 0;

        for (int i = 1; i <= ip; i++) {
            for (int j = 1; j <= ip; j++) {
                System.out.print((char) ('A' + inc) + " ");
                inc++;
            }
            System.out.println();
        }
    }
}