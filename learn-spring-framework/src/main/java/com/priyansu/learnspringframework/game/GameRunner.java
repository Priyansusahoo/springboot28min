package com.priyansu.learnspringframework.game;

public class GameRunner {
	private IGamingConsole game;
	
	public GameRunner(IGamingConsole game) {
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

//	public SuperGame getGame() {
//		return game;
//	}
//
//	public void setGame(SuperGame game) {
//		this.game = game;
//	}
//	
	

}
