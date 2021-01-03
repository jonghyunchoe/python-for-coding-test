import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt();

        // 3, 13, 23
        int number_threes = 0;
        if (N >= 3 && N < 13) 
            number_threes = 1;
        else if (N >= 13 && N < 23) 
            number_threes = 2;
        else if (N==23)
            number_threes = 3;

        System.out.println(1575*(N+1-number_threes) + 3600*number_threes);
    }
    
}
