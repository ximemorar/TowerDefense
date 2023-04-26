package towerdefense;

import javax.swing.JProgressBar;

public class MoveCpu extends Thread {

    private Battle battleClass = new Battle();
    private DoublyLinkedList<Road> leftPath;
    private DoublyLinkedList<Road> rightPath;
    private Torre playerTower;
    private Screen screen;
    private JProgressBar playerHitPoints;
    private LogicCpu logicCpu;
    private Turn turn;

    @Override
    public void run() {
        if (!playerTower.isDestroyed()) {
            move(leftPath);
        }

        if (!playerTower.isDestroyed()) {
            move(rightPath);
        }

        if (!playerTower.isDestroyed()) {
            if (screen.getCharactersLeft() == 0) {
                if (logicCpu.getCharacterTotal() != 0.0 || screen.getPlayerCharactersOnBoard() != 0) {
                    screen.moveCharacters();
                } else {
                    
                    screen.turn();
                    
                }

            } else {
                
                try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                
                turn.run();
            }
        }

    }

    public void move(DoublyLinkedList<Road> path) {

        for (int i = 0; i < path.getSize(); i++) {

            if (path.get(i).getCharacter() != null && path.get(i).getCharacter().getIsPlayerCharacter() == false) {

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }

                if (path.isRoot(i)) {

                    playerTower.takeDamage(path.get(i).getCharacter().getDamageToTower());
                    path.get(i).setCharacter(null);
                    path.get(i).eraseCharacter();

                    if (path == this.leftPath) {
                        logicCpu.lessLeft();
                    } else {
                        logicCpu.lessRight();
                    }

                    screen.updateHitPointsBar(playerTower, playerHitPoints);

                    if (playerTower.isDestroyed()) {
                        screen.stopTimer();
                        screen.gameFinish("Ganador: CPU");
                        PlaySound playSound = new PlaySound();
                        playSound.playSound("src/Sounds/You Lose Sound.wav");
                        return;
                    }

                } else if (path.get(i - 1).getCharacter() != null) {

                    battleClass.battle(path.get(i - 1), path.get(i));

                    if (path.get(i - 1).getCharacter() == null) {
                        screen.lessCharactersOnBoard();
                    }

                    if (path.get(i).getCharacter() != null) {

                        path.get(i - 1).setCharacter(path.get(i).getCharacter());
                        path.get(i - 1).paintCharacter();

                        path.get(i).setCharacter(null);
                        path.get(i).eraseCharacter();

                    } else {

                        if (path == this.leftPath) {
                            logicCpu.lessLeft();
                        } else {
                            logicCpu.lessRight();
                        }

                    }

                } else {

                    path.get(i - 1).setCharacter(path.get(i).getCharacter());
                    path.get(i - 1).paintCharacter();

                    path.get(i).setCharacter(null);
                    path.get(i).eraseCharacter();

                }
            }
        }
    }

    public MoveCpu(DoublyLinkedList<Road> leftPath, DoublyLinkedList<Road> rightPath, Torre playerTower, Screen screen, JProgressBar playerHitPoints, LogicCpu logicCpu) {
        this.leftPath = leftPath;
        this.rightPath = rightPath;
        this.playerTower = playerTower;
        this.screen = screen;
        this.playerHitPoints = playerHitPoints;
        this.logicCpu = logicCpu;
        this.turn = new Turn(screen);
    }
}
