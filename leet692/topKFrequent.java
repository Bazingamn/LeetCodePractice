package leet692;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class topKFrequent {
}

class Solution {
    public List<String> topK(String[] words, int k) {
        Map<String, Integer> cnt = new HashMap<>();
        for (String word:words) {
            cnt.put(word, cnt.getOrDefault(word, 0)+1);
        }
        List<String> rec = new ArrayList<>();
        return null;
    }
}