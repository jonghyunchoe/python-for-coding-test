import java.util.Scanner;

public class Leftover {
    public static void main(String[] args) {
        int[] coin_type = {500, 100, 50, 10};
        int index = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (index < 4 && N >= coin_type[index]) {
            count += N/coin_type[index];
            N = N%(coin_type[index]);
            while (index < 4 && N < coin_type[index]) {
                index++;
            }
        }
        System.out.println(count);
    }   
}
