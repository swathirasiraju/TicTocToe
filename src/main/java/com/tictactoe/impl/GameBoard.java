package com.tictactoe.impl;

public class GameBoard {
	
//Validation of game board size
	public int validateBoardCountTest(int n) {
		
		int boardsize=n*n;
		
		return boardsize;
		
	}
	
//Validation of Horizontal move success
	public String ValidateHorizontalSuccess(String moves[]){
		
			String string=null;
			
			if((moves[0]==moves[2])&&(moves[0]==moves[1])&&(moves[1]==moves[2])) {
				string ="Success";	
				
			}
			return string;	
			
		}
}
