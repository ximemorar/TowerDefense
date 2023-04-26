package towerdefense;

import javax.swing.JFrame;

public class Round extends Thread {
    
    private Screen principalScreen; 
    private Turn turn;
    
    private PlaySound playSound = new PlaySound();

    @Override
    public void run() {
        showNewRound();
    }

    public void showNewRound() {
        playSound.playSound("src/Sounds/Fight Sound.wav");                
        
        principalScreen.showNewRound();
        
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        
        principalScreen.dontShowNewRound();    
        
        turn.run();
    }
    
    public Round(Screen principalScreen){
        this.principalScreen = principalScreen;
        this.turn = new Turn(principalScreen);
    }
}
