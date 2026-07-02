import java.util.*;
public class LargestDigit {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:- ");
        int num = sc.nextInt();
        int max = 10; 
        while(num > 0){
            max = num % 10 < max ? num % 10 : max;
            num = num/10;
        }
        System.out.println(max);
    }
}