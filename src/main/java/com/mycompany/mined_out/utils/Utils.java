package com.mycompany.mined_out.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * Classe di tipo: <b>{@literal <<}Control{@literal >>}</b><br>
 * Responsabilità: definisce metodi necessari all'esecuzione del gioco
 */
public class Utils {

    /**
     * carica il file passato in input
     *
     * @param file
     * @return
     */
    public static Set<String> loadFileListInSet(File file) {
        Set<String> set = new HashSet<>();
        try {

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                while (reader.ready()) {
                    set.add(reader.readLine().trim().toLowerCase());
                }
            }
        } catch (IOException ex) {

            JOptionPane optionPane = new JOptionPane(" Errore: " + ex, JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("LoadFile Error");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);

        }
        return set;
    }

    /**
     * suddivide la stringa in tokens, eliminando le stopwors
     *
     * @param string
     * @param stopwords
     * @return
     */
    public static List<String> parseString(String string, Set<String> stopwords) {
        List<String> tokens = new ArrayList<>();
        String[] split = string.toLowerCase().split("\\s+");
        for (String t : split) {
            if (!stopwords.contains(t)) {
                tokens.add(t);
            }
        }
        return tokens;
    }

}
