
public class MaxDonor {
     public String generous(String[] orgs, int[] amount) {
         // change this code
    	 String[] names = donorList(orgs);
    	 String name = "";
    	 int sum = 0;
    	 
    	 for(String s : names) {
    		 if(getSum(orgs, s, amount)>sum) {
    			 sum = getSum(orgs, s, amount);
    			 name = s;
    		 }
    	 }
    	 
         return name + ":$" + sum;
     }
     public String[] donorList(String[] orgs)
     {
    	 String donors = "";
    	 for(String s : orgs) {
    		 if(!donors.contains(s)) {
    			 donors = donors + s + ",";
    		 }
    	 }
    	 return donors.split(",");
     }
     public int getSum(String[] orgs, String name, int[] amount)
     {
    	 int sum = 0;
    	 for(int k=0; k<orgs.length; k++) {
    		 if(orgs[k].equals(name)) {
    			 sum += amount[k];
    		 }
    	 }
    	 
    	 return sum;
     }
 }