import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class OrderInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        LinkedList<Character> ordered_alphabet = new LinkedList<Character>();

        int sum = 0;
        for (int i=0; i<input.length(); i++) {
            if ((input.charAt(i) >= 'A') && (input.charAt(i) <= 'Z')) {
                ordered_alphabet.add(input.charAt(i));
            }
            else {
                sum += input.charAt(i) - '0'; 
            }
        }
        Collections.sort(ordered_alphabet);
        Iterator<Character> itr = ordered_alphabet.iterator();
        while (itr.hasNext()) 
            System.out.print(itr.next());
        System.out.println(sum);
    }
}
