/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package towerdefense;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.lang.Math;
import javax.swing.DefaultListModel;
import javax.swing.JProgressBar;
import javax.swing.ListModel;

/**
 *
 * @author nacho
 */
public class Screen extends javax.swing.JFrame {
    
    private DoublyLinkedList<Road> leftRoad = new DoublyLinkedList();
    private DoublyLinkedList<Road> rightRoad = new DoublyLinkedList();
    private Queue<Character> characterList = new Queue();    
    private LogicCpu logicCpu = new LogicCpu();
    private Torre playerTower = new Torre();
    private Torre cpuTower = new Torre();
    private int roundNum = 1;
    private int charactersPerRound;
    private int charactersLeft;
    private int playerCharactersOnBoard = 0;
    private ImageIcon image;
    private Icon icon;
    private Timer timer = null;
    private int segundos = 0;
    private int minutos = 0;
    private int horas = 0;
    private String segundosStr = "00";
    private String minutosStr = "00";
    private String horasStr = "00";
    
    private PlaySound playSound = new PlaySound();
    
    public Screen() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Tower Defense");
        setIconImage(getIconImage());
        paintLabelImage(lblBackGroundHud, "src/image/gallery.png");
        paintLabelImage(lblBackGround, "src/image/gallery.png");
        paintLabelImage(lblBoard, "src/image/Board.png");
        paintLabelImage(lblNewRound, "src/image/gallery.png");
        paintLabelImage(lblSelectTroops, "src/image/gallery.png");
        paintLabelImage(lblContadorBackGround, "src/image/gallery.png");
        paintLabelImage(lblCharactersLeft, "src/image/gallery.png");
        lblNewRound.setVisible(false);
        lblNewRoundText.setVisible(false);
        lblSelectTroops.setVisible(false);
        lblSelectTroopsText.setVisible(false);
        lblGameFinishText.setVisible(false);
        paintButtonImage(btSelecTropas, "src/image/Button.png");
        jListCpu.setEnabled(false);
        JListCharacters.setEnabled(false);
        btSelecTropas.setEnabled(false);
        btCamino1.setVisible(false);
        btCamino2.setVisible(false);
        playerHitPointsBar.setValue(10);
        cpuHitPointBar.setValue(10);
        
        Character wizard = new Character(CharacterType.WIZARD);
        characterList.add(wizard);
        Character warrior = new Character(CharacterType.WARRIOR);
        characterList.add(warrior);
        Character archer = new Character(CharacterType.ARCHER);
        characterList.add(archer);
        
        Road lRoad1 = new Road();
        lRoad1.setLabel(leftRoad1);
        leftRoad.add(lRoad1);
        
        Road lRoad2 = new Road();
        lRoad2.setLabel(leftRoad2);
        leftRoad.add(lRoad2);
        
        Road lRoad3 = new Road();
        lRoad3.setLabel(leftRoad3);
        leftRoad.add(lRoad3);
        
        Road lRoad4 = new Road();
        lRoad4.setLabel(leftRoad4);
        leftRoad.add(lRoad4);
        
        Road lRoad5 = new Road();
        lRoad5.setLabel(leftRoad5);
        leftRoad.add(lRoad5);
        
        Road rRoad1 = new Road();
        rRoad1.setLabel(rightRoad1);
        rightRoad.add(rRoad1);
        
        Road rRoad2 = new Road();
        rRoad2.setLabel(rightRoad2);
        rightRoad.add(rRoad2);
        
        Road rRoad3 = new Road();
        rRoad3.setLabel(rightRoad3);
        rightRoad.add(rRoad3);
        
        Road rRoad4 = new Road();
        rRoad4.setLabel(rightRoad4);
        rightRoad.add(rRoad4);
        
        Road rRoad5 = new Road();
        rRoad5.setLabel(rightRoad5);
        rightRoad.add(rRoad5);
        
        Round round = new Round(this);
        round.start();
        
        playSound.playTheme("src/Sounds/Theme.wav");

        //Se inicializa el cronometro
        startTimer();
    }

    //Icono del programa
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("image/GameIcon.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCharactersLeftText = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCharactersLeft = new javax.swing.JLabel();
        lblGameFinishText = new javax.swing.JLabel();
        lblSelectTroopsText = new javax.swing.JLabel();
        lblSelectTroops = new javax.swing.JLabel();
        lblNewRoundText = new javax.swing.JLabel();
        lblNewRound = new javax.swing.JLabel();
        contadorLabel = new javax.swing.JLabel();
        lblContadorBackGround = new javax.swing.JLabel();
        cpuHitPointBar = new javax.swing.JProgressBar();
        playerHitPointsBar = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        leftRoad5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCpu = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        JListCharacters = new javax.swing.JList<>();
        btSelecTropas = new javax.swing.JButton();
        btCamino1 = new javax.swing.JButton();
        btCamino2 = new javax.swing.JButton();
        lblBackGroundHud = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        leftRoad1 = new javax.swing.JLabel();
        leftRoad2 = new javax.swing.JLabel();
        leftRoad3 = new javax.swing.JLabel();
        leftRoad4 = new javax.swing.JLabel();
        rightRoad5 = new javax.swing.JLabel();
        rightRoad4 = new javax.swing.JLabel();
        rightRoad3 = new javax.swing.JLabel();
        rightRoad2 = new javax.swing.JLabel();
        rightRoad1 = new javax.swing.JLabel();
        lblBoard = new javax.swing.JLabel();
        lblBackGround = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        jLabel4.setText("jLabel4");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCharactersLeftText.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        lblCharactersLeftText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCharactersLeftText.setText("0");
        getContentPane().add(lblCharactersLeftText, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 80, 50));

        jLabel6.setFont(new java.awt.Font("Engravers MT", 1, 7)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Por Colocar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 80, 40));
        getContentPane().add(lblCharactersLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 80, 80));

        lblGameFinishText.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        lblGameFinishText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGameFinishText.setText("Ganador: Player");
        getContentPane().add(lblGameFinishText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 320, 190));

        lblSelectTroopsText.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        lblSelectTroopsText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSelectTroopsText.setText("Seleccione Tropas");
        getContentPane().add(lblSelectTroopsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 340, 80));

        lblSelectTroops.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblSelectTroops, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 450, 330));

        lblNewRoundText.setFont(new java.awt.Font("Engravers MT", 1, 48)); // NOI18N
        lblNewRoundText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblNewRoundText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 340, 80));
        getContentPane().add(lblNewRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 450, 330));

        contadorLabel.setBackground(new java.awt.Color(255, 255, 255));
        contadorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contadorLabel.setText("0");
        contadorLabel.setToolTipText("");
        getContentPane().add(contadorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 90, 40));
        getContentPane().add(lblContadorBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 90, 40));

        cpuHitPointBar.setBackground(java.awt.Color.gray);
        cpuHitPointBar.setForeground(new java.awt.Color(255, 0, 0));
        cpuHitPointBar.setMaximum(10);
        cpuHitPointBar.setToolTipText("");
        getContentPane().add(cpuHitPointBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 150, 20));

        playerHitPointsBar.setBackground(java.awt.Color.gray);
        playerHitPointsBar.setForeground(java.awt.Color.blue);
        playerHitPointsBar.setMaximum(10);
        getContentPane().add(playerHitPointsBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 150, 20));

        jLabel5.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        jLabel5.setText("HitPoints");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        jLabel3.setText("HitPoints");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, -1, -1));
        getContentPane().add(leftRoad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 70, 70));

        jScrollPane1.setViewportView(jListCpu);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 140, 90));

        JListCharacters.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Hechicero", "Guerrero", "Arquero" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        JListCharacters.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                JListCharactersValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(JListCharacters);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 140, 130));

        btSelecTropas.setText("Seleccionar Tropa");
        btSelecTropas.setBorderPainted(false);
        btSelecTropas.setContentAreaFilled(false);
        btSelecTropas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSelecTropas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSelecTropas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecTropasActionPerformed(evt);
            }
        });
        getContentPane().add(btSelecTropas, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 120, 30));

        btCamino1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/arrow.png"))); // NOI18N
        btCamino1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCamino1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCamino1MouseClicked(evt);
            }
        });
        getContentPane().add(btCamino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 50, 50));

        btCamino2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/arrow.png"))); // NOI18N
        btCamino2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCamino2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCamino2MouseClicked(evt);
            }
        });
        getContentPane().add(btCamino2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 50, 50));

        lblBackGroundHud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gallery.png"))); // NOI18N
        lblBackGroundHud.setText("jLabel4");
        getContentPane().add(lblBackGroundHud, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 140, 590));

        jLabel1.setText("Timer:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, -1, -1));

        leftRoad1.setBackground(new java.awt.Color(255, 255, 255));
        leftRoad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(leftRoad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 70, 70));

        leftRoad2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(leftRoad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 70, 70));

        leftRoad3.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(leftRoad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 70, 70));

        leftRoad4.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(leftRoad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 70, 70));

        rightRoad5.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rightRoad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 70, 70));

        rightRoad4.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rightRoad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 70, 70));

        rightRoad3.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rightRoad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 70, 70));

        rightRoad2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rightRoad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 70, 70));

        rightRoad1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rightRoad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 70, 70));

        lblBoard.setBackground(new java.awt.Color(255, 255, 255));
        lblBoard.setText("Background Image");
        getContentPane().add(lblBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 590));

        lblBackGround.setText("jLabel6");
        getContentPane().add(lblBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSelecTropasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecTropasActionPerformed
        btCamino1.setOpaque(false);
        btCamino1.setContentAreaFilled(false);
        btCamino1.setBorderPainted(false);
        btCamino2.setOpaque(false);
        btCamino2.setContentAreaFilled(false);
        btCamino2.setBorderPainted(false);
        paintButtonImage(btCamino1, "src/image/arrow.png");
        paintButtonImage(btCamino2, "src/image/arrow.png");
        btCamino1.setVisible(true);
        btCamino2.setVisible(true);
    }//GEN-LAST:event_btSelecTropasActionPerformed

    private void btCamino1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCamino1MouseClicked
        if (JListCharacters.getSelectedValue().equals("Arquero")) {
            
            paintButtonImage(btCamino1, null);
            Character character = new Character(CharacterType.ARCHER);
            character.setIsPlayerCharacter(true);
            
            if (leftRoad.get(0).getCharacter() != null) {
                Battle battle = new Battle();
                int battleResult = battle.battleInSelect(character, leftRoad.get(0).getCharacter());
                switch (battleResult) {
                    case 1:
                        logicCpu.lessLeft();
                        
                        leftRoad.get(0).setCharacter(character);
                        leftRoad.get(0).paintCharacter();
                        playerCharactersOnBoard++;
                        break;
                    default:
                        break;
                }
            } else {
                leftRoad.get(0).setCharacter(character);
                leftRoad.get(0).paintCharacter();
                playerCharactersOnBoard++;
            }
            
        } else if (JListCharacters.getSelectedValue().equals("Hechicero")) {
            
            paintButtonImage(btCamino1, null);
            Character character = new Character(CharacterType.WIZARD);
            character.setIsPlayerCharacter(true);
            
            if (leftRoad.get(0).getCharacter() != null) {
                Battle battle = new Battle();
                int battleResult = battle.battleInSelect(character, leftRoad.get(0).getCharacter());
                switch (battleResult) {
                    case 1:
                        logicCpu.lessLeft();
                        
                        leftRoad.get(0).setCharacter(character);
                        leftRoad.get(0).paintCharacter();
                        playerCharactersOnBoard++;
                        break;
                    default:
                        break;
                }
            } else {
                leftRoad.get(0).setCharacter(character);
                leftRoad.get(0).paintCharacter();
                playerCharactersOnBoard++;
            }
            
        } else {
            
            paintButtonImage(btCamino1, null);
            Character character = new Character(CharacterType.WARRIOR);
            character.setIsPlayerCharacter(true);
            
            if (leftRoad.get(0).getCharacter() != null) {
                Battle battle = new Battle();
                int battleResult = battle.battleInSelect(character, leftRoad.get(0).getCharacter());
                switch (battleResult) {
                    case 1:
                        logicCpu.lessLeft();
                        
                        leftRoad.get(0).setCharacter(character);
                        leftRoad.get(0).paintCharacter();
                        playerCharactersOnBoard++;
                        break;
                    default:
                        break;
                }
            } else {
                leftRoad.get(0).setCharacter(character);
                leftRoad.get(0).paintCharacter();
                playerCharactersOnBoard++;
            }
            
        }
        btCamino2.setVisible(false);
        btCamino1.setVisible(false);
        JListCharacters.clearSelection();
        JListCharacters.setEnabled(false);
        btSelecTropas.setEnabled(false);
        
        if (charactersLeft - 1 > 0) {
            logicCpu.selectCharacterCpu(leftRoad, rightRoad, characterList);
        }
        
        charactersLeft--;
        
        lblCharactersLeftText.setText(charactersLeft + "");        
        
        moveCharacters();
    }//GEN-LAST:event_btCamino1MouseClicked
    

    private void JListCharactersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_JListCharactersValueChanged
        btSelecTropas.setEnabled(true);
    }//GEN-LAST:event_JListCharactersValueChanged

    private void btCamino2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCamino2MouseClicked
        if (JListCharacters.getSelectedValue().equals("Arquero")) {
            
            paintButtonImage(btCamino2, null);
            Character character = new Character(CharacterType.ARCHER);
            character.setIsPlayerCharacter(true);
            
            if (rightRoad.get(0).getCharacter() != null) {
                Battle battle = new Battle();
                int battleResult = battle.battleInSelect(character, rightRoad.get(0).getCharacter());
                switch (battleResult) {
                    case 1:
                        logicCpu.lessLeft();
                        
                        rightRoad.get(0).setCharacter(character);
                        rightRoad.get(0).paintCharacter();
                        playerCharactersOnBoard++;
                        break;
                    default:
                        break;
                }
            } else {
                rightRoad.get(0).setCharacter(character);
                rightRoad.get(0).paintCharacter();
                playerCharactersOnBoard++;
            }
            
        } else if (JListCharacters.getSelectedValue().equals("Hechicero")) {
            paintButtonImage(btCamino2, null);
            Character character = new Character(CharacterType.WIZARD);
            character.setIsPlayerCharacter(true);
            
            if (rightRoad.get(0).getCharacter() != null) {
                Battle battle = new Battle();
                int battleResult = battle.battleInSelect(character, rightRoad.get(0).getCharacter());
                switch (battleResult) {
                    case 1:
                        logicCpu.lessLeft();
                        
                        rightRoad.get(0).setCharacter(character);
                        rightRoad.get(0).paintCharacter();
                        playerCharactersOnBoard++;
                        break;
                    default:
                        break;
                }
            } else {
                rightRoad.get(0).setCharacter(character);
                rightRoad.get(0).paintCharacter();
                playerCharactersOnBoard++;
            }
            
        } else {
            
            paintButtonImage(btCamino2, null);
            Character character = new Character(CharacterType.WARRIOR);
            character.setIsPlayerCharacter(true);
            
            if (rightRoad.get(0).getCharacter() != null) {
                Battle battle = new Battle();
                int battleResult = battle.battleInSelect(character, rightRoad.get(0).getCharacter());
                switch (battleResult) {
                    case 1:
                        logicCpu.lessLeft();
                        
                        rightRoad.get(0).setCharacter(character);
                        rightRoad.get(0).paintCharacter();
                        playerCharactersOnBoard++;
                        break;
                    default:
                        break;
                }
            } else {
                rightRoad.get(0).setCharacter(character);
                rightRoad.get(0).paintCharacter();
                playerCharactersOnBoard++;
            }
            
        }
        btCamino1.setVisible(false);
        btCamino2.setVisible(false);
        JListCharacters.clearSelection();
        JListCharacters.setEnabled(false);
        btSelecTropas.setEnabled(false);
        
        if (charactersLeft - 1 > 0) {
            logicCpu.selectCharacterCpu(leftRoad, rightRoad, characterList);
        }
        
        charactersLeft--;
        
        lblCharactersLeftText.setText(charactersLeft + "");
        
        moveCharacters();
    }//GEN-LAST:event_btCamino2MouseClicked
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }

    //Este metodo sirve para pintar y adaptar una imagen a un JLabel
    public void paintLabelImage(JLabel label, String ruta) {
        image = new ImageIcon(ruta);
        icon = new ImageIcon(image.getImage().getScaledInstance(
                label.getWidth(),
                label.getHeight(),
                Image.SCALE_DEFAULT));
        label.setIcon(icon);
        this.repaint();
    }

    //Este metodo sirve para pintar y adaptar una imagen a un JButton
    public void paintButtonImage(JButton button, String ruta) {
        image = new ImageIcon(ruta);
        icon = new ImageIcon(image.getImage().getScaledInstance(
                button.getWidth(),
                button.getHeight(),
                Image.SCALE_DEFAULT));
        button.setIcon(icon);
        this.repaint();
    }

    //Este metodo se encarga del funcionamiento del cronometro
    public void startTimer() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (segundos < 59) {
                    segundos++;
                    
                    if (segundos >= 10) {
                        segundosStr = Integer.toString(segundos);
                    } else {
                        segundosStr = "0" + Integer.toString(segundos);
                    }
                } else {
                    segundos = 0;
                    minutos++;
                    if (minutos >= 10) {
                        minutosStr = Integer.toString(minutos);
                        
                        if (minutos == 60) {
                            horas++;
                            if (horas >= 10) {
                                horasStr = Integer.toString(horas);
                            } else {
                                horasStr = "0" + Integer.toString(horas);
                                
                            }
                            minutos = 0;
                        }
                        
                    } else {
                        minutosStr = "0" + Integer.toString(minutos);
                    }
                }
                contadorLabel.setText(horasStr + ':' + minutosStr + ':' + segundosStr);
                
            }
        });
        timer.setInitialDelay(0);
        timer.start();
    }

    //Este metodo actualiza la barra de puntos de vida en pantalla
    public void updateHitPointsBar(Torre tower, JProgressBar bar) {
        int life = (int) Math.ceil(tower.getLife());
        bar.setValue(life);
    }
    
    public void turn() {
        if (charactersLeft == 0) {
            Round round = new Round(this);
            round.start();
            return;
        }
        
        JListCharacters.setEnabled(true);
    }
    
    public void moveCharacters() {
        MoveCpu moveCpu = new MoveCpu(leftRoad, rightRoad, playerTower, this, playerHitPointsBar, logicCpu);
        MovePlayer movePlayer = new MovePlayer(leftRoad, rightRoad, cpuTower, this, cpuHitPointBar, logicCpu, moveCpu);
        movePlayer.start();
    }
    
    public void showNewRound() {
        charactersPerRound = roundNum + 4;
        charactersLeft = charactersPerRound;
        
        lblCharactersLeftText.setText(charactersLeft + "");
        
        logicCpu.firstThree(characterList, jListCpu);
        
        lblNewRoundText.setText("Round: " + roundNum);
        
        lblNewRound.setVisible(true);
        lblNewRoundText.setVisible(true);
        
        roundNum++;
    }
    
    public void dontShowNewRound() {
        lblNewRound.setVisible(false);
        lblNewRoundText.setVisible(false);
        
    }

    public void showSelectTroops() {
        lblSelectTroops.setVisible(true);
        lblSelectTroopsText.setVisible(true);
    }

    public void dontShowSelectTroops() {
        
        lblSelectTroops.setVisible(false);
        lblSelectTroopsText.setVisible(false);
    }

    //stopTimer() funciona para detener y reanudar el cronometro
    public void stopTimer() {
        if (timer.isRunning()) {
            timer.stop();
        } else {
            timer.start();
        }
    }
    
    public int getCharactersLeft() {
        return charactersLeft;
    }
    
    public int getPlayerCharactersOnBoard() {
        return playerCharactersOnBoard;
    }
    
    public void lessCharactersOnBoard() {
        playerCharactersOnBoard--;
    }
    
    public void gameFinish(String finisText) {
        lblGameFinishText.setText(finisText);
        
        lblNewRound.setVisible(true);
        lblGameFinishText.setVisible(true);
    }
    
    public void updateLblCharactersLeft() {
        lblCharactersLeftText.setText(charactersLeft + "");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JListCharacters;
    private javax.swing.JButton btCamino1;
    private javax.swing.JButton btCamino2;
    private javax.swing.JButton btSelecTropas;
    private javax.swing.JLabel contadorLabel;
    private javax.swing.JProgressBar cpuHitPointBar;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jListCpu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBackGround;
    private javax.swing.JLabel lblBackGroundHud;
    private javax.swing.JLabel lblBoard;
    private javax.swing.JLabel lblCharactersLeft;
    private javax.swing.JLabel lblCharactersLeftText;
    private javax.swing.JLabel lblContadorBackGround;
    private javax.swing.JLabel lblGameFinishText;
    private javax.swing.JLabel lblNewRound;
    private javax.swing.JLabel lblNewRoundText;
    private javax.swing.JLabel lblSelectTroops;
    private javax.swing.JLabel lblSelectTroopsText;
    private javax.swing.JLabel leftRoad1;
    private javax.swing.JLabel leftRoad2;
    private javax.swing.JLabel leftRoad3;
    private javax.swing.JLabel leftRoad4;
    private javax.swing.JLabel leftRoad5;
    private javax.swing.JProgressBar playerHitPointsBar;
    private javax.swing.JLabel rightRoad1;
    private javax.swing.JLabel rightRoad2;
    private javax.swing.JLabel rightRoad3;
    private javax.swing.JLabel rightRoad4;
    private javax.swing.JLabel rightRoad5;
    // End of variables declaration//GEN-END:variables
}
