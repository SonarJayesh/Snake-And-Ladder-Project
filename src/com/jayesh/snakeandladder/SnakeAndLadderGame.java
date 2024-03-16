package com.jayesh.snakeandladder;

import java.util.Random;

public class SnakeAndLadderGame {
    
	private int playerPosition = 0;
	private static final int NO_Play = 0;
	private static final int LAADDER = 1;
	private static final int SNAKE = 2;
	private static final int WINNING_POSITON = 100;	
	private int totalDie_Throw = 0;
	
	public void showPosition() {
		
		System.out.println("Player Position  : " + playerPosition);
		
	}
	
	public int playGame() {
		Random random = new Random();
		
		int rollDie = 0;
		int diesOption = 0;
		int totalDie_Throw = 0;
			while(playerPosition < WINNING_POSITON) {
			rollDie = random.nextInt(6)+1;
			
			diesOption= random.nextInt(3);
			
			totalDie_Throw +=1;
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
				
		}
			

			return totalDie_Throw;	
	}
	
	public void playerWin( SnakeAndLadderGame snakeandladdergame2) {
			int player1 = this.playGame();
			int player2 = snakeandladdergame2.playGame();
		
			if(player1 == player2){
				showPosition();
				System.out.println("Total Dies Throw player1 : "+ player1);
				System.out.println("Total Dies Throw player2 : "+ player2);
				System.out.println("Match is Tie");
			
			}
			else if(player1 < player2) {
				showPosition();
				System.out.println("Total Dies Throw player1 : "+ player1);
				System.out.println("Total Dies Throw player2 : "+ player2);
				System.out.println("Player 1st is WIN");
			
			}
			else {
				showPosition();
				System.out.println("Total Dies Throw player1 : "+ player1);
				System.out.println("Total Dies Throw player2 : "+ player2);
				System.out.println("Player 2nd is WIN");
			
		}
		
	}
	
	public static void main(String[] args) {
		
			System.out.println("Welcome to Snake And Ladder Game");
		
			SnakeAndLadderGame snakeandladdergame1 = new SnakeAndLadderGame();
			SnakeAndLadderGame snakeandladdergame2 = new SnakeAndLadderGame();
		
			System.out.println("Player 1st");
			System.out.println("--------------------");

			System.out.println("Player 2nd");
			System.out.println("--------------------");
			System.out.println("--------------------");
			snakeandladdergame1.playerWin(snakeandladdergame2);
		
	}
}
