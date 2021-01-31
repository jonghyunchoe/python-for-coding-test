import java.util.Scanner;
import java.util.Arrays;

public class ExplorerGuild {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] explorers = new int[N];
        for (int i=0; i<N; i++) {
            explorers[i] = sc.nextInt();
        }

        Arrays.sort(explorers);
        
        int count = 0;
        while (N >= 1) {
            int groupsize = explorers[N-1];
            if (N >= groupsize) {
                count++;
                N -= groupsize;
            }
        }
        System.out.println(count);
    }
}
