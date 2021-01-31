import java.util.Scanner;
import java.util.Arrays;

public class EfficientCashDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] cash_types = new int[N];
        for (int i=0; i<N; i++)
            cash_types[i] = sc.nextInt();
        
        Arrays.sort(cash_types);

        int count = 0;
        int index = N-1;
        while (M != 0 && index >= 0) {
            if (M >= cash_types[index]) {
                M = M - cash_types[index];
                count++;
            }
            else {
                index--;
            }
        }
        if (index < 0)
            count = -1;

        System.out.println(count);
    }
}
