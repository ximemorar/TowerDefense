package towerdefense;

public class Battle {

    public void battle(Road playerCharacter, Road cpuCharacter) {
        if (playerCharacter.getCharacter().getCharacterType() == cpuCharacter.getCharacter().getWeakness()) {
            playerCharacter.getCharacter().kill();
            cpuCharacter.getCharacter().die(cpuCharacter);
        } else if (playerCharacter.getCharacter().getWeakness() == cpuCharacter.getCharacter().getCharacterType()) {
            cpuCharacter.getCharacter().kill();
            playerCharacter.getCharacter().die(playerCharacter);
        } else {
            playerCharacter.getCharacter().kill();
            cpuCharacter.getCharacter().kill();
            playerCharacter.getCharacter().die(playerCharacter);
            cpuCharacter.getCharacter().die(cpuCharacter);
        }
    }
    
    public int battleInSelect(Character playerCharacter, Character cpuCharacter){
        if (playerCharacter.getCharacterType() == cpuCharacter.getWeakness()) {
            playerCharacter.kill();
            return 1;
        } else if (playerCharacter.getWeakness() == cpuCharacter.getCharacterType()) {
            cpuCharacter.kill();
            return 2;
        } else {
            playerCharacter.kill();
            cpuCharacter.kill();            
            return 3;
        }
    }
}
