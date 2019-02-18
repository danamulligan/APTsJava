
 public class PairDown {
     public int[] fold(int[] list) {
         // change this code
    	 int len = list.length;
    	 
    	 if(len%2==1)
    	 {
    		 int[] sum = new int[(len+1)/2];
    		 int[] ready = new int[len+1];
    		 ready[len] = 0;

    		 for(int k=0; k<len; k++) {
    			 ready[k] = list[k];
    		 }
    		 for(int k=0; k<(len+1)/2; k++) {
    			 sum[k] = ready[2*k] + ready[2*k+1];

    		 }
    		 return sum;
    	 }
    	 else{
    		 int[] sum = new int[len/2];
    		 int[] ready = new int[len];
    		 
    		 for(int k=0; k<len; k++) {
    			 ready[k] = list[k];
    		 }
    		 for(int k=0; k<(len+1)/2; k++) {
    			 sum[k] = ready[2*k] + ready[2*k+1];
    		 }
    		 return sum;
    	 }
    		 
     }
 }
