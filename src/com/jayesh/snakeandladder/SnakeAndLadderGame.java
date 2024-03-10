package com.jayesh.snakeandladder;

import java.util.Random;

public class SnakeAndLadderGame {
    
	private int playerPosition = 0;
	private int rollDie = 0;
	private int diesOption = 0;
	private static final int NO_Play = 0;
	private static final int LAADDER = 1;
	private static final int SNAKE = 2;
	
	public void showPosition() {
		
		System.out.println("Player Position : " + playerPosition);
		
	}
	
	public void playGame(){
		
		Random random = new Random();
		rollDie = random.nextInt(6)+1;
		System.out.println("rollDie No :"+ rollDie);
		diesOption= random.nextInt(3);
		System.out.println("Dies Position :"+ diesOption);
		
		switch(diesOption)
		{
			case NO_Play:
					playerPosition = playerPosition;
					break;
		 
			case LAADDER:
					playerPosition = playerPosition + rollDie; 
					break;
					
			case SNAKE:
					playerPosition = playerPosition - rollDie;
					if(playerPosition < 0) {
						
						playerPosition = 0;
					}
					break;
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake And Ladder Game");
		
		SnakeAndLadderGame snakeandladdergame = new SnakeAndLadderGame();
		snakeandladdergame.showPosition();
		snakeandladdergame.playGame();
		snakeandladdergame.showPosition();
	}
}
