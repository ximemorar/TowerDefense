package towerdefense;

public class Turn extends Thread {

    private Screen principalScreen;

    @Override
    public void run() {
        showNewTurn();
    }

    public void showNewTurn() {
        principalScreen.showSelectTroops();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        
        principalScreen.dontShowSelectTroops();
        
        principalScreen.turn();
    }

    public Turn(Screen principalScreen) {
        this.principalScreen = principalScreen;
    }
}
