import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Votes1366 {
    public static String rankTeams(String[] votes) {
        Map<Character, int[]> ranking = new HashMap<>(); // key: team id, value: ranking array for each ranking position 
        for (char vid : votes[0].toCharArray()) {
            ranking.put(vid, new int[votes[0].length()]);
        }
        for (String vote : votes) {
            for (int i = 0; i < vote.length(); i++) {
                ranking.get(vote.charAt(i))[i]++;
            }
        }
        // sort the ranking map
        List<Map.Entry<Character, int[]>> result = new ArrayList<>(ranking.entrySet());
        result.sort((a, b) -> {
            for (int i = 0; i < a.getValue().length; i++) {
                if (a.getValue()[i] != b.getValue()[i]) {
                    return b.getValue()[i] - a.getValue()[i];
                }
            }
            return a.getKey() - b.getKey();
        });
        // build the result string
        StringBuilder ans = new StringBuilder();
        for (Map.Entry<Character, int[]> entry : result) {
            ans.append(entry.getKey());
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String votes[] = {"ABC","ACB","ABC","ACB","BCA"};
        System.out.println(rankTeams(votes));
    }
}
