package com.uchee.controller;
import com.uchee.EmailManager;
import com.uchee.view.ViewFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.web.WebView;
public class MainWindowController extends BaseController {

        @FXML
        private WebView emailWebView;

        @FXML
        private TableView<?> emailsTableView;

        @FXML
        private TreeView<?> emailsTreeView;

        public MainWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
                super(emailManager, viewFactory, fxmlName);
        }

        @FXML
        void optionsAction() {
                viewFactory.showOptionsWindow();
        }

        @FXML
        void addAccountAction() {
                viewFactory.showLoginWindow();
        }
}
