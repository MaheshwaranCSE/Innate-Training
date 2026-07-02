public class ArmstrongNumbers {
    public static void main(String[] args) {

        System.out.println("3-digit Armstrong numbers are:");

        for (int num = 100; num <= 999; num++) {
            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit * digit);
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}