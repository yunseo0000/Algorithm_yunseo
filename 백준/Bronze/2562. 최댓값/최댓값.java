import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[9];
        int max = 0;
        int maxIndex = 0;
        
        for (int i = 0; i < 9; i++){
            numbers[i] = sc.nextInt();
            
            if(numbers[i] > max){
                max = numbers[i]; //이전 값과 계속 비교하며 최댓값 갱신
                maxIndex = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);
        
    }
}