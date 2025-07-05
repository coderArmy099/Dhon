package com.example.user;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class HelloController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    public HelloController() {
    }

    @FXML
    protected void onSignInButtonClick() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Basic validation for username and password
        if (username.isEmpty() || password.isEmpty()) {
            showAlert("Error", "Username and Password cannot be empty", AlertType.ERROR);
        } else {
            // Check credentials (You can replace this with actual logic)
            if (username.equals("admin") && password.equals("admin123")) {
                showAlert("Success", "Login successful", AlertType.INFORMATION);
            } else {
                showAlert("Error", "Invalid username or password", AlertType.ERROR);
            }
        }
    }

    private void showAlert(String title, String message, AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}