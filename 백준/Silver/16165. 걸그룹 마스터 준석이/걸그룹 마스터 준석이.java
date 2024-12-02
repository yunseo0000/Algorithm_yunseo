import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // key : 그룹 명, value : 해당 그룹의 멤버들의 이름이 담긴 TreeSet
        HashMap<String, TreeSet<String>> groupToMembers = new HashMap<>();

        // 멤버별 속한 그룹을 HashMap으로 저장
        HashMap<String, String> memberToGroup = new HashMap<>();

        // 입력 받을 걸그룹의 수
        int N = Integer.parseInt(st.nextToken());
        // 맞춰야 하는 문제의 수
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            // 그룹명
            String groupName = br.readLine();
            // 멤버 수
            int member_size = Integer.parseInt(br.readLine());

            // 멤버들을 오름차순으로 저장할 TreeSet
            TreeSet<String> members = new TreeSet<>();

            for (int j = 0; j < member_size; j++) {
                String memberName = br.readLine();

                members.add(memberName);
                memberToGroup.put(memberName, groupName);
            }
            groupToMembers.put(groupName, members);
        }

        for(int i = 0; i < M; i++) {
            String quiz = br.readLine();
            // sort가 0이면 quiz가 그룹 이름, 1이면 quiz가 멤버 이름
            int sort = Integer.parseInt(br.readLine());

            if (sort == 0) {
                // 멤버를 사전순으로 출력
                TreeSet<String> members = groupToMembers.get(quiz);
                for(String member : members) {
                    System.out.println(member);
                }
            } else {
                // 해당 멤버가 속한 그룹명을 출력
                System.out.println(memberToGroup.get(quiz));
            }
        }
    }
}