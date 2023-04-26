package towerdefense;

import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class LogicCpu {

    private Random random = new Random();
    
    private Queue<Character> firstListCharacter = new Queue();
    private DefaultListModel modelo = new DefaultListModel();
    private double characterQueueLeft = 0.0;
    private double characterQueueRight = 0.0;
    private double characterTotal = 0.0;

    public void selectCharacterCpu(DoublyLinkedList<Road> pathLeft, DoublyLinkedList<Road> pathRight, Queue<Character> characters) {
        Character characterSelect;
        int numCharacter = random.nextInt(3);
        int numPath;
        double percentLeft = 0.0;
        double percentRight = 0.0;

        ///Verificamos si la lista de personajes izquierda tiene personajes para poder aplicar la formula
        if (characterQueueLeft != 0.0) {

            percentLeft = (characterQueueLeft / characterTotal) * 100;

        }
        ///Verificamos si la lista de personajes derecha tiene personajes para poder aplicar la formula
        if (characterQueueRight != 0.0) {

            percentRight = (characterQueueRight / characterTotal) * 100;

        }

        //Verificamos si el tama;o de la lista es 0 para elegir un personaje aleatorio 
        if (firstListCharacter.getSize() == 0) {

            characterSelect = characters.get(numCharacter);

        } else {
            /// Sino selecciona un personaje de la lista que muestra al principio
            characterSelect = firstListCharacter.remove();

        }

        if (percentRight < 75 && percentLeft < 75) {

            numPath = random.nextInt(2);

        } else if (percentRight >= 75) {

            numPath = 0;

        } else {

            numPath = 1;

        }

        switch (numPath) {

            case 0:

                if (pathLeft.get(4).getCharacter() == null) {
                    pathLeft.get(4).setCharacter(characterSelect);
                    pathLeft.get(4).paintCharacter();
                } else {
                    
                }

                characterQueueLeft++;
                characterTotal++;

                break;

            case 1:

                pathRight.get(4).setCharacter(characterSelect);
                pathRight.get(4).paintCharacter();

                characterQueueRight++;
                characterTotal++;

                break;

            default:
                throw new AssertionError();
        }

    }

    public void firstThree(Queue<Character> characterList, JList jListCpu) {
        
        String archer = "Arquero";
        String warrior = "Guerrero";
        String wizard = "Hechicero";
        for (int i = 0; i < 3; i++) {
            int numCharacter = random.nextInt(3);
            Character character = characterList.get(numCharacter);
            firstListCharacter.add(character);
        }
      
        

        for (int i = 0; i < firstListCharacter.getSize(); i++) {
            System.out.println(firstListCharacter.get(i).getCharacterType());
        }
        
        
        jListCpu.setModel(modelo);
        
        if(modelo.isEmpty() == true) {
            modelo.addElement("TROPAS CPU");
            modelo.addElement(" ");
            for (int i = 0; i < (firstListCharacter.getSize()); i++) {
                if (firstListCharacter.get(i).getCharacterType().toString().equals("ARCHER")){
                    modelo.addElement(archer);
                }else if (firstListCharacter.get(i).getCharacterType().toString().equals("WIZARD")){
                    modelo.addElement(wizard);
                }else{
                modelo.addElement(warrior);
                }
                
            }
                   
        }else
        {
            modelo.removeAllElements();

            for (int i = 0; i < (firstListCharacter.getSize()); i++) {
                if (firstListCharacter.get(i).getCharacterType().equals("ARCHER")){
                    modelo.addElement(archer);
                }else if (firstListCharacter.get(i).getCharacterType().equals("WIZARD")){
                    modelo.addElement(wizard);
                }else{
                modelo.addElement(warrior);
                }
                
            }

      
        
    }
    }

    public void lessLeft() {
        characterQueueLeft--;
        characterTotal--;
    }

    public void lessRight() {
        characterQueueRight--;
        characterTotal--;
    }

    public double getCharacterTotal() {
        return characterTotal;
    }
    
    
}
