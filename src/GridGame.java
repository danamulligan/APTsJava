
public class GridGame {
     public int winningMoves(String[] grid){
          // fill in code here
    	 char[][] board = makeBoard(grid);
    	 return winCount(board);
     }
     
     private char[][] makeBoard(String[] grid){
    	 
    	 char[][] board = new char[grid.length][grid.length];
    	 int r = 0;
    	 for(String s : grid) {
    		 for(int c=0; c<s.length(); c++) {
    			 board[r][c] = s.charAt(c);
    		 }
    		 r++;
    	 }
    	 return board;
     }
     
     private boolean isMoveLegal(char[][] board, int r, int c) {
    	 if(board[r][c] == 'X') return false;
    	 if((r-1)>=0) {
    		 if(board[r-1][c] == 'X') return false;
    	 }
    	 if((r+1)<board.length) {
    		 if(board[r+1][c] == 'X') return false;
    	 }
    	 if((c-1)>=0) {
    		 if(board[r][c-1] == 'X') return false;
    	 }
    	 if((c+1)<board.length) {
    		 if(board[r][c+1] == 'X') return false;
    	 }
    	 return true;
     }
     
     private int winCount(char[][] board) {
    	 int count = 0;
    	 for(int r=0; r<4; r++) {
    		 for(int c=0; c<4; c++) {
    			 if(isMoveLegal(board,r,c)) {
    				 board[r][c] = 'X';
    				 int opponentCount = winCount(board);
    				 if(opponentCount == 0) {
    					 count++;
    				 }
    				 board[r][c] = '.';
    			 }
    		 }
    	 }
    	 return count;
     }
   } 