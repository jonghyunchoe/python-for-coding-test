import java.util.Scanner;

public class Subjects {
    int N;
    Student[] students = new Student[N];
    Scanner sc = new Scanner(System.in);
    for (int i=0; i<N; i++) {
        students[i].name = sc.next();
        students[i].korean = sc.nextInt();
        students[i].english = sc.nextInt();
        students[i].math = sc.nextInt();
    }


}

class Student {
    String name;
    int korean;
    int english;
    int math; 
}
