import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 스캐너 객체 생성 (입력을 받기 위해)
        Scanner scanner = new Scanner(System.in);
        
        // 두 정수를 입력받음
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // A에서 B를 뺀 결과 출력
        System.out.println(A - B);
        
        // 스캐너 객체 닫기
        scanner.close();
    }
}
