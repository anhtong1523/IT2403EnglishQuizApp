package com.anhtong.quizappv1;

import javafx.event.ActionEvent;
import com.anhtong.utils.MyAlert;
import com.anhtong.utils.themes.ThemeTypes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable {
    @FXML private ComboBox<ThemeTypes> cbThemes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
    
    public void manageQuestions(ActionEvent e){
        MyAlert.getInstance().showAlert("Comming soon...");
    }
    
    public void practice(ActionEvent e){
        MyAlert.getInstance().showAlert("Comming soon...");
    }
    
    public void exam(ActionEvent e){
        MyAlert.getInstance().showAlert("Comming soon...");
    }

    public void changeThemes(ActionEvent e){
        switch (this.cbThemes.getSelectionModel().getSelectedItem()){
            case DARK:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("dark.css").toExternalForm());
                
                break;
            case LIGHT:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("light.css").toExternalForm());
                
                break;
            default:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("styles.css").toExternalForm());
        }
    }
}
