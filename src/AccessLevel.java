public class AccessLevel {
     public String canAccess(int[] rights, int minPermission) 
     {
    	 String permissions = "";
    	 for (int k=0; k<rights.length; k++) 
    	 {
    		 if (rights[k] >= minPermission) 
    		 {
    			 permissions += "A";
    		 }
    		 else 
    		 {
    			 permissions += "D";
    		 }
    	 }
    	 return permissions;
     }
  }