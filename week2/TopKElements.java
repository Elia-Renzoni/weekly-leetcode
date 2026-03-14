
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


class TopKElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> occs = new HashMap<>();
        for (int num : nums) {
            occs.put(num, occs.getOrDefault(num, 0) + 1);
        }

        List<Integer> freqs = new ArrayList<>(occs.values());
        Collections.sort(freqs, Collections.reverseOrder());

        List<Integer> topFreqs = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            topFreqs.add(freqs.get(i));
        }

        List<Integer> resultList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : occs.entrySet()) {
            if (topFreqs.contains(entry.getValue())) {
                resultList.add(entry.getKey());
                topFreqs.remove(entry.getValue());
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
