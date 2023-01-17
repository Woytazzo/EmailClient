package com.uchee.controller;

import com.uchee.EmailManager;
import com.uchee.controller.services.LoginService;
import com.uchee.model.EmailAccount;
import com.uchee.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginWindowController extends BaseController {

        @FXML
        private TextField emailAddressField;

        @FXML
        private Label errorLabel;

        @FXML
        private PasswordField passwordField;

        public LoginWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
                super(emailManager, viewFactory, fxmlName);
        }

        @FXML
        void loginButtonAction() {
                System.out.println("CLICK loginButtonAction");
                if(fieldsAreValid()){
                        EmailAccount emailAccount = new EmailAccount(emailAddressField.getText(), passwordField.getText());
                        LoginService loginService = new LoginService(emailAccount, emailManager);
                        EmailLoginResult emailLoginResult = loginService.login();

                        switch (emailLoginResult) {
                                case SUCCESS:
                                        System.out.println("login succesfull " + emailAccount);
                                        return;
                        }
                }

 //               viewFactory.showMainWindow();
 //               Stage stage = (Stage)errorLabel.getScene().getWindow();
//                viewFactory.closeStage(stage);
        }

        private boolean fieldsAreValid() {
                if(emailAddressField.getText().isEmpty()) {
                        errorLabel.setText("Please fill email");
                        return false;
                }
                if(passwordField.getText().isEmpty()) {
                        errorLabel.setText("Please fill password");
                        return false;
                }
                return true;
        }


}
