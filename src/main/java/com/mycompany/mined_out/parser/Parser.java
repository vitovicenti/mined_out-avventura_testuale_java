package com.mycompany.mined_out.parser;

import com.mycompany.mined_out.utils.Utils;
import com.mycompany.mined_out.type.AdvObject;
import com.mycompany.mined_out.type.Command;
import java.util.List;
import java.util.Set;

/**
 * Classe di tipo: <b>{@literal <<}Control{@literal >>}</b><br>
 * Responsabilità: riconoscere il comando inserito dall'utente
 */
public class Parser {

    private final Set<String> stopwords;

    /**
     * definisce le stopwords
     *
     * @param stopwords
     */
    public Parser(Set<String> stopwords) {
        this.stopwords = stopwords;
    }

    private int checkForCommand(String token, List<Command> commands) {
        for (int i = 0; i < commands.size(); i++) {

            if (commands.get(i).getName().equals(token) || commands.get(i).getAlias().contains(token)) {
                return i;
            }
        }
        return -1;
    }

    private int checkForObject(String token, List<AdvObject> obejcts) {
        for (int i = 0; i < obejcts.size(); i++) {
            if (obejcts.get(i).getName().equals(token) || obejcts.get(i).getAlias().contains(token)) {
                return i;
            }
        }
        return -1;
    }

    
    /**
     * implementazione del parser
     * 
     * tale implementazione accetta comandi del tipo "comando" "oggetto-inevetario" "oggetto-stanza", rendendo possibile
     * l'utilizzo di un oggetto dell'inventario con un altro oggetto che non può essere messo nell'inventario
     * esempio: sia il comando "usa chiave con carrello" che "usa chiave", sono accettati come comandi che fanno proseguire,
     * in base alla stanza corrente
     *
     * @param command
     * @param commands
     * @param objects
     * @param inventory
     * @return
     */
    public ParserOutput parse(String command, List<Command> commands, List<AdvObject> objects, List<AdvObject> inventory) {

        List<String> tokens = Utils.parseString(command, stopwords);
        if (!tokens.isEmpty()) {
            int ic = checkForCommand(tokens.get(0), commands);
            if (ic > -1) {
                if (tokens.size() > 1) {
                    int io = checkForObject(tokens.get(1), objects);
                    int ioinv;
                    if (io < 0 && tokens.size() > 2) {
                        io = checkForObject(tokens.get(2), objects);
                    }
                    
                        ioinv = checkForObject(tokens.get(1), inventory);
                        if (ioinv < 0 && tokens.size() > 2) {
                            ioinv = checkForObject(tokens.get(2), inventory);
                        }
                    
                    if (io > -1 && ioinv > -1) {
                        return new ParserOutput(commands.get(ic), objects.get(io), inventory.get(ioinv));
                    } else if (io > -1) {
                        return new ParserOutput(commands.get(ic), objects.get(io), null);
                    } else if (ioinv > -1) {
                        return new ParserOutput(commands.get(ic), null, inventory.get(ioinv));
                    } else {
                        return new ParserOutput(commands.get(ic), null, null);
                    }
                } else {
                    return new ParserOutput(commands.get(ic), null);
                }
            } else {
                return new ParserOutput(null, null);
            }
        } else {
            return null;
        }
    }

}
