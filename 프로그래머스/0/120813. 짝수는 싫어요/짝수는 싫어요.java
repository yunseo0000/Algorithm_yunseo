public class Solution {
    public int[] solution(int n) {
        int[] result = new int[(n + 1) / 2];
        
        for (int i = 0, num = 1; num <= n; i++, num += 2) {
            result[i] = num;
        }
        
        return result;
    }
}
