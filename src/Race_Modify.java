import java.util.HashMap;

public class Race_Modify {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        Race_Modify rm = new Race_Modify();

        String[] result = rm.solution(players, callings);
        for(String s : result) {
            System.out.print(s + " ");
        }
    }
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < players.length; i++){ map.put(players[i], i); }

        for (String calling : callings) {
            int currentPlayerIdx = map.get(calling);
            String currentPlayer = players[currentPlayerIdx];
            String beforePlayer = players[currentPlayerIdx-1];

            map.put(currentPlayer, currentPlayerIdx-1);
            map.put(beforePlayer, currentPlayerIdx);

            swap(players, currentPlayerIdx, currentPlayerIdx-1);
        }
        return players;
    }

    private <T> void swap(T[] p, int j, int k){
        T temp = p[j];
        p[j] = p[k];
        p[k] = temp;
    }
}
