package com.mycompany.mined_out.game;

/** 
 * Classe di tipo: <b>{@literal <<}Boundary{@literal >>}</b><br>
 * Responsabilità: restituisce l'introduzione e la conclusione del gioco 
 */
public class Dialoghi {

    private static final String INTRODUZIONE = "\n Il tuo aereo precipita per un malfunzionamento in un bosco e ti ritrovi sperduto.\n"
            + " In più si sta facendo notte ed il tempo sta peggiorando, in più non hai alcun rifugio.\n"
            + " Vagando per pochi passi trovi una botola e decidi di entrarci come riparo dalla notte\n quando improvvisamente il vento fortissimo la chiude alla tue spalle.\n"
            + " La tua avventura inizia qui! \n";

    /**
     * restituisce l'introduzione
     *
     * @return introduzione
     */
    public static String getIntroduzione() {
        return INTRODUZIONE;

    }

    private static final String CONCLUSIONE = "\n Finalmente ora sei libero, grazie per aver giocato a Mined_Out!";

    /**
     * restituisce la conclusione
     *
     * @return conclusione
     */
    public static String getConclusione() {
        return CONCLUSIONE;

    }
}
