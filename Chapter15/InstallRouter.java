import java.util.Scanner;

public class InstallRouter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] numbers = new int[N];
        for (int i=0; i<N; i++) {
            numbers[i] = sc.nextInt();
        }
    }    
}
