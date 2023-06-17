package com.mycompany.mined_out.Gui;

import com.mycompany.mined_out.utils.DataBase;
import java.awt.event.KeyEvent;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/** 
 * Classe di tipo: <b>{@literal <<}Boundary{@literal >>}</b><br>
 * Responsabilità: definire un pannello che mostra la schermata iniziale e
 *                 l'accessoimposta 
 */
public class StartGameGui extends javax.swing.JDialog {

    private static String username = null;
    private final String USERNAME_TYPE = "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";
    private static String dbPath = ("jdbc:h2:./resources/DataBase/db");

    private final Image icona = Toolkit.getDefaultToolkit().getImage("./resources/image/icona.gif");
    private final Image sfondo = Toolkit.getDefaultToolkit().getImage("./resources/image/sfondo.gif");

    private final GameGui f1 = new GameGui();

    /**
     * restituisce il tipo di username
     *
     * @return
     */
    public String getUSERNAME_TYPE() {
        return USERNAME_TYPE;
    }

    /**
     * restituisce l' username
     *
     * @return
     */
    public static String getUsername() {
        return username;
    }

    /**
     * modifica l'username
     *
     * @param username
     */
    public void setUsername(String username) {
        StartGameGui.username = username;
    }

    /**
     * restituisce il path del database
     *
     * @return
     */
    public static String getDbPath() {
        return dbPath;
    }

    /**
     * cosrtuttore della classe
     *
     * @param parent
     * @param modal
     */
    public StartGameGui(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    /**
     * inizializza la Gamegui
     */
    public StartGameGui() {
        initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputUsernameDialog = new javax.swing.JDialog();
        jPanel2 = new com.mycompany.mined_out.Gui.BackGroundModel(sfondo);
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        selectUtentiEsistentiDialog = new javax.swing.JDialog();
        jPanel3 = new com.mycompany.mined_out.Gui.BackGroundModel(sfondo);
        titoloLabel = new javax.swing.JLabel();
        scrollText = new javax.swing.JScrollPane();
        utentiTextArea = new javax.swing.JTextArea();
        inputUsernameTextField = new javax.swing.JTextField();
        inviaButton = new javax.swing.JButton();
        jPanel1 = new com.mycompany.mined_out.Gui.BackGroundModel(sfondo);
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        inputUsernameDialog.setTitle("Mined Out");
        inputUsernameDialog.setIconImage(icona);
        inputUsernameDialog.setMinimumSize(new java.awt.Dimension(262, 110));
        inputUsernameDialog.setPreferredSize(new java.awt.Dimension(262, 110));
        inputUsernameDialog.setResizable(false);
        inputUsernameDialog.setLocationRelativeTo(null);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("invia");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inserisci l'username");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout inputUsernameDialogLayout = new javax.swing.GroupLayout(inputUsernameDialog.getContentPane());
        inputUsernameDialog.getContentPane().setLayout(inputUsernameDialogLayout);
        inputUsernameDialogLayout.setHorizontalGroup(
            inputUsernameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        inputUsernameDialogLayout.setVerticalGroup(
            inputUsernameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputUsernameDialogLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        selectUtentiEsistentiDialog.setMinimumSize(new java.awt.Dimension(297, 220));
        selectUtentiEsistentiDialog.setPreferredSize(new java.awt.Dimension(297, 220));
        selectUtentiEsistentiDialog.setResizable(false);
        selectUtentiEsistentiDialog.setLocationRelativeTo(null);

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setPreferredSize(new java.awt.Dimension(266, 220));

        titoloLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titoloLabel.setForeground(new java.awt.Color(255, 255, 255));
        titoloLabel.setText("Utenti esistenti");

        utentiTextArea.setEditable(false);
        utentiTextArea.setColumns(20);
        utentiTextArea.setRows(5);
        utentiTextArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        scrollText.setViewportView(utentiTextArea);

        inputUsernameTextField.setText("Inserisci username tra quelli presenti...");
        inputUsernameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        inputUsernameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputUsernameTextFieldMouseClicked(evt);
            }
        });
        inputUsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUsernameTextFieldActionPerformed(evt);
            }
        });
        inputUsernameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputUsernameTextFieldKeyPressed(evt);
            }
        });

        inviaButton.setBackground(new java.awt.Color(0, 0, 0));
        inviaButton.setForeground(new java.awt.Color(204, 204, 204));
        inviaButton.setText("Invia");
        inviaButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        inviaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inviaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(titoloLabel))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(inputUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inviaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollText, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(titoloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollText, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inviaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputUsernameTextField))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout selectUtentiEsistentiDialogLayout = new javax.swing.GroupLayout(selectUtentiEsistentiDialog.getContentPane());
        selectUtentiEsistentiDialog.getContentPane().setLayout(selectUtentiEsistentiDialogLayout);
        selectUtentiEsistentiDialogLayout.setHorizontalGroup(
            selectUtentiEsistentiDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        selectUtentiEsistentiDialogLayout.setVerticalGroup(
            selectUtentiEsistentiDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mined out");
        setIconImage(icona);
        setMinimumSize(new java.awt.Dimension(227, 85));
        setResizable(false);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Carica partita");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Nuova Partita");
        jButton1.setActionCommand("");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Benvenuto in Mined_Out");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        inputUsernameDialog.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        boolean flag = true;
        DataBase op = new DataBase(getDbPath());
        if (!jTextField1.getText().matches(this.getUSERNAME_TYPE())) {
            JOptionPane optionPane = new JOptionPane(" Inserisci un username valido: \n -caratteri tra 5 e 20 \n -deve cominciare con numuero o lettera");
            JDialog dialog = optionPane.createDialog("Insert Error");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            jTextField1.setText("");
            flag = false;
        }
        if (flag) {
            if (op.insertUser(jTextField1.getText())) {

                this.setUsername(jTextField1.getText());

                f1.initAll();
                f1.setLocationRelativeTo(null);
                f1.show();
                jTextField1.setText("");
                inputUsernameDialog.dispose(); //vedere perche resta in exe
                op.closeConnection();
            } else {
                JOptionPane optionPane = new JOptionPane(" Utente gia' esistente", JOptionPane.ERROR_MESSAGE);
                JDialog dialog = optionPane.createDialog("DataBase Error");
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
                jTextField1.setText("");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton3.doClick();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        selectUtentiEsistentiDialog.show();

        List<String> utenti;
        DataBase op = new DataBase(getDbPath());
        utenti = op.mostraUtenti();
        utenti.forEach(s -> {
            utentiTextArea.setText(utentiTextArea.getText() + " -" + s + "\n");
        });
        op.closeConnection();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void inputUsernameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputUsernameTextFieldMouseClicked
        inputUsernameTextField.setText("");

    }//GEN-LAST:event_inputUsernameTextFieldMouseClicked

    private void inviaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inviaButtonActionPerformed

        DataBase op = new DataBase(getDbPath());
        if (op.cercaUtente(inputUsernameTextField.getText())) {
            this.setUsername(inputUsernameTextField.getText());
            f1.initAll();
            f1.show();

            f1.engine.caricaPartita(inputUsernameTextField.getText());

            inputUsernameTextField.setText("");
            inputUsernameDialog.dispose();
            selectUtentiEsistentiDialog.dispose();
            this.dispose();
        } else {
            JOptionPane optionPane = new JOptionPane(" Utente non esistente", JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("DataBase Error");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);

        }
        op.closeConnection();
    }//GEN-LAST:event_inviaButtonActionPerformed

    private void inputUsernameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputUsernameTextFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            inviaButton.doClick();

        }
    }//GEN-LAST:event_inputUsernameTextFieldKeyPressed

    private void inputUsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUsernameTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog inputUsernameDialog;
    private javax.swing.JTextField inputUsernameTextField;
    private javax.swing.JButton inviaButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JScrollPane scrollText;
    private javax.swing.JDialog selectUtentiEsistentiDialog;
    private javax.swing.JLabel titoloLabel;
    private javax.swing.JTextArea utentiTextArea;
    // End of variables declaration//GEN-END:variables
}
