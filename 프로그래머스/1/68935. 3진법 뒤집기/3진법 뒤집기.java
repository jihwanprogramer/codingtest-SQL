import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        List<Integer> numList = new ArrayList<>();
        int answer = 0;
        while(n>0){
            numList.add(n%3);
            n /= 3;
        }
         for (int i = 0; i < numList.size(); i++) {
            answer += numList.get(numList.size() - 1 - i) * Math.pow(3, i); 
        }
        return answer;
    }
}