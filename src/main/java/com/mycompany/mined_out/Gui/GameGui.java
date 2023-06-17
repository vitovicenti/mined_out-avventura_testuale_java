package com.mycompany.mined_out.Gui;

import com.mycompany.mined_out.game.Dialoghi;
import com.mycompany.mined_out.Engine;
import static com.mycompany.mined_out.Gui.StartGameGui.getDbPath;
import com.mycompany.mined_out.utils.SongPlayer;
import com.mycompany.mined_out.game.Mined_Out;
import com.mycompany.mined_out.utils.DataBase;
import com.mycompany.mined_out.utils.Tempo;
import java.awt.event.KeyEvent;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Iterator;
import javax.swing.ImageIcon;

/**
 * Classe di tipo: <b>{@literal <<}Boundary{@literal >>}</b><br>
 * Responsabilità: definire la GUI/SWING con cui interfacciare il gioco
 */
public class GameGui extends javax.swing.JFrame {

    private final Image icona = Toolkit.getDefaultToolkit().getImage("./resources/image/icona.gif");
    private final Image sfondo = Toolkit.getDefaultToolkit().getImage("./resources/image/sfondo.gif");

    private final ImageIcon map1 = new ImageIcon("./resources/image/map1.gif");
    private final ImageIcon map2 = new ImageIcon("./resources/image/map2.gif");
    private final ImageIcon map3 = new ImageIcon("./resources/image/map3.gif");
    private final ImageIcon map4 = new ImageIcon("./resources/image/map4.gif");
    private final ImageIcon map5 = new ImageIcon("./resources/image/map5.gif");
    private final ImageIcon map6 = new ImageIcon("./resources/image/map6.gif");
    private final ImageIcon map7 = new ImageIcon("./resources/image/map7.gif");

    private final SongPlayer musicIntro = new SongPlayer("./resources/audio/intro.wav");

    protected final Engine engine = new Engine(new Mined_Out());

    private final int MAX_EXPLOREDROOM = 10;
    private final Tempo tempo = new Tempo();
    private final boolean exploredRoom[] = new boolean[MAX_EXPLOREDROOM];

    /**
     * costruttore della classe
     */
    public GameGui() {

        initComponents();
        initexploredRoom();

        updateMap();

    }

    /**
     * inizializza il jFrame in modo indipendente dal costruttore
     */
    public void initAll() {

        this.setIconImage(icona);

        jTextArea2.setText(jTextArea2.getText() + Dialoghi.getIntroduzione() + "\n");
        jTextArea2.setText(jTextArea2.getText() + engine.getDescrRoom() + "\n");

        musicIntro.start();
        tempo.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salvataggioDialog = new javax.swing.JDialog();
        jPanel1 = new com.mycompany.mined_out.Gui.BackGroundModel(sfondo);
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new com.mycompany.mined_out.Gui.BackGroundModel(sfondo);
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jDialog2 = new javax.swing.JDialog();
        jPanel3 = new com.mycompany.mined_out.Gui.BackGroundModel(sfondo);
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        mainPanel = new com.mycompany.mined_out.Gui.BackGroundModel(sfondo);
        inviaButton = new javax.swing.JButton();
        inputComando = new javax.swing.JTextField();
        scrollTesto = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        titoloLabel = new javax.swing.JLabel();
        mapLabel = new javax.swing.JLabel();
        labelMappa = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        partita = new javax.swing.JMenu();
        esci = new javax.swing.JMenuItem();
        musica = new javax.swing.JMenu();
        stopMusic = new javax.swing.JMenuItem();
        riprendiMusic = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        salvataggioDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        salvataggioDialog.setTitle("Salvataggio");
        salvataggioDialog.setBackground(new java.awt.Color(0, 0, 0));
        salvataggioDialog.setForeground(new java.awt.Color(0, 0, 0));
        salvataggioDialog.setIconImage(icona);
        salvataggioDialog.setMinimumSize(new java.awt.Dimension(237, 110));
        salvataggioDialog.setResizable(false);
        salvataggioDialog.setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(237, 120));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vuoi salvare il progresso?");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Non salvare");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Salva ");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout salvataggioDialogLayout = new javax.swing.GroupLayout(salvataggioDialog.getContentPane());
        salvataggioDialog.getContentPane().setLayout(salvataggioDialogLayout);
        salvataggioDialogLayout.setHorizontalGroup(
            salvataggioDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        salvataggioDialogLayout.setVerticalGroup(
            salvataggioDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDialog1.setTitle("Mined_Out");
        jDialog1.setIconImage(icona);
        jDialog1.setMinimumSize(new java.awt.Dimension(195, 100));
        jDialog1.setResizable(false);
        jDialog1.setLocationRelativeTo(null);

        jPanel2.setMaximumSize(new java.awt.Dimension(182, 65));
        jPanel2.setMinimumSize(new java.awt.Dimension(182, 65));
        jPanel2.setPreferredSize(new java.awt.Dimension(182, 65));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tempo di gioco");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDialog2.setTitle("Mined_Out");
        jDialog2.setIconImage(icona);
        jDialog2.setMinimumSize(new java.awt.Dimension(280, 150));
        jDialog2.setResizable(false);
        jDialog2.setLocationRelativeTo(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mined Out");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hai completato il gioco");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("esci");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.gray, java.awt.Color.gray));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mined Out");
        setBackground(new java.awt.Color(39, 39, 39));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(880, 495));
        setMinimumSize(new java.awt.Dimension(880, 495));
        setResizable(false);

        mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.black, java.awt.Color.darkGray));
        mainPanel.setAutoscrolls(true);
        mainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainPanel.setMaximumSize(new java.awt.Dimension(2000, 2500));
        mainPanel.setName(""); // NOI18N
        mainPanel.setPreferredSize(new java.awt.Dimension(300, 550));

        inviaButton.setText("Invia");
        inviaButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        inviaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inviaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inviaButtonActionPerformed(evt);
            }
        });

        inputComando.setBackground(new java.awt.Color(220, 220, 220));
        inputComando.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        inputComando.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inputComando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputComandoActionPerformed(evt);
            }
        });
        inputComando.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputComandoKeyPressed(evt);
            }
        });

        scrollTesto.setMaximumSize(new java.awt.Dimension(2121212121, 32767));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(220, 220, 220));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jTextArea2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTextArea2.setMinimumSize(new java.awt.Dimension(50, 100));
        jTextArea2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea2MouseClicked(evt);
            }
        });
        scrollTesto.setViewportView(jTextArea2);

        titoloLabel.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 36)); // NOI18N
        titoloLabel.setForeground(new java.awt.Color(255, 255, 255));
        titoloLabel.setText("Mined Out ");

        mapLabel.setBackground(new java.awt.Color(0, 0, 0));
        mapLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        mapLabel.setForeground(new java.awt.Color(255, 255, 255));
        mapLabel.setText("MAPPA CONOSCIUTA");

        labelMappa.setMaximumSize(new java.awt.Dimension(280, 534));
        labelMappa.setMinimumSize(new java.awt.Dimension(280, 534));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollTesto, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(inputComando, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inviaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(mapLabel))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelMappa, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(titoloLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(titoloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(scrollTesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputComando, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(inviaButton))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(mapLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMappa, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        Menu.setBackground(new java.awt.Color(51, 51, 51));
        Menu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Menu.setForeground(new java.awt.Color(214, 214, 214));

        partita.setBackground(new java.awt.Color(51, 51, 51));
        partita.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        partita.setForeground(new java.awt.Color(255, 255, 255));
        partita.setText("Partita");

        esci.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        esci.setBackground(new java.awt.Color(0, 0, 0));
        esci.setForeground(new java.awt.Color(255, 255, 255));
        esci.setText("Esci");
        esci.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        esci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esciActionPerformed(evt);
            }
        });
        partita.add(esci);

        Menu.add(partita);

        musica.setBackground(new java.awt.Color(51, 51, 51));
        musica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        musica.setForeground(new java.awt.Color(255, 255, 255));
        musica.setText("Musica");

        stopMusic.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        stopMusic.setBackground(new java.awt.Color(0, 0, 0));
        stopMusic.setForeground(new java.awt.Color(255, 255, 255));
        stopMusic.setText("Stop");
        stopMusic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        stopMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopMusicActionPerformed(evt);
            }
        });
        musica.add(stopMusic);

        riprendiMusic.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        riprendiMusic.setBackground(new java.awt.Color(0, 0, 0));
        riprendiMusic.setForeground(new java.awt.Color(255, 255, 255));
        riprendiMusic.setText("Riprendi");
        riprendiMusic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        riprendiMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riprendiMusicActionPerformed(evt);
            }
        });
        musica.add(riprendiMusic);

        Menu.add(musica);

        jMenu1.setBackground(new java.awt.Color(51, 51, 51));
        jMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Tempo");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        Menu.add(jMenu1);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        mainPanel.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void esciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esciActionPerformed

        salvataggioDialog.show();
        salvataggioDialog.setLocationRelativeTo(this);
    }//GEN-LAST:event_esciActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DataBase op = new DataBase(getDbPath());
        op.eliminaUtente(StartGameGui.getUsername());
        op.closeConnection();
        this.dispose();
        salvataggioDialog.dispose();
        System.exit(0);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        DataBase op = new DataBase(getDbPath());
        Iterator<String> it = engine.getComandiDb().iterator();
        while (it.hasNext()) {
            String next = it.next();
            String s = next;
            op.inserisci_comando(StartGameGui.getUsername(), s);
        }
        op.closeConnection();

        this.dispose();
        salvataggioDialog.dispose();
        System.exit(0);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void stopMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopMusicActionPerformed

        musicIntro.stopMusic();

    }//GEN-LAST:event_stopMusicActionPerformed

    private void riprendiMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riprendiMusicActionPerformed

        musicIntro.riprendi();

    }//GEN-LAST:event_riprendiMusicActionPerformed

    private void jTextArea2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea2MouseClicked

    }//GEN-LAST:event_jTextArea2MouseClicked

    private void inputComandoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputComandoKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            inviaButton.doClick();

        }
    }//GEN-LAST:event_inputComandoKeyPressed

    private void inputComandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputComandoActionPerformed

    }//GEN-LAST:event_inputComandoActionPerformed

    private void inviaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inviaButtonActionPerformed

        String risposta;

        if (inputComando.getText() != null) {
            risposta = engine.eseguiMossa(inputComando.getText());
            inputComando.setText("");
            jTextArea2.setText(jTextArea2.getText() + "\n <" + engine.getGameNomeStanzaCorrente() + ">");
            jTextArea2.setText(jTextArea2.getText() + risposta + "\n");
            exploredRoom[engine.getGameIdStanzaCorrente()] = true;

            updateMap();

            if (engine.getGameIdStanzaCorrente() == 6) {
                jDialog2.show();

            }

        }
    }//GEN-LAST:event_inviaButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        jDialog1.show();
        jTextField1.setText(tempo.getTempo());
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DataBase op = new DataBase(getDbPath());
        op.eliminaUtente(StartGameGui.getUsername());
        op.closeConnection();
        this.dispose();

        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem esci;
    private javax.swing.JTextField inputComando;
    private javax.swing.JButton inviaButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelMappa;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel mapLabel;
    private javax.swing.JMenu musica;
    private javax.swing.JMenu partita;
    private javax.swing.JMenuItem riprendiMusic;
    private javax.swing.JDialog salvataggioDialog;
    private javax.swing.JScrollPane scrollTesto;
    private javax.swing.JMenuItem stopMusic;
    private javax.swing.JLabel titoloLabel;
    // End of variables declaration//GEN-END:variables

    /**
     * inizializza l'array delle stanze esplorate
     */
    private void initexploredRoom() {

        for (int i = 0; i < MAX_EXPLOREDROOM; i++) {
            this.exploredRoom[i] = false;
        }
        this.exploredRoom[1] = true;

    }

    /**
     *
     * imposta le foto delle mappe che cambieranno in base alla stanza
     */
    private void updateMap() {

        if (exploredRoom[1]) {

            labelMappa.setIcon(map1);

        }
        if (exploredRoom[2]) {
            labelMappa.setIcon(map2);
        }
        if (exploredRoom[3]) {
            labelMappa.setIcon(map3);
        }

        if (exploredRoom[4]) {
            labelMappa.setIcon(map4);
        }
        if (exploredRoom[5]) {
            labelMappa.setIcon(map5);
        }
        if (exploredRoom[6]) {
            labelMappa.setIcon(map6);
        }
        if (exploredRoom[7]) {
            labelMappa.setIcon(map7);
        }
    }

}
