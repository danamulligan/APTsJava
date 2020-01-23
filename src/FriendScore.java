import java.util.*;

public class FriendScore {
	TreeMap<Integer, HashSet<Integer>> myGraph = new TreeMap<>();
      public int highestScore(String[] friends) {
    	  makeGraph(friends);
    	  int max = 0;
    	  for(int k=0; k<friends.length; k++) {
    		  Set<Integer> set = twoFriends(k);
    		  max  = Math.max(set.size()-1, max);
    	  }
    	  return max;
      }
      public void makeGraph(String[] friends) {
    	  for(Integer k=0; k<friends.length; k++) {
    		  myGraph.putIfAbsent(k, new HashSet<Integer>());
    		  HashSet<Integer> hold = myGraph.get(k);
    		  for(Integer i=0; i<friends[k].length(); i++) {
    			  if(friends[k].charAt(i) == 'Y') hold.add(i);
    		  }	
    		  myGraph.put(k, hold);
    	  }
      }
      public Set<Integer> bfs(Integer start){ // DFS
    	  Set<Integer> visited = new TreeSet<>();
    	  Queue<Integer> qu = new LinkedList<>();
    	//Stack<Integer> qu = new Stack<>(); // DFS
    	  visited.add(start);
    	  qu.add(start);
    	//qu.push(start); // DFS
    	  while(qu.size() > 0) {
    		  Integer v = qu.remove(); // BFS
    		//Integer v = qu.pop(); // DFS
    		//These are Integers for the purpose of this apt, 
    		//but it's whatever's in the set/queue/stack
    		  for(Integer adj : getAdjacent(v)) { //Integers again
    			  if(!visited.contains(adj)) {
    				  visited.add(adj);
    				  qu.add(adj); // for BFS
    				//qu.push(adj); // for DFS
    			  }
    		  }
    	  }
    	  return visited;
      }
      public Set<Integer> getAdjacent(Integer s){
    	  if(myGraph.containsKey(s)) {
    		  return myGraph.get(s);
    	  }
    	  return new HashSet<Integer>();
      }
      public Set<Integer> twoFriends(Integer s){
    	  Set<Integer> one = getAdjacent(s);
    	  Set<Integer> ret = new HashSet<Integer>();
    	  ret.addAll(one);
    	  for(Integer i: one) {
    		  ret.addAll(getAdjacent(i));
    	  }
    	  return ret;
      }
   }


