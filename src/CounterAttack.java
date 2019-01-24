
public class CounterAttack {
     public int[] analyze(String str, String[] words) 
     {
    	 int[] numList = new int[words.length];
    	 
    	 String[] strList = str.split(" ");
    	 
    	 for (int k=0; k<strList.length; k++) //loops through str
    	 {
    		 for (int r=0; r<words.length; r++) //loops through words
    		 {
    			 if (strList[k].equals(words[r]))
    			 {
    				 numList[r] += 1;
    			 } 
    		 } 
    	 }
    	 return numList;
     }
 }