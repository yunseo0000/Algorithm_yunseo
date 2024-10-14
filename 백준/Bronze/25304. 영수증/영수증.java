import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total = sc.nextInt();
        int n = sc.nextInt(); //상품종류 수
        int totalAmount = 0;
        
        for (int i = 0; i < n; i++){
            int price = sc.nextInt();
            int k = sc.nextInt();
            totalAmount += price * k;
        }
        if (total == totalAmount){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}