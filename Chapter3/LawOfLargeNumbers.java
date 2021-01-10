import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class LawOfLargeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        
        int[] numbers = new int[N];
        for (int i=0; i<N; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);
        int sum = 0;
        int count = 0;
        while (count < M) {
            for (int i=0; i<K; i++) {
                sum += numbers[N-1];
                count++;
            }
            sum += numbers[N-2];
            count++;
        }
        System.out.println(sum);
    }
}
