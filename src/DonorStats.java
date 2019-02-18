import java.util.TreeSet;

public class DonorStats {
	public String[] calculate(String[] donations) {
		// write your code here and replace this

		String[] names = nameList(donations);
		String name = "";
		int sum = 0;
		int count = 0;
		String[] total = new String[names.length];
		
		for(int k=0; k<names.length; k++) {
			name = names[k];
			for(String s : donations)
			{
				if (s.contains(name)) {
					sum = getSum(sum, s);
					count += countAll(s);
				}
			}
			total[k] = name + ":" + Integer.toString(count) + ":" + sum;
			count = 0;
			sum = 0;
		}

		return total;
	}
	public String[] nameList(String[] donations) {
		TreeSet<String> seen = new TreeSet<>();
    	//String names = "";
    	String name = "";
    	
    	for(String s : donations) {
    		name = getName(s);
    		if(!seen.contains(name)) {
    			//names = names + name + ",";
    		}
    		seen.add(name);
    	}
        
    	String[] names = seen.toArray(new String[0]);
   	
    	return names;
    }
    public String getName(String s)
    {
    	String[] name = s.split(":");
    	return name[0];
    }
    public int getSum(int start, String donation)
    {
    	String[] trash = donation.split(":");
    	String[] numb = trash[1].split(",");
    	int sum = 0;
    	
    	for(int k=0; k<numb.length; k++) {
    		
    		sum += Integer.valueOf(numb[k]);
    	}
    	
    	return sum+start;
    }
    public int countAll(String donation)
    {
    	String[] trash = donation.split(":");
    	String[] numb = trash[1].split(",");
    	
    	return numb.length;
    }
    
    
   /* public int numInEach(String donation)
    {
    	String[] trash = donation.split(":");
    	String[] numb = trash[1].split(",");
    	int sum = 0;
    	
    	for(int k=1; k<numb.length; k++) {
    		
    		sum += Integer.valueOf(numb[k]);
    	}
    }
    */
    
}

/*public class DonorStats {
      public String[] calculate(String[] donations) {
    	  // write your code here and replace this
    	  int sum = 0;
    	  int i = 0;
    	  //String[] nam = new String[donations.length];
    	  
    	  TreeMap<String,Integer> names = new TreeMap<>();
    	  for(String s : donations) {
    		  
    		  String numb = s.split(":")[1];
    		  String[] numbs = numb.split(",");
    		  for(int k=0; k<numbs.length; k++) {
    			  sum = sum + Integer.valueOf(numbs[k]);
    		  }
    		  //names.putifAbsent(s.split(":")[0], sum); 
    		  names.put(s.split(":")[0], sum);  
    	  }
    	  
    	  String[] nam = new String[0];
    	  
    	  
    	  return nam;
      }
      
}
*/


