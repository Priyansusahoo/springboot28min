package com.priyansu.learnspringframework;

import com.priyansu.learnspringframework.game.GameRunner;
import com.priyansu.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
