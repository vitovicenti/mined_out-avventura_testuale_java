package com.mycompany.mined_out.type;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe di tipo: <b>{@literal <<}Entity{@literal >>}</b><br>
 * Responsabilità: definire l'inventario
 */
public class Inventory {

    private static final int LIMITE = 3;

    /**
     * ritorna il numero limite di oggetti che si possono inserire
     * nell'inventario
     *
     * @return
     */
    public static int getLIMITE() {
        return LIMITE;
    }

    private List<AdvObject> list = new ArrayList<>();

    /**
     * ritorna la dista di oggetti presenti nell'inventario
     *
     * @return
     */
    public List<AdvObject> getList() {
        return list;
    }

    /**
     * imposta la dista di oggetti presenti nell'inventario
     *
     * @param list
     */
    public void setList(List<AdvObject> list) {
        this.list = list;
    }

    /**
     * aggiunge un oggetto alla lista dell'inventario
     *
     * @param o
     */
    public void add(AdvObject o) {
        list.add(o);
    }

    /**
     * rimuove un oggetto dalla lista dell'inventario
     *
     * @param o
     */
    public void remove(AdvObject o) {
        list.remove(o);
    }

}
