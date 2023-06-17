package com.mycompany.mined_out;

import com.mycompany.mined_out.Gui.StartGameGui;

/**
 * Classe di tipo <b>{@literal <<}Control{@literal >>}</b><br>
 * Responsabilità: avviare il gioco
 */
public class Main {

    /**
     * metodo principale che avvia la Gui d'entrata del gioco
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StartGameGui open = new StartGameGui();
        open.show();

    }
}
