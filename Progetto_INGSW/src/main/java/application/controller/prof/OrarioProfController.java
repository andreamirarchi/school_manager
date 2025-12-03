package application.controller.prof;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class OrarioProfController {

    // Mappa dei giorni → colonna nella GridPane
    private final java.util.Map<String, Integer> giorniColonne = java.util.Map.of(
            "LUNEDI", 1,
            "MARTEDI", 2,
            "MERCOLEDI", 3,
            "GIOVEDI", 4,
            "VENERDI", 5,
            "SABATO", 6
    );

    public AnchorPane calendarPane;

    @FXML
    private GridPane orarioGrid;

    @FXML
    public void initialize() {
        // 🔥 Test di inserimento (puoi rimuoverlo quando vuoi)
        setLesson("LUNEDI", 1, "1A");
        setLesson("MERCOLEDI", 3, "3B");
        setLesson("VENERDI", 5, "2A");

    }

    /**
     * Inserisce una lezione nella tabella.
     *
     * @param giorno   es: "LUNEDI", "MARTEDI" ...
     * @param oraIndex l'indice della riga (1 = prima ora, 2 = seconda ora...)
     * @param testo    testo da inserire (classe / materia)
     */
    public void setLesson(String giorno, int oraIndex, String testo) {

        // Recupera colonna corrispondente al giorno
        Integer col = giorniColonne.get(giorno.toUpperCase());
        if (col == null) {
            System.out.println("❌ Giorno non valido: " + giorno);
            return;
        }

        // Crea la label della lezione
        Label lezione = new Label(testo);
        lezione.getStyleClass().addAll("orario-cell", "orario-lesson");
        lezione.setMaxWidth(Double.MAX_VALUE);
        GridPane.setFillWidth(lezione, true);

        // Inserisci la label nel GridPane
        orarioGrid.add(lezione, col, oraIndex);
    }
}
