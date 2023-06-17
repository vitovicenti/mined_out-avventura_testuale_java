package com.mycompany.mined_out.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * Classe di tipo: <b>{@literal <<}Control{@literal >>}</b><br>
 * Responsabilità: gestire il tempo di gioco
 */
public class Tempo extends Thread {

    private int count = 0;
    private String tempo = null;
    private int minuti = 0, secondi = 0;

    @Override
    public void run() {
        this.vai();
    }

    /**
     * metodo che ogni secondo incrementa la variabile contatore e la suddivide in minuti e secondi
     */
    public void vai() {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tempo.class.getName()).log(Level.SEVERE, null, ex);
            }
            count++;

            minuti = count / 60;
            secondi = count % 60;

            tempo = (minuti + ":" + secondi);

        }
    }

    /**
     * ritorna l'attributo tempo
     * @return
     */
    public String getTempo() {
        return tempo;
    }
}
