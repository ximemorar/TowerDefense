package towerdefense;

import javax.swing.ImageIcon;

public class Character {

    private CharacterType characterType;
    private CharacterType weakness;
    private Double damageToTower;
    private boolean isPlayerCharacter = false;
    private ImageIcon image;

    private String killSoundURL;

    private PlaySound playSound = new PlaySound();

    //Este metodo ejecutara el sonido de muerte y la eliminacion del personaje en el tablero
    public void die(Road road) {
        road.eraseCharacter();
        road.setCharacter(null);
    }

    //Este metodo ejecutara un sonido cuando el personaje mate a otro personaje
    public void kill() {
        if (killSoundURL != null) {
            playSound.playSound(killSoundURL);
        }
    }

    //Constructor
    public Character(CharacterType characterType) {
        this.characterType = characterType;

        //Dependiendo del Tipo de Personaje que se le asigne
        //automaticamente se le asignara una debilidad, un dano a torre
        //y una imagen determinada
        switch (characterType) {
            case ARCHER:
                this.weakness = CharacterType.WARRIOR;
                this.damageToTower = 1.0;
                this.image = new ImageIcon("src/image/Archer.png");
                this.killSoundURL = "src/Sounds/Archer Kill Sound.wav";
                break;
            case WARRIOR:
                this.weakness = CharacterType.WIZARD;
                this.damageToTower = 2.0;
                this.image = new ImageIcon("src/image/Warrior.png");
                this.killSoundURL = "src/Sounds/Warrior Kill Sound.wav";
                break;
            case WIZARD:
                this.weakness = CharacterType.ARCHER;
                this.damageToTower = 1.5;
                this.image = new ImageIcon("src/image/Wizard.png");
                this.killSoundURL = "src/Sounds/Wizard Kill Sound.wav";
                break;
            default:
                break;
        }
    }

    //Gets and Sets
    public CharacterType getCharacterType() {
        return characterType;
    }

    public void setCharacterType(CharacterType characterType) {
        this.characterType = characterType;

        //En caso de que se quiera cambiar el Tipo de Personaje,
        //al igual que en el constructor, se le asignara una debilidad,
        //un dano a torre y una imagen determinada
        switch (characterType) {
            case ARCHER:
                this.weakness = CharacterType.WARRIOR;
                this.damageToTower = 1.0;
                this.image = new ImageIcon("src/image/Archer.png");
                break;
            case WARRIOR:
                this.weakness = CharacterType.WIZARD;
                this.damageToTower = 2.0;
                this.image = new ImageIcon("src/image/Warrior.png");
                break;
            case WIZARD:
                this.weakness = CharacterType.ARCHER;
                this.damageToTower = 1.5;
                this.image = new ImageIcon("src/image/Wizard.png");
                break;
            default:
                break;
        }
    }

    public CharacterType getWeakness() {
        return weakness;
    }

    public Double getDamageToTower() {
        return damageToTower;
    }

    public ImageIcon getImage() {
        return image;
    }

    public boolean getIsPlayerCharacter() {
        return isPlayerCharacter;
    }

    public void setIsPlayerCharacter(boolean isPlayerCharacter) {
        this.isPlayerCharacter = isPlayerCharacter;
        switch (characterType) {
            case ARCHER:
                this.image = new ImageIcon("src/image/Archer Rotated.png");
                break;
            case WARRIOR:
                this.image = new ImageIcon("src/image/Warrior Rotated.png");
                break;
            case WIZARD:
                this.image = new ImageIcon("src/image/Wizard Rotated.png");
                break;
            default:
                break;
        }
    }
}
