package com.mycompany.mined_out.type;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Classe di tipo: <b>{@literal <<}Entity{@literal >>}</b><br>
 * Responsabilità: definire i comandi con i relativi attributi
 */
public class Command {

    private final CommandType type;

    private final String name;

    private Set<String> alias;

    /**
     * costruttore della classe
     *
     * @param type
     * @param name
     */
    public Command(CommandType type, String name) {
        this.type = type;
        this.name = name;
    }

    /**
     * costruttore della classe
     *
     * @param type
     * @param name
     * @param alias
     */
    public Command(CommandType type, String name, Set<String> alias) {
        this.type = type;
        this.name = name;
        this.alias = alias;
    }

    /**
     * ritorna il nome del comando
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * ritorna l'alias del nome del comando
     *
     * @return
     */
    public Set<String> getAlias() {
        return alias;
    }

    /**
     * imposta l'alias del nome del comando
     *
     * @param alias
     */
    public void setAlias(Set<String> alias) {
        this.alias = alias;
    }

    /**
     * imposta l'alias del nome del comando
     *
     * @param alias
     */
    public void setAlias(String[] alias) {
        this.alias = new HashSet<>(Arrays.asList(alias));
    }

    /**
     * ritorna il tipo del comando
     *
     * @return
     */
    public CommandType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.type);
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
        final Command other = (Command) obj;
        return this.type == other.type;
    }

}
