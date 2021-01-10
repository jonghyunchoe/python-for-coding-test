import java.util.Scanner;
import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i=0; i<N; i++) 
            A[i] = sc.nextInt();
        for (int i=0; i<N; i++)
            B[i] = sc.nextInt();

        Arrays.sort(A);
        Arrays.sort(B);
        for (int i=0; i<K; i++) {
            swap(A, B, i, N-i-1);
        }
        int sum = 0;
        for (int e: A)
            sum += e;   
        System.out.println(sum);
    }
    
    private static void swap(int[] a, int[] b, int i, int j) {
        int temp = a[i];
        a[i] = b[j];
        b[j] = temp;
    }
}
