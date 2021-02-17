import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt();
        int x = sc.nextInt();
        int[] numbers = new int[N];
        for (int i=0; i<N; i++) {
            numbers[i] = sc.nextInt();
        }
        // 1. First find the number through binary search 
        int count = 1;
        int index = binary_search(numbers, x, 0, numbers.length);
        // 2. Check left and count 
        for (int i=index-1; i>=0; i--) {
            if (numbers[i] == x)
                count++; 
        }
        // 3. Check right and count
        for (int i=index+1; i<numbers.length; i++) {
            if (numbers[i] == x)
                count++;
        }
        if (index == -1)
            System.out.println(-1);
        else 
            System.out.println(count);
    }

    private static int binary_search(int[] array, int number, int left, int right) {
        if (left == right)
            return -1; 
        int mid = (left + right) / 2;
        if (array[mid] == number) 
            return mid;
        else if (array[mid] > number)
            return binary_search(array, number, left, mid);
        else 
            return binary_search(array, number, mid+1, right);
    }
}

