package application.controller.prof;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class HomeProfController {

    private String root = "/fxml/prof/";

    @FXML
    private StackPane contentPane;

    @FXML
    public void initialize() {
        loadPage(root + "orarioPane.fxml");
    }


    private void loadPage(String page) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(page));
            contentPane.getChildren().setAll(root); // sostituisce la pagina nello stackpane
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void bt1selected() {
        loadPage(root + "orarioPane.fxml");
    }

    @FXML
    private void bt2selected() {
        loadPage(root + "didatticaPane.fxml");
    }

    @FXML
    private void bt3selected() {
        loadPage(root + "pane3.fxml");
    }

    @FXML
    private void bt4selected() {
        loadPage(root + "pane4.fxml");
    }

}
