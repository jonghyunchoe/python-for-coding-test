import java.util.Scanner;

public class LuckyStraight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String left_N = N.substring(0, N.length() / 2);
        String right_N = N.substring(N.length() / 2);
        
        int left_number = Integer.parseInt(left_N);
        int right_number = Integer.parseInt(right_N);

        int left_sum = add_digits(left_number);
        int right_sum = add_digits(right_number);

        if (left_sum == right_sum) {
            System.out.println("LUCKY");
        }
        else {
            System.out.println("READY");
        }
    }   
    
    private static int add_digits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
