package com.jayesh.snakeandladder;

import java.util.Random;

public class SnakeAndLadderGame {
    
	private int playerPosition = 0;
	private int rollDie = 0;
	private int diesOption = 0;
	private static final int NO_Play = 0;
	private static final int LAADDER = 1;
	private static final int SNAKE = 2;
	private static final int WINNING_POSITON = 100;	
	
	public void showPosition() {
		
		System.out.println("Player Position : " + playerPosition);
		
	}
	
	public void playGame() {
		Random random = new Random();
		
			while(playerPosition < WINNING_POSITON) {
			rollDie = random.nextInt(6)+1;
			System.out.println("rollDie No :"+ rollDie);
			diesOption= random.nextInt(3);
			System.out.println("Dies Position :"+ diesOption);
			
			System.out.println("---------------------");
			
		switch(diesOption) {
		
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
			if(playerPosition > WINNING_POSITON) {
				
				playerPosition = playerPosition - rollDie;
			}
			showPosition();
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake And Ladder Game");
		
		SnakeAndLadderGame snakeandladdergame1 = new SnakeAndLadderGame();
		snakeandladdergame1.showPosition();
		snakeandladdergame1.playGame();
		
	}
}
