import java.util.*;
import java.util.TreeMap;
import java.util.Arrays;

public class ErdosNumber {
	private TreeMap<String, HashSet<String>> myGraph = new TreeMap<>();
	private TreeMap<String, Integer> myDistance = new TreeMap<>();
	
	public String[] calculateNumbers(String[] pubs) {
	      // you write code here
		makeGraph(pubs);
		ArrayList<String> list = new ArrayList<>();
		bfsErdos();
		for(String s : myGraph.keySet()) {
			if(myDistance.containsKey(s)) {
				s = s + " " + myDistance.get(s);
			}
			list.add(s);
		}
		return list.toArray(new String[0]);
	    }
	
	private void makeGraph(String[] pubs) {
  	  for(String s : pubs) {
  		  String[] authors = s.split(" ");
  		  for(String auth : authors) {
  			  myGraph.putIfAbsent(auth, new HashSet<String>());
  			  myGraph.get(auth).addAll(Arrays.asList(authors));
  		  }
  	  }
    }
	private void bfsErdos(){
		Queue<String> qu = new LinkedList<>();
		qu.add("ERDOS");
		myDistance.put("ERDOS", 0);
		while (qu.size() > 0){
	  		String v = qu.remove();
	  		for(String adj : myGraph.get(v)){
	    			if (! myDistance.containsKey(adj)) {
	        			qu.add(adj);
	        			myDistance.put(adj, myDistance.get(v) + 1);
	    			}
	  		}
		}
	}

}
