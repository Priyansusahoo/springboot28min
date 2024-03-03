package com.priyansu.learnspringframework;

import com.priyansu.learnspringframework.game.GameRunner;
import com.priyansu.learnspringframework.game.MarioGame;
import com.priyansu.learnspringframework.game.PacManGame;
import com.priyansu.learnspringframework.game.SuperGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
