import java.util.Scanner;
import java.util.Arrays;

public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] numbers = new int[N][M];
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int[] row_min = new int[N];
        for (int i=0; i<N; i++) {
            int min = numbers[i][0];
            for (int j=1; j<M; j++) {
                if (numbers[i][j] < min) {
                    min = numbers[i][j];
                }
            }
            row_min[i] = min;
        }
        Arrays.sort(row_min);
        System.out.println(row_min[N-1]);
    }
}
