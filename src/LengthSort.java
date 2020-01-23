import java.util.*;

public class LengthSort {
	public String[] rearrange(String[] values) {
		Arrays.sort(values);
		TreeMap<Integer, ArrayList<String>> map = new TreeMap<>();
		for(String s : values) {
			map.putIfAbsent(s.length(), new ArrayList<String>());
			map.get(s.length()).add(s);
		}
		StringBuilder hold = new StringBuilder();
		ArrayList<String> list = new ArrayList();
		for(int k : map.keySet()) {
			list.addAll(map.get(k));
		}
		for(String s : list) {
			hold.append(s);
			hold.append("!!");
		}
		return hold.toString().split("!!");
	}
}
