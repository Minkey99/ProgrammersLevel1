package MemoryScoreProb;

import java.util.HashMap;
import java.util.Set;

public class MemoryScore {
    public static void main(String[] args) {
        MemoryScore ms = new MemoryScore();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
        };
        int[] result = {};

        result = ms.solution(name, yearning, photo);
        for(int n : result) {
            System.out.print(n + "\t");
        }
    }
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int result = 0;

        HashMap<String, Integer> map = new HashMap<>();
        /* key 담고 있는 컬렉션 인스턴스 생성 */
        Set<String> ks = map.keySet();

        for(int i = 0; i < name.length; i++){ map.put(name[i], yearning[i]); }

        for(int i = 0; i < photo.length; i++){
            result = 0;
            for(int j = 0; j < photo[i].length; j++){
                for(String n : ks){
                    if(n.equals(photo[i][j])) {
                        result += map.get(n);
                        break;
                    }
                }
            }
            answer[i] = result;
        }

        return answer;
    }
}
