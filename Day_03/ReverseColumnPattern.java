import java.util.*;

public class ReverseColumnPattern {
    public static void main(String[] args) {
        int ip = 5;

        for (int i = ip; i >= 1; i--) {
            for (int j = ip; j >= ip - i + 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}