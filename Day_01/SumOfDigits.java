import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:- ");
        int num = sc.nextInt();
        int res = 0;
        while(num > 0){
            res = res + num%10;
            num = num/10;
        }
    }
}