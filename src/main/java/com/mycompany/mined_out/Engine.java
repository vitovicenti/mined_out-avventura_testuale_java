package com.mycompany.mined_out;

import static com.mycompany.mined_out.Gui.StartGameGui.getDbPath;
import com.mycompany.mined_out.utils.Utils;
import com.mycompany.mined_out.parser.Parser;
import com.mycompany.mined_out.parser.ParserOutput;
import com.mycompany.mined_out.utils.DataBase;
import java.io.File;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * Classe di tipo: <b>{@literal <<}Control{@literal >>}</b><br>
 * Responsabilità: definire l'interazione tra i comandi e la logica del gioco
 */
public class Engine {

    private final GameDescription game;

    private final Parser parser;

    private List<String> comandi = new ArrayList<>();

    /**
     * ritorna la lista dei comandi dell'istanza di gioco
     *
     * @return
     */
    public List<String> getComandi() {
        return this.comandi;
    }

    /**
     * imposta la lista dei comandi dell'istanza di gioco
     *
     * @param comandi
     */
    public void setComandi(List<String> comandi) {

        this.comandi = comandi;
    }

    //deque utile per salvare i comandi e successivamente caricarli nel DB
    Deque<String> comandiDb = new LinkedList();

    /**
     * ritorna la stringa
     * @return 
     */
    public Deque<String> getComandiDb() {
        return comandiDb;
    }

    /**
     * imposta la stringa
     * @param d 
     */
    public void setComandiDb(Deque<String> d) {
        this.comandiDb = d;
    }

    /**
     *
     * @param game
     */
    public Engine(GameDescription game) {
        this.game = game;
        try {
            this.game.init();
        } catch (Exception ex) {

            JOptionPane optionPane = new JOptionPane(" Errore: " + ex, JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Game Error");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);

        }
        Set<String> stopwords = Utils.loadFileListInSet(new File("./resources/stopwords"));
        parser = new Parser(stopwords);
    }

    /**
     * ritorna l'id della stanza corrente
     *
     * @return
     */
    public int getGameIdStanzaCorrente() {
        return game.getCurrentRoom().getId();
    }

    /**
     * ritorna il nome della stanza corrente
     *
     * @return
     */
    public String getGameNomeStanzaCorrente() {
        return game.getCurrentRoom().getName();
    }

    /**
     * ritorna la dedscrizione della stanza corrente
     *
     * @return
     */
    public String getDescrRoom() {
        return game.getCurrentRoom().getDescription();
    }

    /**
     * esegue i comandi della partita precedente, selezionata in base
     * all'username
     *
     * @param username
     * @return
     */
    public boolean caricaPartita(String username) {
        boolean flag = false;

        List<String> command;

        DataBase op = new DataBase(getDbPath());
        command = (op.caricaComandi(username));
        command.stream().map(s -> {
            System.out.println(s);
            return s;
        }).forEachOrdered(s -> {
            eseguiMossa(s);
        });

        op.closeConnection();
        return flag;
    }

    /**
     * esegue il comando inserito dall'utente, restituendo l'output che deve
     * essere mostrato ad esso
     *
     * @param mos
     * @return
     */
    public String eseguiMossa(String mos) {

        comandiDb.addLast(mos);

        String s;
        ParserOutput p = parser.parse(mos, game.getCommands(), game.getCurrentRoom().getObjects(), game.getInventory());

        s = game.nextMove(p);

        return s;
    }

}
