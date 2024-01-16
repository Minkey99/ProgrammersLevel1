package RaceProb;

public class Race {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        String[] result = solution(players, callings);
        for(String s : result) {
            System.out.print(s + " ");
        }
    }
    public static String[] solution(String[] players, String[] callings) {
        for(int i = 0; i < callings.length; i++){
            for(int j = 0; j < players.length; j++){
                if(callings[i].equals(players[j])){
                    swap(players, j, j-1);
                    break;
                }
            }
        }
        return players;
    }

    private static <T> void swap(T[] p, int j, int k){
        T temp = p[j];
        p[j] = p[k];
        p[k] = temp;
    }
}
