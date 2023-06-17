package com.mycompany.mined_out.Gui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/** 
 * Classe di tipo: <b>{@literal <<}Boundary{@literal >>}</b><br>
 * Responsabilità: definire un pannello con lo sfondo 
 */
public class BackGroundModel extends JPanel {

    private final Image img;

    /**
     * imposta l'immagine da utilizzare come sfondo
     *
     * @param img
     */
    public BackGroundModel(Image img) {

        this.img = img;

    }

    /**
     *
     * imposta come la foto che si deve adattare alla finestra
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(img, 0, 0, super.getWidth(), super.getHeight(), this);

        this.setOpaque(false);
    }

}
