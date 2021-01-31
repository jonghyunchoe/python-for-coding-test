import java.util.Scanner;

public class AddOrMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        int max = input.charAt(0) - '0'; 
        for (int i=1; i<input.length(); i++) {
            int max1 = max * (input.charAt(i) - '0');
            int max2 = max + (input.charAt(i) - '0');
            max = Math.max(max1, max2);
        }
        System.out.println(max);
    }
}
