import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class UpDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] numbers = new Integer[N];
        for (int i=0; i<N; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers, Collections.reverseOrder());
        for (int e: numbers)
            System.out.print(e + " ");
    }
}