import java.util.Scanner;

public class AscendingGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] names = new String[N];
        int[] numbers = new int[N];
        for (int i=0; i<N; i++) {
            names[i] = sc.next();
            numbers[i] = sc.nextInt();
        }
        for (int i=0; i<N; i++) {
            int ith_number = numbers[i];
            int index = i;
            for (int j=1; j<N; j++) {
                if (ith_number > numbers[j]) {
                    ith_number = numbers[j];
                    index = j;
                }
            }
            String temp = names[i];
            names[i] = names[index];
            names[index] = temp;
        }
        for (String e: names)
            System.out.print(e + " ");
    }    
}
