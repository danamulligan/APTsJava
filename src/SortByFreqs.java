import java.util.*;
import java.util.ArrayList;
public class SortByFreqs {
	public String[] sort(String[] data) {
		TreeMap<String, Integer> sorted = new TreeMap<>();
		for(String s : data) {
			sorted.putIfAbsent(s, 0);
			sorted.put(s, sorted.get(s)-1);
		}
		String[] ret = new String[sorted.size()];
		TreeMap<Integer, ArrayList<String>> withNum = new TreeMap<>();
		
		for(String s : sorted.keySet()) {
			withNum.putIfAbsent(sorted.get(s), new ArrayList<>());
			withNum.get(sorted.get(s)).add(s);
		}
		
		int noloop = 0;
		for(Integer i : withNum.keySet()) {
			
			ArrayList<String> hold = withNum.get(i);
			Collections.sort(hold);
			for(String s : hold) {
				ret[noloop] = s;
				noloop++;
			}
		}
		return ret;
	}
}
