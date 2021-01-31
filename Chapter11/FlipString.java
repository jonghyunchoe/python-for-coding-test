import java.util.Scanner;

public class FlipString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); 

        int count1 = flip(input, '0');
        int count2 = flip(input, '1');
        System.out.println(Math.min(count1, count2));
    }

    private static int flip(String input, char value) {
        int count = 0;
        int check = 0; 
        for (int i = 0; i<input.length(); i++) {
            if (input.charAt(i) == value) {
                if (check == 0) {
                    count++;
                    check = 1;
                }
            }
            else {
                check = 0;
            }
        }
        return count;
    }
}
