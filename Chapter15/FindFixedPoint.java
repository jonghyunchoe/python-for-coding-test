import java.util.Scanner;

public class FindFixedPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];
        for (int i=0; i<N; i++)
            numbers[i] = sc.nextInt();
        int value = binary_search(numbers, 0, numbers.length);
        System.out.println(value);
    }

    private static int binary_search(int[] array, int left, int right) {
        if (left == right)
            return -1;
        int mid = (left + right)/2;
        if (array[mid] == mid)
            return mid;
        else if (array[mid] > mid) 
            return binary_search(array, 0, mid);
        else 
            return binary_search(array, mid+1, right);
    }
}