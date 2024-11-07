import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void hanoi(int n, int start, int dest, int waypoint, List<int[]> moves) {
        if (n == 1) {
            moves.add(new int[] {start, dest});  
        } else {
            hanoi(n - 1, start, waypoint, dest, moves);
            
            moves.add(new int[] {start, dest});
            
            hanoi(n - 1, waypoint, dest, start, moves);
        }
    }

    public int[][] solution(int n) {
        List<int[]> moves = new ArrayList<>(); 
        hanoi(n, 1, 3, 2, moves);

        return moves.toArray(new int[0][]);
    }
}