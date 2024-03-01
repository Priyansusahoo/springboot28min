package com.priyansu.learnspringframework.game;

public class GameRunner {
	MarioGame game;
	
	public GameRunner(MarioGame game) {
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
