import java.util.*;

public class Dirsort {
	public String[] sort(String[] dirs) {
		TreeMap<Integer, ArrayList<String> /*TreeSet<String>*/> map = new TreeMap<>();
		for(String s : dirs) {
			String[] words = s.split("/");
			//TreeSet<String> inner = new TreeSet<>();
			ArrayList<String> inner = new ArrayList<>();
			map.putIfAbsent(words.length, inner);
			map.get(words.length).add(s);
		}
		ArrayList<String> list = new ArrayList<>();
		for(int k : map.keySet()) {
			//TreeSet<String> temp = map.get(k);
			ArrayList<String> temp = map.get(k);
			Collections.sort(temp);
			list.addAll(temp);
		}
		
		StringBuilder l = new StringBuilder();
		for(String s : list) {
			l.append(s);
			l.append("!!");
		}
		String hold = l.toString();
		
		
		return hold.split("!!");
	}
	public static void main(String[] args) {
		Dirsort o = new Dirsort();
		String[] dirs = {"/", "/new", "/hap", "/newer", "/new/hap"};
		String[] result = o.sort(dirs);
		System.out.println("result: " + result);
	}
	
}
