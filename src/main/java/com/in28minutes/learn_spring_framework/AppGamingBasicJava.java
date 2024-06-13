package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        //Tight Coupling demonstration
        //var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();

        //var gameRunner = new GameRunner(marioGame);
        var gameRunner = new GameRunner(superContraGame);

        gameRunner.run();
    }
}
