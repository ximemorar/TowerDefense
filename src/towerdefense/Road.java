package towerdefense;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Road {

    private JLabel label;
    private Character characterOnRoad;

    public void paintCharacter() {
        Icon icon = new ImageIcon(characterOnRoad.getImage().getImage().getScaledInstance(
                label.getWidth(),
                label.getHeight(),
                Image.SCALE_DEFAULT));
        label.setIcon(icon);                        
        label.repaint();
    }
    
    public void eraseCharacter() {
        label.setIcon(null);
        label.repaint();
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public Character getCharacter() {
        return characterOnRoad;
    }

    public void setCharacter(Character character) {
        this.characterOnRoad = character;
    }
}
