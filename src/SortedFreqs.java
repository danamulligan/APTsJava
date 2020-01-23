import java.util.TreeMap;
public class SortedFreqs {
	public int[] freqs(String[] data) {
		TreeMap<String, Integer> map = new TreeMap<>();

		for(String s : data) {
			map.putIfAbsent(s, 0);
			map.put(s, map.get(s) + 1);
		}
		int[] ret = new int[map.keySet().size()];
		int noloop = 0;
		for(String k : map.keySet()) {
			ret[noloop] = map.get(k);
			noloop++;
		}
		return ret;
	}
}
