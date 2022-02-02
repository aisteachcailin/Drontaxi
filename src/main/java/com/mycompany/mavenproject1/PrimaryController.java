package com.mycompany.mavenproject1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class PrimaryController {

    
    @FXML
    private void switchToSecondary() throws IOException {
        Node n1 = App.getRoot().lookup("#user");
        TextField usernameField = (TextField) n1;
        
        Node n2 = App.getRoot().lookup("#pass");
        PasswordField passwordField = (PasswordField) n2;
        
        System.out.println("Username: " + usernameField.getText());
        System.out.println("Password: " + passwordField.getText());

        String username = usernameField.getText();
        String password = passwordField.getText();
        
        Label access = (Label) App.getRoot().lookup("#access");


         if ((usernameField.getText().equals("anastasia")) 
                 && (passwordField.getText().equals("123"))) {
             
                access.setText("");
                
                App.setRoot("secondary");
            } else {
                access.setText("ACCESS DENIED");
                System.out.println("ACCESS DENIED");
            }
        }
    } 
