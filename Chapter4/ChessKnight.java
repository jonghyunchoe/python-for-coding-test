import java.util.Scanner;

public class ChessKnight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coord = sc.nextLine();

        int x_coord = (int) coord.charAt(0) - 96;
        int y_coord = (int) coord.charAt(1) - 48; 

        int possible_moves = 0;

        if ((x_coord + 2) <= 8 && (y_coord + 1) <= 8)
            possible_moves += 1; 
        if ((x_coord + 2) <= 8 && (y_coord - 1) >= 1)
            possible_moves += 1; 
        if ((x_coord - 2) >= 1 && (y_coord + 1) <= 8)
            possible_moves += 1; 
        if ((x_coord - 2) >= 1 && (y_coord - 1) >= 1)
            possible_moves += 1; 
        if ((x_coord + 1) <= 8 && (y_coord + 2) <= 8)
            possible_moves += 1; 
        if ((x_coord + 1) <= 8 && (y_coord - 2) >= 1)
            possible_moves += 1; 
        if ((x_coord - 1) >= 1 && (y_coord + 2) <= 8)
            possible_moves += 1; 
        if ((x_coord - 1) >= 1 && (y_coord - 2) >= 1)
            possible_moves += 1; 

        System.out.println(possible_moves); 
    }
}
