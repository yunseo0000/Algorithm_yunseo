import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //문자열 입력받기
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine(); //입력을 문자열로 받기
        
        int wordCount = 0;
        
        sentence = sentence.trim(); //앞뒤 공백 제거
        
        // 빈 문자열이라면 단어 개수는 0
        if (!sentence.isEmpty()) {
            wordCount = 1; //앞뒤공백을 제거하고 문자열이 비지 않았으면 단어개수 하나 늘림
            // 문자열을 순회하며 공백을 기준으로 단어를 셈
            for (int i = 0; i < sentence.length(); i++) {
                // 현재 문자가 공백인 경우
                if (sentence.charAt(i) == ' ') {
                    wordCount++;
                }
            }
        }
        
        // 단어 개수 출력
        System.out.println(wordCount);
        
        s.close();
    }
}
