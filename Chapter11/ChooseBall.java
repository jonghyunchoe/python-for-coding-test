import java.util.Scanner;

public class ChooseBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] balls = new int[N];
        for (int i=0; i<N; i++) {
            balls[i] = sc.nextInt();
        }

        int count = (N) * (N-1) / 2;
        int overlaps = 0;

        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                if (balls[i] == balls[j]) 
                    overlaps++;
            }
        }

        count -= overlaps;
        System.out.println(count);
    }
    
}
