package com.mycompany.mined_out.type;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Classe di tipo: <b>{@literal <<}Entity{@literal >>}</b><br>
 * Responsabilità: definire un oggetto
 */
public class AdvObject {

    private final int id;

    private String name;

    private String description;

    private Set<String> alias;

    private boolean openable = false;

    private boolean usable = true;

    /**
     * ritorna l'attributo che definisce un oggetto come utilizzabile
     *
     * @return
     */
    public boolean isUsable() {
        return usable;
    }

    /**
     * imposta l'attributo che definisce un oggetto come utilizzabile
     *
     * @param usable
     */
    public void setUsable(boolean usable) {
        this.usable = usable;
    }

    private boolean pickupable = true;

    private boolean pushable = false;

    private boolean open = false;

    private boolean push = false;

    /**
     * costruttore della classe
     *
     * @param id
     */
    public AdvObject(int id) {
        this.id = id;
    }

    /**
     * costruttore della classe
     *
     * @param id
     * @param name
     */
    public AdvObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * costruttore della classe
     *
     * @param id
     * @param name
     * @param description
     */
    public AdvObject(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * costruttore della classe
     *
     * @param id
     * @param name
     * @param description
     * @param alias
     */
    public AdvObject(int id, String name, String description, Set<String> alias) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.alias = alias;
    }

    /**
     * ritorna il nome dell'oggetto
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * imposta il nome dell'oggetto
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ritorna la descrizione dell'oggetto
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * imposta la descrizione dell'oggetto
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * ritorna l'attributo che definisce un oggetto come apribile
     *
     * @return
     */
    public boolean isOpenable() {
        return openable;
    }

    /**
     * imposta l'attributo che definisce un oggetto come apribile
     *
     * @param openable
     */
    public void setOpenable(boolean openable) {
        this.openable = openable;
    }

    /**
     * ritorna l'attributo che definisce un oggetto come prendibile
     *
     * @return
     */
    public boolean isPickupable() {
        return pickupable;
    }

    /**
     * imposta l'attributo che definisce un oggetto come prendibile
     *
     * @param pickupable
     */
    public void setPickupable(boolean pickupable) {
        this.pickupable = pickupable;
    }

    /**
     * ritorna l'attributo che definisce un oggetto come premibile
     *
     * @return
     */
    public boolean isPushable() {
        return pushable;
    }

    /**
     * imposta l'attributo che definisce un oggetto come premibile
     *
     * @param pushable
     */
    public void setPushable(boolean pushable) {
        this.pushable = pushable;
    }

    /**
     * ritorna l'attributo che definisce un oggetto come aperto/chiuso
     *
     * @return
     */
    public boolean isOpen() {
        return open;
    }

    /**
     * imposta l'attributo che definisce un oggetto come aperto/chiuso
     *
     * @param open
     */
    public void setOpen(boolean open) {
        this.open = open;
    }

    /**
     * ritorna l'attributo che definisce un oggetto come premuto
     *
     * @return
     */
    public boolean isPush() {
        return push;
    }

    /**
     * imposta l'attributo che definisce un oggetto come premuto
     *
     * @param push
     */
    public void setPush(boolean push) {
        this.push = push;
    }

    /**
     * ritorna l'insieme degli alias degli oggetti
     *
     * @return
     */
    public Set<String> getAlias() {
        return alias;
    }

    /**
     * imposta l'insieme degli alias degli oggetti
     *
     * @param alias
     */
    public void setAlias(Set<String> alias) {
        this.alias = alias;
    }

    /**
     * imposta la lista degli alias degli oggetti
     *
     * @param alias
     */
    public void setAlias(String[] alias) {
        this.alias = new HashSet<>(Arrays.asList(alias));
    }

    /**
     * ritorna l'id dell'oggetto
     *
     * @return
     */
    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
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
        final AdvObject other = (AdvObject) obj;
        return this.id == other.id;
    }

}
