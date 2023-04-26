package towerdefense;

import javax.swing.JProgressBar;

public class MovePlayer extends Thread {

    private Battle battleClass = new Battle();
    private DoublyLinkedList<Road> leftPath;
    private DoublyLinkedList<Road> rightPath;
    private Torre cpuTower;
    private Screen screen;
    private JProgressBar cpuHitPoints;
    private LogicCpu logicCpu;
    private MoveCpu moveCpu;        

    @Override
    public void run() {
        if (!cpuTower.isDestroyed()) {
            move(leftPath);
        }

        if (!cpuTower.isDestroyed()) {
            move(rightPath);
        }

        if (!cpuTower.isDestroyed()) {
            moveCpu.start();
        }
    }

    public void move(DoublyLinkedList<Road> path) {

        for (int i = 4; i >= 0; i--) {

            if (path.get(i).getCharacter() != null && path.get(i).getCharacter().getIsPlayerCharacter()) {

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }

                if (path.isEnd(i)) {

                    cpuTower.takeDamage(path.get(i).getCharacter().getDamageToTower());
                    path.get(i).setCharacter(null);
                    path.get(i).eraseCharacter();

                    screen.lessCharactersOnBoard();

                    screen.updateHitPointsBar(cpuTower, cpuHitPoints);

                    if (cpuTower.isDestroyed()) {
                        screen.stopTimer();
                        screen.gameFinish("Ganador: Player");
                        PlaySound playSound = new PlaySound();
                        playSound.playSound("src/Sounds/You Win Sound.wav");
                        return;
                    }

                } else if (path.get(i + 1).getCharacter() != null) {

                    battleClass.battle(path.get(i + 1), path.get(i));

                    if (path.get(i + 1).getCharacter() == null) {

                        if (path == this.leftPath) {
                            logicCpu.lessLeft();
                        } else {
                            logicCpu.lessRight();
                        }

                    }

                    if (path.get(i).getCharacter() != null) {

                        path.get(i + 1).setCharacter(path.get(i).getCharacter());
                        path.get(i + 1).paintCharacter();

                        path.get(i).setCharacter(null);
                        path.get(i).eraseCharacter();

                    } else {
                        screen.lessCharactersOnBoard();
                    }

                } else {

                    path.get(i + 1).setCharacter(path.get(i).getCharacter());
                    path.get(i + 1).paintCharacter();

                    path.get(i).setCharacter(null);
                    path.get(i).eraseCharacter();

                }
            }
        }
    }

    public MovePlayer(DoublyLinkedList<Road> leftPath, DoublyLinkedList<Road> rightPath, Torre cpuTower, Screen screen, JProgressBar cpuHitPoints, LogicCpu logicCpu, MoveCpu moveCpu) {
        this.leftPath = leftPath;
        this.rightPath = rightPath;
        this.cpuTower = cpuTower;
        this.screen = screen;
        this.cpuHitPoints = cpuHitPoints;
        this.logicCpu = logicCpu;
        this.moveCpu = moveCpu;
    }
}
