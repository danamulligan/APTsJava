import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;
public class TheBestName {
	public String[] sort(String[] names) {


		TreeMap<Integer, ArrayList<String>> weights = new TreeMap<>();
		String[] ret = new String[names.length];
		for(String s : names) {
			int weight = 0;

			for(int k=0; k<s.length(); k++) {
				weight = weight + s.charAt(k) - 64;
			}
			weight = weight * -1;
			//if(s.equals("IOILNMPKOQIIIMIRII") || s.equals("NIMMKOQNRJKIMIQKL")) {
				//System.out.println("weight of name " + s + ": " + weight);
				//}
			if(s.equals("JOHN")) {
				weight = Integer.MIN_VALUE;
			}
			weights.putIfAbsent(weight, new ArrayList<String>());
			weights.get(weight).add(s);
		}
		int noloop = 0;
		for(Integer i : weights.keySet()) {
			ArrayList<String> hold = weights.get(i);
			Collections.sort(hold);
			for(String s : hold) {
				ret[noloop] = s;
				noloop++;
			}
		}
		return ret;
	}

}
