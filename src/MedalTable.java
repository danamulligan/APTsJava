import java.util.*;
public class MedalTable {
	public String[] generate(String[] results) {
		TreeMap<String, Integer> gold = new TreeMap<>();
		TreeMap<String, Integer> silver = new TreeMap<>();
		TreeMap<String, Integer> bronze = new TreeMap<>();
		
		Integer zedd = 0;
		for(String s : results) {
			String[] names = s.split(" ");
			gold.putIfAbsent(names[0], zedd);
			silver.putIfAbsent(names[1], zedd);
			bronze.putIfAbsent(names[2], zedd);
			gold.putIfAbsent(names[1], zedd);
			silver.putIfAbsent(names[0], zedd);
			bronze.putIfAbsent(names[0], zedd);
			gold.putIfAbsent(names[2], zedd);
			silver.putIfAbsent(names[2], zedd);
			bronze.putIfAbsent(names[1], zedd);
		}
		
		for(String s : results) {
			String[] medals = s.split(" ");
			Integer hold = gold.get(medals[0])+1;
			gold.put(medals[0], hold);
			
			
			Integer holds = silver.get(medals[1])+1;
			silver.put(medals[1], holds);
			
			Integer hold3 = bronze.get(medals[2])+1;
			bronze.put(medals[2], hold3);
		}
		
		TreeMap<Integer, String> goldRev = revMap(gold);
		TreeMap<Integer, String> silverRev = revMap(silver);
		TreeMap<Integer, String> bronzeRev = revMap(bronze);
		
		HashMap<String, Integer> goldAsNum = new HashMap<>();
		HashMap<String, Integer> silverAsNum = new HashMap<>();
		HashMap<String, Integer> bronzeAsNum = new HashMap<>();
		
		for(Integer i : goldRev.keySet()) {
			goldAsNum.put(goldRev.get(i), i);
		}
		for(Integer i : silverRev.keySet()) {
			silverAsNum.put(silverRev.get(i), i);
		}
		for(Integer i : bronzeRev.keySet()) {
			bronzeAsNum.put(bronzeRev.get(i), i);
		}
		
		String[] ret = new String[gold.size()];
		int noLoop = 0;
		for(String name : getNames(results)){
			StringBuilder togeth = new StringBuilder();
			togeth.append(name);
			togeth.append(" ");
			togeth.append(goldAsNum.get(name));
			togeth.append(" ");
			togeth.append(silverAsNum.get(name));
			togeth.append(" ");
			togeth.append(bronzeAsNum.get(name));
			ret[noLoop] = togeth.toString();
			noLoop++;
		}
		
		
		
		
		
		return ret;
	}
	
	
	public TreeMap revMap(TreeMap<String, Integer> map) {
		TreeMap<Integer, String> flip = new TreeMap<>();
		for(String key : map.keySet()) {
			Integer value = map.get(key);
			flip.put(value, key);
		}
		return flip;
	}
	public TreeSet<String> getNames(String[] results) {
		TreeSet<String> set = new TreeSet<>();
		for(String s : results) {
			String[] names = s.split(" ");
			set.add(names[0]);
			set.add(names[1]);
			set.add(names[2]);
		}
		return set;
	}
	public static void main(String[] args) {
		MedalTable o = new MedalTable();
		String[] listo = {"USA AUT ROM"};
		String[] result = o.generate(listo);
		for(String s : result) {
			System.out.println(s);
		}
	}
}
