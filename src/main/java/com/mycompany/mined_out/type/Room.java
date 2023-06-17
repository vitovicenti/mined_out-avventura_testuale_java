package com.mycompany.mined_out.type;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe di tipo: <b>{@literal <<}Entity{@literal >>}</b><br>
 * Responsabilità: definire un modello delle stanze del gioco
 */
public class Room {

    private final int id;

    private String name;

    private String description;

    private String look;

    private boolean visible = true;

    private boolean accessible = true;

    private Room south = null;

    private Room north = null;

    private Room east = null;

    private Room west = null;

    private final List<AdvObject> objects = new ArrayList<>();

    /**
     * costruttore della classe
     *
     * @param id
     */
    public Room(int id) {
        this.id = id;
    }

    /**
     * ritorna l'id della stanza
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * costruttore della classe
     *
     * @param id
     * @param name
     * @param description
     */
    public Room(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * ritorna il nome della stanza
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * imposta il nome della stanza
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ritorna la descrizione della stanza
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * imposta la descrizione della stanza
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * ritorna l'attributo che definisce se la stanza è visibile
     *
     * @return
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * imposta l'attributo che definisce se la stanza è visibile
     *
     * @param visible
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    /**
     * ritorna l'attributo che definisce se la stanza è visibile
     *
     * @return
     */
    public boolean isIsAccessible() {
        return accessible;
    }

    /**
     * imposta l'attributo che definisce se la stanza è visibile
     *
     * @param isAccessible
     */
    public void setIsAccessible(boolean isAccessible) {
        this.accessible = isAccessible;
    }

    /**
     * ritorna l'attributo che definisce la stanza a sud
     *
     * @return
     */
    public Room getSouth() {
        return south;
    }

    /**
     * imposta l'attributo che definisce la stanza a sud
     *
     * @param south
     */
    public void setSouth(Room south) {
        this.south = south;
    }

    /**
     * ritorna l'attributo che definisce la stanza a nord
     *
     * @return
     */
    public Room getNorth() {
        return north;
    }

    /**
     * imposta l'attributo che definisce la stanza a nord
     *
     * @param north
     */
    public void setNorth(Room north) {
        this.north = north;
    }

    /**
     * ritorna l'attributo che definisce la stanza a east
     *
     * @return
     */
    public Room getEast() {
        return east;
    }

    /**
     * imposta l'attributo che definisce la stanza a east
     *
     * @param east
     */
    public void setEast(Room east) {
        this.east = east;
    }

    /**
     * ritorna l'attributo che definisce la stanza a west
     *
     * @return
     */
    public Room getWest() {
        return west;
    }

    /**
     * imposta l'attributo che definisce la stanza a west
     *
     * @param west
     */
    public void setWest(Room west) {
        this.west = west;
    }

    /**
     * ritorna la lista di oggetti presenti nella stanza
     *
     * @return
     */
    public List<AdvObject> getObjects() {
        return objects;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Room other = (Room) obj;
        return this.id == other.id;
    }

    /**
     * ritorna la stringa che definisce cosa si può osservare nella stanza
     *
     * @return
     */
    public String getLook() {
        return look;
    }

    /**
     * imposta la stringa che definisce cosa si può osservare nella stanza
     *
     * @param look
     */
    public void setLook(String look) {
        this.look = look;
    }

    /**
     * ritorna l'attributo che definisce se la stanza è accessibile
     *
     * @return
     */
    public boolean getIsAccessible() {
        return this.accessible;
    }

}
