import java.util.Scanner;

public class FrozenDrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] ice_board = new int[N][M];
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                ice_board[i][j] = sc.nextInt();
            }
        }
        
    } 
}
