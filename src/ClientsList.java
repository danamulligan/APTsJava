import java.util.*;

public class ClientsList {
       public String[] dataCleanup(String[] names) {
            // fill in code here
    	   TreeMap<String, ArrayList<String>> map = new TreeMap<>();
    	   String first = "";
    	   String last = "";
    	   for(String s : names) {
    		   //s.split(" ");
    		   if(s.contains(",")){
    			   String[] name = s.split(", ");
    			   first = name[1];
    			   last = name[0];
    		   }
    		   else {
    			   String[] name = s.split(" ");
    			   first = name[0];
    			   last = name[1];
    		   }
    		   map.putIfAbsent(last, new ArrayList<String>());
    		   map.get(last).add(first);

    	   }
    	   for(String k : map.keySet()) {
    		   Collections.sort(map.get(k));
    	   }
    	   StringBuilder hold = new StringBuilder();
    	   //ArrayList<String> list = new ArrayList();
    	   for(String l : map.keySet()) {
    		   for(String f : map.get(l)) {
    			   hold.append(f);
    			   hold.append(" ");
    			   hold.append(l);
    			   hold.append("!!");
    		   }
    	   }
    	   String all = hold.toString();
    	   return all.split("!!");
       }
}