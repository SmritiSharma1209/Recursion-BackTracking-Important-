package Backtracking;

import java.util.Scanner;

public class n_queens {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int chess[][]= new int[n][n];
		printNQueens(chess," ", 0);

	}

 public static void printNQueens(int[][] chess, String qsf, int row) {
	 
	 if(row==chess.length) {
		 System.out.println(qsf+ ".");
		 return;
	 }
	 
	 for(int col=0;col<chess.length; col++) {                                //placing one queen in one row at a time
		 
		 if(isQueenAtSafePlace(chess,row,col)==true) {
		 chess[row][col]=1;
		 printNQueens( chess, qsf + row + "-" + col + " ," ,  row+1);
		 chess[row][col]=0;
		 }
		 
	 }
 }
	 public static boolean isQueenAtSafePlace(int chess[][], int row,int col) {
		 
		 
		 for(int i=row, j=col; i>=0; i--) {        //vertical
			 if(chess[i][j]==1){
				 return false;
			 }
		 }
		 
		 for(int i=row, j=col; i>=0 && j>=0; --i,--j) {         //left diagonal
			 if(chess[i][j]==1) {
				 return false;
			 }
		 }
		 
		 for(int i=row, j=col; i>=0 && j<chess.length; --i,++j) {       //right diagonal
			 if(chess[i][j]==1) {
				 return false;
			 }
		 }
		 return true;
	 }
        
    
}
