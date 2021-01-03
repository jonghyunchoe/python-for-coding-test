import java.util.Scanner;

public class GameDev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int x_coord = sc.nextInt();
        int y_coord = sc.nextInt();
        int dir = sc.nextInt();

        // N x M 직사각형
        // 바로 왼쪽 방향, 왼쪽 전진
        // 네 방향 이미 모두 가본 칸, 바다, 바라보는 방향 유지, 한 칸 뒤, 1단계
        // 뒤쪽 방향이 바다일 경우, 종료  
        
        // 방문한 칸의 수 출력 
    }
}