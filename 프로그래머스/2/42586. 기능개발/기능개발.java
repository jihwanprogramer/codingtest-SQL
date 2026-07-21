import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        List<Integer> result = new ArrayList<>();

        // 첫 번째 기능의 완료일
        int standardDay = (100 - progresses[0] + speeds[0] - 1) / speeds[0];
        int count = 1;

        for (int i = 1; i < progresses.length; i++) {

            // 현재 기능 완료일
            int day = (100 - progresses[i] + speeds[i] - 1) / speeds[i];

            if (day <= standardDay) {
                // 앞 기능보다 먼저 끝나므로 같이 배포
                count++;
            } else {
                // 새로운 배포 시작
                result.add(count);
                standardDay = day;
                count = 1;
            }
        }

        // 마지막 배포 추가
        result.add(count);

        return result.stream().mapToInt(i -> i).toArray();
    }
}