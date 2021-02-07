import java.util.Scanner; 

public class Snake {
    static int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    static int direction_number = 0;
    static int[] current_direction = direction[direction_number];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] apple_locations = new int[K][2];
        // K apples 
        for (int i=0; i<K; i++) {
            apple_locations[i][0] = sc.nextInt();
            apple_locations[i][1] = sc.nextInt();
        }
        int L = sc.nextInt();
        int[] switch_time = new int[L];
        String[] change_directions = new String[L];
        // L directions 
        for (int i=0; i<L; i++) {
            switch_time[i] = sc.nextInt();
            change_directions[i] = sc.next();
        }

        int snake_length = 1;
        int time = 0;
        boolean game_over = false; 

        // Do I need to record all body coordinates and check if they collide?
        while (!game_over) {
            // move
            
            time++;
        }
    
        // meets apple
        // meets wall, (x, 7), (7, x), (x, 0), (0, x) 
        // meets body  
    }

    private static void move_right() {
        if (direction_number == 3)
            direction_number = 0;
        else {
            direction_number++;
        }
        current_direction = direction[direction_number];
    }

    private static void move_left() {
        if (direction_number == 0) 
            direction_number = 3;
        else {
            direction_number--;
        }
        current_direction = direction[direction_number];
    }
}
