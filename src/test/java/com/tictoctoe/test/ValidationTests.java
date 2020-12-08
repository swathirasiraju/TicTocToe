package com.tictoctoe.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.tictactoe.impl.GameBoard;

public class ValidationTests {	
	
	GameBoard gameboard=new GameBoard();	
	
    @Test
	public void ValidationBoardCounttest() {
		
		assertNotEquals("16",gameboard.validateBoardCountTest(3));	
		
	}	
	@Test
	public void ValidateHorizontalMoveSuccess() {
		
		String[] moves = {"X"};
		assertEquals("Success",gameboard.ValidateHorizontalSuccess(moves));
	}
}
