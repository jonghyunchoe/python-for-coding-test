import java.util.Scanner;

public class ChangeToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = operations(N);
        System.out.println(count);
    }

    private static int operations(int number) {
        int count1 = 9999;
        int count2 = 9999;
        int count3 = 9999;
        int count4 = 9999;
        
        if (number == 1) 
            return 0;
        else {
            if (number%5 == 0)
                count1 = operations(number/5) + 1;
            if (number%3 == 0)
                count2 = operations(number/3) + 1;
            if (number%2 == 0)
                count3 = operations(number/2) + 1;
            count4 = operations(number-1) + 1;
        }
        int value = Math.min(count1, count2);
        value = Math.min(value, count3);
        value = Math.min(value, count4);
        return value;
    } 
}
