import java.util.Scanner;

public class GameDev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int x_coord = sc.nextInt();
        int y_coord = sc.nextInt();
        int dir = sc.nextInt();

        int[][] map = new int[N][M];
        int[][] visited = new int[N][M];  
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                map[i][j] = sc.nextInt(); 
            }
        }

        // N x M 직사각형
        // 바로 왼쪽 방향, 왼쪽 전진
        // 네 방향 이미 모두 가본 칸, 바다, 바라보는 방향 유지, 한 칸 뒤, 1단계
        // 뒤쪽 방향이 바다일 경우, 종료  
        
        while (check_move()) {
            shift_left(dir); 
            move(dir);
        }
        move_back(dir);

        // 방문한 칸의 수 출력 
        int count = 0;
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (visited[i][j] == 1) 
                    count += 1;
            }
        }
        System.out.println(count);
    }

    private boolean check_move() {
        if (visited[x_coord][y_coord+1] == 1 && map[x_coord][y_coord+1] == 1 &&
        visited[x_coord+1][y_coord] == 1 && map[x_coord+1][y_coord] == 1 &&
        visited[x_coord][y_coord-1] == 1 && map[x_coord][y_coord-1] == 1 &&
        visited[x_coord+1][y_coord] == 1 && map[x_coord+1][y_coord] == 1)
        )
            return false;
        return true; 
    }

    private int shift_left(int direction) {
        if (direction == 0)
            return 3;
        else 
            return direction-1; 
    }

    private void move(int direction) {
        if (direction == 0 && visited[x_cooord][y_coord+1] == 0 && map[x_coord][y_coord+1] == 0) {
            y_coord++;
        }
        else if (direction == 1 && visited[x_coord+1][y_cooord] == 0 && map[x_coord+1][y_coord] == 0) {
            x_coord++;
        }
        else if (direction == 2 && visited[x_coord][y_coord-1] == 0 && map[x_coord][y_coord-1] == 0) {
            y_coord--;
        }
        else if (direction == 3 && visited[x_coord-1][y_coord] == 0 && map[x_coord-1][y_coord] == 0) {
            x_coord--;
        }
        visited[x_coord][y_coord] = 1;
    }

    private boolean move_back(int direction) {
        shift_left(direction);
        shift_left(direction);
        move(direction);
        // 뒤쪽 방향이 바다라면 
        shift_left(direction);
        shift_left(direction); 
    }
}