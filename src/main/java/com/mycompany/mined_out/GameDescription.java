package com.mycompany.mined_out;

import com.mycompany.mined_out.parser.ParserOutput;
import com.mycompany.mined_out.type.AdvObject;
import com.mycompany.mined_out.type.Command;
import com.mycompany.mined_out.type.Room;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe di tipo: <b>{@literal <<}Entity{@literal >>}</b><br>
 * Responsabilità: definire la struttura del gioco
 */
public abstract class GameDescription {

    private final List<Room> rooms = new ArrayList<>();

    private final List<Command> commands = new ArrayList<>();

    private final List<AdvObject> inventory = new ArrayList<>();

    private Room currentRoom;

    /**
     * ritorna la lista delle stanze del gioco
     *
     * @return
     */
    public List<Room> getRooms() {
        return rooms;
    }

    /**
     * ritorna la lista dei comandi del gioco
     *
     * @return
     */
    public List<Command> getCommands() {
        return commands;
    }

    /**
     * ritorna la stanza corrente
     *
     * @return
     */
    public Room getCurrentRoom() {
        return currentRoom;
    }

    /**
     * imposta la stanza corrente
     *
     * @param currentRoom
     */
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    /**
     * ritorna la lista dell'inventario
     *
     * @return
     */
    public List<AdvObject> getInventory() {
        return inventory;
    }

    /**
     * definizione del metodo per inizializzare il gioco
     *
     * @throws Exception
     */
    public abstract void init() throws Exception;

    /**
     * definizione del metodo per eseguire una mossa
     *
     * @param p
     * @param out
     * @return
     */
    public abstract String nextMove(ParserOutput p);

}
