package com.priyansu.learnspringframework;

import com.priyansu.learnspringframework.game.GameRunner;
import com.priyansu.learnspringframework.game.MarioGame;
import com.priyansu.learnspringframework.game.PacManGame;
import com.priyansu.learnspringframework.game.SuperGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		/*
		var game = new MarioGame();
		var game = new SuperGame();
		*/

		/*
		 * 1: Object Creation
		 */
		var game = new PacManGame();
		/*
		* 2: Object Creation + Wiring of Dependencies
		* Game is a Dependency of GameRunner.
		*/
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
