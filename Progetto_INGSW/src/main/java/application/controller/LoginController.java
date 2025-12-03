package application.controller;

import application.SceneHandler;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField userField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField passwordVisibleField;

    @FXML
    private FontAwesomeIcon toggleIconPassword;

    @FXML
    private void loginClicked() throws IOException {
        String username = userField.getText();
        String password = passwordField.getText();

        /*
            logica di autenticazione
         */
        
        SceneHandler.getInstance().setProfessorHomePage("prof1");
    }

    public void initialize() {
        userField.requestFocus();
    }


    public void togglePasswordVisibility(MouseEvent mouseEvent) {
        if (passwordField.isVisible()) {
            passwordField.setVisible(false);
            passwordVisibleField.setVisible(true);
            passwordVisibleField.setText(passwordField.getText());
            toggleIconPassword.setIconName("EYE_SLASH");
        } else {
            passwordField.setVisible(true);
            passwordVisibleField.setVisible(false);
            passwordField.setText(passwordVisibleField.getText());
            toggleIconPassword.setIconName("EYE");
        }
    }
}
