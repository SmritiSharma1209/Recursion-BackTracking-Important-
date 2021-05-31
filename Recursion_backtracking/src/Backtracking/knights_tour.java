package Backtracking;

import java.util.Scanner;

public class knights_tour {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int chess[][]= new int[n][n];
		int rowStart=s.nextInt();
		int colStart=s.nextInt();
		boolean visited[][]= new boolean[n][n];
		printKnightsTour( chess,  rowStart,  colStart, 1, visited);
		
	}


 public static void printKnightsTour(int[][] chess, int row, int col, int upcomingMove , boolean visited[][]) {
	 
	 if(row <0 || col<0 || row>=chess.length || col>=chess.length || visited[row][col]==true) {
		 return;
	 }else if( upcomingMove== chess.length * chess.length) {
		 chess[row][col]=upcomingMove;
		 displayBoard(chess);
		chess[row][col]=0;
		return;
		 
	 }
	 
	 
	 visited[row][col]=true;
	 chess[row][col]=upcomingMove;
	 printKnightsTour(chess, row-2,  col+1,  upcomingMove+1 ,  visited);
	 printKnightsTour(chess, row-1,  col+2,  upcomingMove+1 ,  visited);
	 printKnightsTour(chess, row+1,  col+2,  upcomingMove+1 ,  visited);
	 printKnightsTour(chess, row+2,  col+1,  upcomingMove+1 ,  visited);
	 
	 printKnightsTour(chess, row+2,  col-1,  upcomingMove+1 ,  visited);
	 printKnightsTour(chess, row+1,  col-2,  upcomingMove+1 ,  visited);
	 printKnightsTour(chess, row-1,  col-2,  upcomingMove+1 ,  visited);
	 printKnightsTour(chess, row-2,  col-1,  upcomingMove+1 ,  visited);
	 visited[row][col]=false;
	 chess[row][col]=0;
	 
	
 
 }
    
 public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
