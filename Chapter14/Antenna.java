import java.util.Scanner;

public class Antenna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] locations = new int[N];
        for (int i=0; i<N; i++) {
            locations[i] = sc.nextInt();
        }
        int antenna_loc = 0;
        for (int i=0; i<N; i++) {
            antenna_loc += locations[i];
        }
        antenna_loc = antenna_loc / N;
        System.out.println(antenna_loc);
    }
}