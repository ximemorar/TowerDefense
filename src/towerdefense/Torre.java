/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

public class Torre {

    private double life = 10;

    private PlaySound playSound = new PlaySound();
    
    public Torre() {
    }

    public void takeDamage(double damage) {
        playSound.playSound("src/Sounds/Tower Take Damage Sound.wav");
        life = life - damage;
    }

    public boolean isDestroyed() {
        //Este metodo verifica si la torre ha sido destruida
        //Cada vez de que la torre recibe daño
        //Regresa un valor booleano y si es true, la partida acaba
        //Si regresa false, la partida continua
        if (life <= 0) {
            return true;
        }
        return false;
    }
    
    public double getLife(){
        return life;
    }
}
