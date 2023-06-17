package com.mycompany.mined_out.utils;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * Classe di tipo: <b>{@literal <<}Control{@literal >>}</b><br>
 * Responsabilità: gestire la connessione e scambio di informazioni con un DataBase
 */
public class DataBase {

    private static final String CREATE_TABLE_USER = "CREATE TABLE IF NOT EXISTS user (username VARCHAR(25) PRIMARY KEY)";
    private static final String CREATE_TABLE_COMMAND = "CREATE TABLE IF NOT EXISTS command (id INT AUTO_INCREMENT PRIMARY KEY, username VARCHAR(25) REFERENCES user(username), comando VARCHAR(3000))";
    private Connection connessione;

    /**
     * ritorna la stringa di creazione della tabella user
     *
     * @return 
     */
    public static String getCREATE_TABLE_USER() {
        return CREATE_TABLE_USER;
    }

    /**
     * ritorna la stringa di creazione della tabella command
     *
     * @return
     */
    public static String getCREATE_TABLE_COMMAND() {
        return CREATE_TABLE_COMMAND;
    }

    /**
     * costruttore della classe
     *
     * @param dbPath
     */
    public DataBase(String dbPath) {

        dbConnection(dbPath);
    }

    /**
     * esegue la connessione al DataBase
     *
     * @param dbPath
     */
    private void dbConnection(String dbPath) {

        try {
            connessione = DriverManager.getConnection(dbPath);

            Statement cr_tab_utente = connessione.createStatement();
            cr_tab_utente.executeUpdate(getCREATE_TABLE_USER());
            Statement cr_tab_command = connessione.createStatement();
            cr_tab_command.executeUpdate(getCREATE_TABLE_COMMAND());
        } catch (SQLException ex) {
            JOptionPane optionPane = new JOptionPane(" Errore: " + ex, JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("DataBase Error");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }

    }

    /**
     * esegue la query di inserimento di un utente
     *
     * @param username
     * @return
     */
    public boolean insertUser(String username) {

        boolean flag = false;

        try {
            if (!cercaUtente(username)) {
                PreparedStatement pstm = connessione.prepareStatement("INSERT INTO user VALUES (?)");
                pstm.setString(1, username);
                pstm.executeUpdate();

                flag = true;
            }
        } catch (SQLException ex) {
            JOptionPane optionPane = new JOptionPane(" Errore: " + ex, JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("DataBase Error");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }
        return flag;

    }

    /**
     * esegue la query di inserimento di un comando
     *
     * @param username
     * @param comando
     */
    public void inserisci_comando(String username, String comando) {

        try {
            PreparedStatement pstm = connessione.prepareStatement("INSERT INTO command VALUES (null, ?, ?)");
            pstm.setString(1, username);
            pstm.setString(2, comando);
            pstm.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane optionPane = new JOptionPane(" Errore: " + ex, JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("DataBase Error");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }

    }

    /**
     * restituisce "true" se l'username passato come parametro è presente nel
     * DataBase "false" altrimenti
     *
     * @param username
     * @return
     */
    public boolean cercaUtente(String username) {
        boolean flag = false;
        try {
            ResultSet rs;
            PreparedStatement select = connessione.prepareStatement("SELECT username FROM user WHERE username = ?");
            select.setString(1, username);
            rs = select.executeQuery();

            if (rs.first()) {
                flag = true;
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane optionPane = new JOptionPane(" Errore: " + ex, JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("DataBase Error");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }
        return flag;
    }

    /**
     * esegue la query di eliminazione di un utente, in base all'username
     * passato in input
     *
     * @param username
     */
    public void eliminaUtente(String username) {

        try {
            PreparedStatement pstm = connessione.prepareStatement("DELETE FROM user WHERE username = ?");
            pstm.setString(1, username);

            pstm.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane optionPane = new JOptionPane(" Errore: " + ex, JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("DataBase Error");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }

    }

    /**
     * carica i comandi della tabella command, di un particolare utente in una
     * lista la quale è restituita
     *
     * @param username
     * @return
     */
    public List<String> caricaComandi(String username) {

        List<String> comandi = new ArrayList();
        try {
            ResultSet rs;
            PreparedStatement select = connessione.prepareStatement("SELECT comando FROM command WHERE username = ? ORDER BY id");
            select.setString(1, username);
            rs = select.executeQuery();

            if (rs.first()) {

                while (!rs.isAfterLast()) {
                    comandi.add(rs.getString(1));
                    rs.next();
                }
            }

            PreparedStatement pstm = connessione.prepareStatement("DELETE FROM command WHERE username = ?");
            pstm.setString(1, username);

            pstm.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane optionPane = new JOptionPane(" Errore: " + ex, JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("DataBase Error");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }

        return comandi;

    }

    /**
     * restituisce la lista di utenti presenti nel DataBase
     *
     * @return
     */
    public List<String> mostraUtenti() {
        List<String> user = new ArrayList();
        try {
            ResultSet rs;

            Statement mostraUtenti = connessione.createStatement();
            rs = mostraUtenti.executeQuery("SELECT username FROM user");
            if (rs.first()) {

                while (!rs.isAfterLast()) {
                    user.add(rs.getString(1));
                    rs.next();
                }
            }
        } catch (SQLException ex) {
            JOptionPane optionPane = new JOptionPane(" Errore: " + ex, JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("DataBase Error");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }

        return user;
    }

    /**
     * esegue la disconnesione dal DataBase
     */
    public void closeConnection() {
        try {
            connessione.close();
        } catch (SQLException ex) {
            JOptionPane optionPane = new JOptionPane(" Errore: " + ex, JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("DataBase Error");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }
    }

}
