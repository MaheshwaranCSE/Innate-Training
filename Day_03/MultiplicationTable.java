import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        int i  = 5;
        int table = 1;
        for (i = 1; i <= 10; i++) {
            for (table = 1; table <= 10; table++) {
                System.out.println(i + " * " + table + " = " + (i * table));
            }
        }
    }
}