module pl.gornik.pierwszeokienko {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.gornik.pierwszeokienko to javafx.fxml;
    exports pl.gornik.pierwszeokienko;
}