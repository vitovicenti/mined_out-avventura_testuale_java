package com.mycompany.mined_out.parser;

import com.mycompany.mined_out.type.AdvObject;
import com.mycompany.mined_out.type.Command;


/**
 * Classe di tipo: <b>{@literal <<}Control{@literal >>}</b><br>
 * Responsabilità: restituire oggetti di tipo Command, object, invObject
 *                 in base al comando inserito dall'utente
 */
public class ParserOutput {

    private Command command;

    private AdvObject object;

    private AdvObject invObject;

    /**
     * costruttore della classe
     *
     * @param command
     * @param object
     */
    public ParserOutput(Command command, AdvObject object) {
        this.command = command;
        this.object = object;
    }

    /**
     * costruttore della classe
     *
     * @param command
     * @param object
     * @param invObejct
     */
    public ParserOutput(Command command, AdvObject object, AdvObject invObejct) {
        this.command = command;
        this.object = object;
        this.invObject = invObejct;
    }

    /**
     * restituisce il comando
     *
     * @return
     */
    public Command getCommand() {
        return command;
    }

    /**
     * restituisce il comando
     *
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * restituisce il comando
     *
     * @return
     */
    public AdvObject getObject() {
        return object;
    }

    /**
     * restituisce il comando
     *
     * @param object
     */
    public void setObject(AdvObject object) {
        this.object = object;
    }

    /**
     * restituisce l'oggetto dell'inventario
     *
     * @return
     */
    public AdvObject getInvObject() {
        return invObject;
    }

    /**
     * modifica l'oggetto presente nell'inventario
     *
     * @param invObject
     */
    public void setInvObject(AdvObject invObject) {
        this.invObject = invObject;
    }

}
