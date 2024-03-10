package com.jayesh.snakeandladder;

import java.util.Random;

public class SnakeAndLadderGame {
    
	private int playerPosition = 0;
	private int rollDie = 0;
	public void showPosition() {
		
		System.out.println("Player Position : " + playerPosition);
	}
	
	public void playGame() {
		
		Random random = new Random();
		rollDie = random.nextInt(6)+1;
		System.out.println("Die Throw No :"+ rollDie);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake And Ladder Game");
		
		SnakeAndLadderGame snakeandladdergame = new SnakeAndLadderGame();
		snakeandladdergame.showPosition();
		snakeandladdergame.playGame();
		
	}
}
