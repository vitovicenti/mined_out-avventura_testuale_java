package com.mycompany.mined_out.utils;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Classe di tipo: <b>{@literal <<}Control{@literal >>}</b><br>
 * Responsabilità: caricare e controllare la riproduzione di audio
 */
public class SongPlayer extends Thread {

    private Clip clip;
    private String filepath = null;

    /**
     * restituisce il path della canzone
     *
     * @return
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * imposta il path della canzone
     *
     * @param filepath
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    /**
     * costruttore della classe
     *
     * @param input
     */
    public SongPlayer(String input) {
        this.filepath = input;
    }

    /**
     * override del metodo run del thread
     */
    @Override
    public void run() {
        AudioInputStream input = null;
        try {
            input = AudioSystem.getAudioInputStream(new File(getFilepath()));
        } catch (UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(SongPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.clip = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(SongPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            clip.open(input);
        } catch (LineUnavailableException | IOException ex) {
            Logger.getLogger(SongPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        clip.start();
    }

    /**
     * ferma la riproduzione della musica
     */
    public void stopMusic() {

        clip.stop();

    }

    /**
     * riprende l'esecuzione della musica
     */
    public void riprendi() {
        clip.start();
    }

}
