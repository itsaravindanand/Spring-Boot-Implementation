package com.in28minutes.learn_spring_framework.game;

public class GameRunner {
    //GameRunner class Tightly Coupled with MarioGame or SuperContra Game
    //private MarioGame game;
    private SuperContraGame game;

//    public GameRunner(MarioGame marioGame) {
//        this.game = marioGame;
//    }

    public GameRunner(SuperContraGame contraGame){
        this.game = contraGame;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
