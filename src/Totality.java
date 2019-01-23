public class Totality {
     public int sum(int[] a, String stype) {
         // you add code here
    	 int osum = 0;
    	 int esum = 0;
    	 for (int k=0; k<a.length; k+=1) {
    		 if(k % 2 == 0) { //if even
    			 esum += a[k];
    		 }
    		 else {
    			 osum += a[k];
    		 }
    	 }
    	 
    	 if (stype.equals("even")) {
    		 return esum;
    	 }
    	 if (stype.equals("odd")) {
    		 return osum;
    	 }
    	 else {
    		 return osum + esum;
    	 }
     }
 }