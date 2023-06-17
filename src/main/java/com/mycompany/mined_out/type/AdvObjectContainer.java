package com.mycompany.mined_out.type;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Classe di tipo: <b>{@literal <<}Entity{@literal >>}</b><br>
 * Responsabilità: definire un oggetto che può contenere altri oggetti al suo interno
 */
public class AdvObjectContainer extends AdvObject {

    private List<AdvObject> list = new ArrayList<>();

    /**
     * costruttore della classe
     *
     * @param id
     */
    public AdvObjectContainer(int id) {
        super(id);
    }

    /**
     * costruttore della classe
     *
     * @param id
     * @param name
     */
    public AdvObjectContainer(int id, String name) {
        super(id, name);
    }

    /**
     * costruttore della classe
     *
     * @param id
     * @param name
     * @param description
     */
    public AdvObjectContainer(int id, String name, String description) {
        super(id, name, description);
    }

    /**
     * costruttore della classe
     *
     * @param id
     * @param name
     * @param description
     * @param alias
     */
    public AdvObjectContainer(int id, String name, String description, Set<String> alias) {
        super(id, name, description, alias);
    }

    /**
     * ritorna la lista dei comandi
     *
     * @return
     */
    public List<AdvObject> getList() {
        return list;
    }

    /**
     * imposta la lista dei comandi
     *
     * @param list
     */
    public void setList(List<AdvObject> list) {
        this.list = list;
    }

    /**
     * aggiunge un comando alla lista
     *
     * @param o
     */
    public void add(AdvObject o) {
        list.add(o);
    }

    /**
     * rimuove un comando dalla lista
     *
     * @param o
     */
    public void remove(AdvObject o) {
        list.remove(o);
    }

}
