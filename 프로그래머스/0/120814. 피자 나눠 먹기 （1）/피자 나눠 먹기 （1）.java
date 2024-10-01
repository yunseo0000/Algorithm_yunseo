class Solution {
    public int solution(int n) {
        
        int answer = 0;
        int result = n / 7;
        
        if(n % 7 == 0){
            answer = result;
        } else{
            answer = result + 1;
        }
        
        return answer;
        }
        
}