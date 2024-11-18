import java.util.*;
        
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // N개의 수 입력받기
        int N = scanner.nextInt();
        int[] numbers = new int[N];
        
         for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        Arrays.sort(numbers);
        
        for (int number : numbers){
            System.out.println(number);
        }
        
    }
}