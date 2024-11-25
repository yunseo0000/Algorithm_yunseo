import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;

        // 심사 시간을 정렬
        Arrays.sort(times);

        // 최소 시간
        long left = 0;

        // 최대 시간 (모든 사람이 가장 느린 심사관에게 받는 경우)
        long right = times[times.length - 1] * (long) n;

        // 이진 탐색
        while (left <= right) {
            long mid = (left + right) / 2;
            long complete = 0;

            // 주어진 시간(mid) 동안 각 심사관이 처리 가능한 사람 수 계산
            for (int time : times) {
                complete += mid / time;
            }

            // 모든 사람이 검사받을 수 없는 경우, 시간을 늘린다.
            if (complete < n) {
                left = mid + 1;
            } 
            // 모든 사람이 검사받았으나 더 적은 시간으로 가능할 수도 있다.
            else {
                right = mid - 1;
                answer = mid; // 현재 시간이 가능한 최소 시간 후보
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        // 테스트 입력
        int n = 6;               // 검사받아야 하는 사람 수
        int[] times = {7, 10};   // 각 심사관이 한 명을 검사하는 데 걸리는 시간

        // 결과 출력
        System.out.println(s.solution(n, times)); // 기대 출력: 28
    }
}
