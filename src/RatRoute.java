public class RatRoute {
	private char[][] myBoard;
	private int myCheeseCol;
	private int myCheeseRow;
       public int numRoutes(String[] enc) {
           // fill in this method (and others you can write)
    	   int ratRow = 0;
    	   int ratCol = 0;
    	   myBoard = new char[enc.length][enc[0].length()];
    	   for(int r=0; r<myBoard.length; r++) {
    		   for(int c=0; c<myBoard[0].length; c++) {
    			   myBoard[r][c] = enc[r].charAt(c);
    			   if(myBoard[r][c] == 'R') {
    				   ratRow = r;
    				   ratCol = c;
    			   }
    			   else if(myBoard[r][c] == 'C') {
    				   myCheeseRow = r;
    				   myCheeseCol = c;
    				   System.out.println("cheese col: " + c);
    				   System.out.println("cheese row: " + r);
    			   }
    		   }
    	   }
    	   System.out.println(" ");
    	   return moveCount(ratRow, ratCol);
       }
       private double cheeseDistance(int r, int c) {
  
    	   return Math.sqrt((myCheeseCol - c)*(myCheeseCol - c) + (myCheeseRow - r)*(myCheeseRow - r));
       }
       private int moveCount(int r, int c) {
    	   System.out.println("r: " + r + ", c: " + c);
    	   if(r<0 || c<0|| r>=myBoard.length || c>= myBoard.length) return 0;
    	   if(myBoard[r][c] == 'X') return 0;
    	   if(r == myCheeseRow && c == myCheeseCol) return 1;
    	   
    	   double distanceNow = cheeseDistance(r, c);
    	   System.out.println("distance " + distanceNow);
    	   int total = 0;
    	   /*
    	   int[] deltaRow = {-1, 0, 0, 1};
    	   int[] deltaCol = {0, -1, 1, 0};
    	   int total = 0;
    	   
    	   for(int k=0; k<deltaRow.length; k++) {
    		   int nr = r + deltaRow[k];
    		   int nc = c + deltaCol[k];
    		   
    		   System.out.println("nr: " + nr);
    		   System.out.println("nc: " + nc);
    		   System.out.println("");
    		   
    		   if(cheeseDistance(nr,nc) <= distanceNow) {
    			   
    			   System.out.println("new dist: " + cheeseDistance(nr,nc));
    			   int next = moveCount(nr, nc);
    			   
    			   total += next;
    			   //total += 1;
    		   }
    	   }*/
    	   
    	   if(cheeseDistance(r-1,c) <= distanceNow) {
			   int next = moveCount(r-1, c);
			   total += next;
		   }
    	   if(cheeseDistance(r+1,c) <= distanceNow) {
			   int next = moveCount(r+1, c);
			   total += next;
		   }
    	   if(cheeseDistance(r,c-1) <= distanceNow) {
			   int next = moveCount(r, c-1);
			   total += next;
		   }
    	   if(cheeseDistance(r,c+1) <= distanceNow) {
			   int next = moveCount(r, c+1);
			   total += next;
		   }
    	   
    	   return total;
       }
       public static void main(String[] args) {
    	   RatRoute o = new RatRoute();
    	   String[] enc = {"R.....", ".....C"};
    	   int result = o.numRoutes(enc);
    	   System.out.println("result: " + result);
       }
    }