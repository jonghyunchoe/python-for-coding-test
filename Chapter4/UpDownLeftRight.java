import java.util.Scanner;

public class UpDownLeftRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();

        String[] directions = input.split(" ");

        int x_coord = 1;
        int y_coord = 1;
        for (int i=0; i<directions.length; i++) {
            if (directions[i].equals("U") && (x_coord-1) != 0)
                x_coord--;
            else if (directions[i].equals("D") && x_coord != N) 
                x_coord++;
            else if (directions[i].equals("L") && (y_coord-1) != 0)
                y_coord--;
            else if (directions[i].equals("R") && y_coord != N) 
                y_coord++; 
        }
        
        System.out.println(x_coord + " " + y_coord);
    }
}