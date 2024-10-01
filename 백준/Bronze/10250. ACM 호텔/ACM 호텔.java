import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            
            int floor = n % h;
            if (floor == 0){
                floor = h;
            }
            
            int roomNum = (n / h) + 1;
            if (n % h == 0){
                roomNum = n / h;
            }
            
            System.out.printf("%d%02d\n", floor, roomNum);
            
        }
    }
}