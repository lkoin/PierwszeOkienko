package pl.gornik.pierwszeokienko;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.net.*;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button buttonShow;

    @FXML
    private Button buttonClose;

    @FXML
    private Label labelInfo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        buttonClose.setOnAction(event -> Platform.exit());
          buttonShow.setOnAction(event -> {
              labelInfo.setText("Twoj adres ip: "+ getIpAddress ());
          });

    }

    public void closeApp() {
        Platform.exit();
    }



    public String getIpAddress() {
//        String urlString = "https://ipv4.icanhazip.com/";
//        URL url = new URL(urlString).toURL;
        return "192.186.19.29";
    }
}
