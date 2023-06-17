package com.mycompany.mined_out.game;

import com.mycompany.mined_out.GameDescription;
import com.mycompany.mined_out.parser.ParserOutput;
import com.mycompany.mined_out.type.AdvObject;
import com.mycompany.mined_out.type.AdvObjectContainer;
import com.mycompany.mined_out.type.Command;
import com.mycompany.mined_out.type.CommandType;
import com.mycompany.mined_out.type.Inventory;
import com.mycompany.mined_out.type.Room;
import java.util.Iterator;

/** 
 * Classe di tipo: <b>{@literal <<}Control{@literal >>}</b><br>
 * Responsabilità: contiene tutte le funzioni e dichiarazioni dei comandi,
 *                 gli oggetti presenti e le possibili mosse 
 */
public class Mined_Out extends GameDescription {

    

    /**
     * imoplementa il metodo astratto init di GameDescription, inizializzando il
     * gioco quindi crea le stanze, definisce i comandi e gli oggetti
     */
    @Override
    public void init() {

        //definizione comandi
        Command nord = new Command(CommandType.NORD, "nord");
        nord.setAlias(new String[]{"n", "N", "Nord", "NORD", "avanti", "Avanti"});
        getCommands().add(nord);
        Command inventory = new Command(CommandType.INVENTORY, "inventario");
        inventory.setAlias(new String[]{"inv", "i", "I"});
        getCommands().add(inventory);
        Command sud = new Command(CommandType.SOUTH, "sud");
        sud.setAlias(new String[]{"s", "S", "Sud", "SUD", "indietro", "Indietro", "dietro"});
        getCommands().add(sud);
        Command est = new Command(CommandType.EAST, "est");
        est.setAlias(new String[]{"E", "Est", "EST", "destra", "Destra", "dx", "Dx"});
        getCommands().add(est);
        Command ovest = new Command(CommandType.WEST, "ovest");
        ovest.setAlias(new String[]{"O", "Ovest", "OVEST", "Sinistra", "sinistra", "Sx", "sx"});
        getCommands().add(ovest);

        Command look = new Command(CommandType.LOOK_AT, "osserva");
        look.setAlias(new String[]{"guarda", "vedi", "trova", "cerca", "descrivi", "esplora"});
        getCommands().add(look);
        Command pickup = new Command(CommandType.PICK_UP, "raccogli");
        pickup.setAlias(new String[]{"prendi"});
        getCommands().add(pickup);
        Command open = new Command(CommandType.OPEN, "apri");
        open.setAlias(new String[]{});
        getCommands().add(open);
        Command push = new Command(CommandType.PUSH, "premi");
        push.setAlias(new String[]{"spingi", "attiva"});
        getCommands().add(push);
        Command use = new Command(CommandType.USE, "usa");
        use.setAlias(new String[]{"utilizza"});
        getCommands().add(use);

        Command close = new Command(CommandType.CLOSE, "chiudi");
        close.setAlias(new String[]{"disattiva"});
        getCommands().add(close);

        Command silence = new Command(CommandType.SILENCE, "silenzio");
        silence.setAlias(new String[]{});
        getCommands().add(silence);

        Command drop = new Command(CommandType.DROP, "lascia");
        drop.setAlias(new String[]{"getta", "butta"});
        getCommands().add(drop);

        //definizione stanze
        Room Stanza1 = new Room(1, " Km->1 ", "\n Sei entrato in una miniera, l'atmosfera è macabra, ma devi proseguire. \n Intravedi un cartello pieno di polvere con scritto Km 1, \n forse indica la strada percorsa?");
        Stanza1.setLook("\n C'è un carrello che può servirti per avanzare sui binari, ma non è funzionante. In un angolo noti una cassetta degli attrezzi ed un piccone che potrebbero servirti. \n");

        Room Stanza2 = new Room(2, " Km->2 ", "\n Complimenti! Sei riuscito ad aggiustare il carrello, ora potresti entrarci dentro e proseguire, se non fosse per qualcosa che ti impedisce di avanzare. \n");
        Stanza2.setLook("\n Di fronte a te c'è un muro possente che ti vieta il passaggio, potrebbe essere di un materiale diverso rispetto a quello delle altre pareti. \n");
        Stanza2.setIsAccessible(false);

        Room Stanza3 = new Room(3, " Km->3 ", "\n Hai abbattuto il muro, ma una volta giunto nella stanza intravedi un bivio. Devi fare una scelta! \n");
        Stanza3.setLook("\n A destra non si intravede una strada tetra e buia con scarsa luminosità, mentre a sinistra in lontananza riesci ad intravedere la sagoma di qualcosa che potrebbe tornarti utile. \n");
        Stanza3.setIsAccessible(false);

        //aggiusta leva con martello
        Room Stanza4 = new Room(4, " Km->4 ", "\n Avanzando per questa strada l'atmosfera diventa sempre più cupa fino a quando il tuo carrello si ferma improvvisamente, ci sarà un guasto sui binari! \n");
        Stanza4.setLook("\n Di fronte a te noti che il binario è curvato e non ti permette di avanzare, ma sotto una roccia intravedi un martello che potrebbe tornarti utile. \n");
        Stanza4.setIsAccessible(true);

        Room Stanza5 = new Room(5, " Km->5 ", "\n Finalmente c'è di nuovo luce, sembra tutto molto tranquillo, fin troppo tranquillo... \n");
        Stanza5.setLook("\n Il tuo sguardo si incrocia con quello di un uomo appoggiato al muro. Si avvicina rapidamente a te sbarrandoti la strada con testuali parole:\n <Se vuoi proseguire devi risolvere prima l'enigma del MinedOut!> \n <Se fai il mio nome non ci sono più, chi sono?> \n");
        Stanza5.setIsAccessible(true);

        Room Stanza6 = new Room(6, " Km->6 ", Dialoghi.getConclusione());
        Stanza6.setIsAccessible(false);
        Stanza6.setLook("\n Finalmente intravedi un'uscita. Incamminati...\n");

        //MAPPA
        Stanza1.setNorth(Stanza2);
        getRooms().add(Stanza1);

        Stanza2.setNorth(Stanza3);
        Stanza2.setSouth(Stanza1);
        getRooms().add(Stanza2);

        Stanza3.setSouth(Stanza2);
        Stanza3.setEast(Stanza5);
        Stanza3.setWest(Stanza4);
        getRooms().add(Stanza3);

        getRooms().add(Stanza4);
        Stanza4.setNorth(Stanza3);
        Stanza4.setSouth(Stanza3);

        Stanza5.setWest(Stanza3);
        Stanza5.setNorth(Stanza6);
        getRooms().add(Stanza5);

        Stanza6.setSouth(Stanza5);
        getRooms().add(Stanza6);

        AdvObject carrello = new AdvObject(0, "carrello", "\n Hai trovato un carrello\n");
        carrello.setAlias(new String[]{});
        carrello.setUsable(false);
        carrello.setPickupable(false);
        Stanza1.getObjects().add(carrello);

        AdvObject martello = new AdvObject(7, "martello", "\n Hai trovato un martello\n");
        martello.setAlias(new String[]{"martello"});
        Stanza4.getObjects().add(martello);
        
        AdvObject muro = new AdvObject(8, "muro", "un muro");
        muro.setAlias(new String[]{"parete"});
        muro.setOpenable(false);
        muro.setPickupable(false);
        muro.setPushable(false);
        muro.setUsable(false);
        
         AdvObject binario = new AdvObject(9, "binario", "un binario");
        binario.setAlias(new String[]{"rotaia" , "rotaie"});
        binario.setOpenable(false);
        binario.setPickupable(false);
        binario.setPushable(false);
        binario.setUsable(false);
        
        AdvObject tritolo = new AdvObject(1, "tritolo", "\n Hai trovato un pacco di TNT\n");
        tritolo.setAlias(new String[]{"esplosivo", "TNT"});

        AdvObject chiaveInglese24 = new AdvObject(2, "chiave", "\n Hai trovato una chiave inglese\n");
        chiaveInglese24.setAlias(new String[]{"chiaveinglese"});

        AdvObject fiammiferi = new AdvObject(3, "fiammiferi", "\n Hai trovato un pacco di fiammiferi\n");
        fiammiferi.setAlias(new String[]{"fiammiferi", "fiamma"});

        AdvObject cacciavite = new AdvObject(4, "cacciavite", "\n Hai trovato un cacciavite\n");
        cacciavite.setAlias(new String[]{"giravite", "avvitatore"});

        AdvObject piccone = new AdvObject(5, "piccone", "\n Hai trovato un piccone\n");
        piccone.setAlias(new String[]{"piccozza"});
        Stanza1.getObjects().add(piccone);

        AdvObjectContainer cassettaAttrezzi = new AdvObjectContainer(6, "Cassetta", "\n Hai trovato una cassetta degli attrezzi\n");
        cassettaAttrezzi.setAlias(new String[]{"cassetta", "attrezzi"});
        cassettaAttrezzi.setOpenable(true);
        cassettaAttrezzi.setPickupable(false);
        cassettaAttrezzi.setOpen(false);
        Stanza1.getObjects().add(cassettaAttrezzi);
        cassettaAttrezzi.add(tritolo);
        cassettaAttrezzi.add(chiaveInglese24);
        cassettaAttrezzi.add(fiammiferi);
        cassettaAttrezzi.add(cacciavite);

        //impostazione stanza iniziale
        setCurrentRoom(Stanza1);
    }

    /**
     * implementa il metodo nextMove della classe GameDesciption consente di
     * eseguire un comando
     *
     * @param p
     * @return
     */
    @Override
    public String nextMove(ParserOutput p) {
        String Output = null;
        int moveStatus = 0;
        if (p != null && p.getCommand() != null) {

            {

                if (p.getCommand().getType() == CommandType.NORD) {

                    if (getCurrentRoom().getNorth() != null) {

                        if (getCurrentRoom().getNorth().isIsAccessible() == true) {
                            setCurrentRoom(getCurrentRoom().getNorth());
                            moveStatus = 2;
                        } else {
                            moveStatus = -2;
                        }

                    } else {
                        moveStatus = -1;
                    }

                }

                if (p.getCommand().getType() == CommandType.SOUTH) {

                    if (getCurrentRoom().getSouth() != null) {

                        if (getCurrentRoom().getSouth().isIsAccessible() == true) {
                            setCurrentRoom(getCurrentRoom().getSouth());
                            moveStatus = 2;
                        } else {
                            moveStatus = -2;
                        }

                    } else {
                        moveStatus = -1;
                    }
                }

                if (p.getCommand().getType() == CommandType.EAST) {

                    if (getCurrentRoom().getEast() != null) {

                        if (getCurrentRoom().getEast().isIsAccessible() == true) {
                            setCurrentRoom(getCurrentRoom().getEast());
                            moveStatus = 2;
                        } else {
                            moveStatus = -2;
                        }

                    } else {
                        moveStatus = -1;
                    }
                }

                if (p.getCommand().getType() == CommandType.WEST) {

                    if (getCurrentRoom().getWest() != null) {

                        if (getCurrentRoom().getWest().isIsAccessible() == true) {
                            setCurrentRoom(getCurrentRoom().getWest());
                            moveStatus = 2;
                        } else {
                            moveStatus = -2;
                        }

                    } else {
                        moveStatus = -1;
                    }

                    if (getCurrentRoom().getId() == 4) {
                        getRooms().stream().filter(r -> (r.getId() == 3)).forEachOrdered(r -> {
                            r.setIsAccessible(false);
                        });
                    }

                }
            }

            if (moveStatus == 2) {

                Output = ("\n Descrizione: " + getCurrentRoom().getDescription());
            }
            if (moveStatus == -2) {
                Output = ("\n Mi spiace devi risolvere il problema, prova con ciò che hai trovato fin ora!\n");
            }

            if (moveStatus == -1) {
                Output = ("\n Non puoi andare in questa direzione, ci sono molte alternative, scegli quella corretta!\n");
            }

            //comandi di visione stanza
            {
                if (p.getCommand().getType() == CommandType.LOOK_AT) {
                    if (getCurrentRoom().getLook() != null) {
                        Output = (getCurrentRoom().getLook());
                    } else {
                        Output = "\n Non c'è nulla da vedere qui!\n";
                    }
                }
            }

            //comandi di visione inventario
            {

                if (p.getCommand().getType() == CommandType.INVENTORY) {

                    if (!(getInventory().isEmpty())) {
                        Output = (" Nel tuo inventario ci sono: \n");
                        for (AdvObject o : getInventory()) {
                            Output = Output.concat(" -" + o.getName() + "\n");
                        }

                    } else {
                        Output = ("\n Il tuo inventario è vuoto \n");
                    }
                }
            }

            //comandi di presa oggetti
            if (p.getCommand().getType() == CommandType.PICK_UP) {
                if (p.getObject() != null) {
                    if (getInventory().size() < Inventory.getLIMITE()) {

                        if (p.getObject().isPickupable()) {
                            getInventory().add(p.getObject());
                            getCurrentRoom().getObjects().remove(p.getObject());
                            Output = ("\n Hai raccolto: " + p.getObject().getName());
                        } else {
                            Output = ("\n Non puoi raccogliere questo oggetto.");
                        }
                    } else {
                        Output = "\n Lo zaino e' pieno, lascia qualche oggetto";
                    }
                } else {
                    Output = ("\n Non c'è niente da raccogliere qui.");
                }

            }

            if (p.getCommand().getType() == CommandType.DROP) {
                if (p.getInvObject() != null) {
                    getCurrentRoom().getObjects().add(p.getInvObject());

                    Iterator<AdvObject> it = getInventory().iterator();
                    while (it.hasNext()) {
                        AdvObject next = it.next();

                        if (next.getId() == p.getInvObject().getId()) {
                            Output = ("\n Hai lasciato l'oggetto: " + next.getName());
                            it.remove();
                        }

                    }

                } else {
                    Output = "\n Non ho capito che devo fare!!";
                }
            }

            if (p.getCommand().getType() == CommandType.OPEN) {
                if (p.getObject() != null) {
                    if (p.getObject().isOpenable() && p.getObject().isOpen() == false) {
                        if (p.getObject() instanceof AdvObjectContainer) {
                            Output = ("\n Hai aperto: " + p.getObject().getName() + "\n");

                            AdvObjectContainer c = (AdvObjectContainer) p.getObject();
                            if (!c.getList().isEmpty()) {
                                Output = Output.concat(" " + c.getName() + " contiene: \n");
                                Iterator<AdvObject> it = c.getList().iterator();
                                while (it.hasNext()) {
                                    AdvObject next = it.next();
                                    getCurrentRoom().getObjects().add(next);
                                    Output = Output.concat(" -" + next.getName() + "\n");

                                }

                            } else {
                                Output = ("\n" + c.getName() + " è' vuoto/a");
                            }
                            p.getObject().setOpen(true);
                        }

                    } else {
                        Output = ("\n Non puoi aprire questo oggetto.");
                    }
                } else {
                    Output = ("\n Che dovrei aprire??");
                }

            }

            if (p.getCommand().getType() == CommandType.CLOSE) {

                boolean flag;
                Output = "";
                if (p.getObject() != null) {
                    if (p.getObject().isOpenable() && p.getObject().isOpen()) {

                        if (p.getObject() instanceof AdvObjectContainer) {
                            AdvObjectContainer c = (AdvObjectContainer) p.getObject();

                            if (!c.getList().isEmpty()) {

                                Iterator<AdvObject> it = c.getList().iterator();
                                while (it.hasNext()) {

                                    flag = false;
                                    AdvObject next = it.next();

                                    Iterator<AdvObject> obj = getCurrentRoom().getObjects().iterator();
                                    while (obj.hasNext()) {
                                        AdvObject pr = obj.next();
                                        if (pr.getId() == next.getId()) {
                                            obj.remove();
                                            flag = true;
                                        }
                                    }
                                    if (flag == false) {
                                        it.remove();

                                    }

                                }

                                Output = Output.concat("\n Hai chiuso la cassetta!!");
                                p.getObject().setOpen(false);
                            }

                        }

                    } else {
                        Output = "\n Non puoi chiudere questo oggetto!!";
                    }
                } else {
                    Output = "\n Cosa vorresti chiudere?? Spero non l'applicazione!!";
                }
            }

            //comandi per utilizzare un oggetto
            if (p.getCommand().getType() == CommandType.USE) {
                if (p.getInvObject() != null) {
                    if (p.getInvObject().isUsable()) {
                        Output = useLogic(p);
                    } else {
                        Output = ("\n Non puoi utilizzare questo oggetto. Ingegnati per capire come potrebbe esserti utile.");
                    }

                } else {
                    Output = "\n Che dovrei utilizzare?? Non trovo questo oggetto nello zaino!!";
                }
                
                
            }

            //comando enigma stanza 5
            if (p.getCommand().getType() == CommandType.SILENCE) {
                if (getCurrentRoom().getId() == 5) {
                    if (p.getInvObject() == null && p.getObject() == null) {

                        for (Room r : getRooms()) {
                            if (r.getId() == 6) {
                                r.setIsAccessible(true);
                                Output = "\n Complimenti, deduco che tu abbia un QI superiore alla norma, puoi proseguire";
                            }
                        }
                    } else {
                        Output = ("\n La risposta è errata. Ingegnati e non guardare su internet!");
                    }
                } else {
                    Output = "\n Non ho capito che vorresti fare??";
                }
            }

        } else {
            Output = "\n Che dovrei fare?? Prova con un comando diverso!";
        }
        return Output;
    }

    /**
     * implementa la logica del comando USA
     *
     * @param p
     * @return
     */
    public String useLogic(ParserOutput p) {

        String Output = null;
        boolean nullo = true;
        if(p.getObject() != null){
                nullo = false;
            }
        //STANZA 1
        if (getCurrentRoom().getId() == 1) {

            //USA CHIAVE
            
            if (p.getInvObject().getId() == 2 && nullo == true || (nullo == false && p.getInvObject().getId() == 2 && p.getObject().getId() == 0)) {

                for (AdvObject w : getCurrentRoom().getObjects()) {

                    if (w.getId() == 0) {

                        w.setUsable(true);
                        for (Room r : getRooms()) {
                            
                            if (r.getId() == 2) {
                                r.setIsAccessible(true);
                                Output = "\n Hai aggiustato il carrello, ora puoi proseguire";
                            }
                        }
                    }
                }

            } else {

                Output = "\n Mi vuoi far stancare per nulla?";
            }

        }

        //Stanza 2
        if (getCurrentRoom().getId() == 2 ) {

            // usa piccone
            if (p.getInvObject().getId() == 5 && nullo == true || (nullo == false && p.getInvObject().getId() == 5 && p.getObject().getId() == 8)) {
                for (Room r : getRooms()) {
                    if (r.getId() == 3) {
                        r.setIsAccessible(true);
                        Output = "\n Hai distrutto il muro, ora puoi proseguire";
                    }
                }
            } else {
                Output = "\n Cosa stai cercando di fare? Non capisco";
            }

        }

        //stanza 4
        if (getCurrentRoom().getId() == 4) {
            if (p.getInvObject().getId() == 7 && nullo == true || (nullo == false && p.getInvObject().getId() == 7 && p.getObject().getId() == 9)) {
                for (Room r : getRooms()) {
                    if (r.getId() == 3) {
                        r.setIsAccessible(true);
                        Output = "\n Hai aggiustato il binario, ora puoi proseguire!! ";
                    }
                }
            } else {
                Output = "\n Che vorresti fare??";
            }

            //stanza 5
        }
        return Output;

    }

}
