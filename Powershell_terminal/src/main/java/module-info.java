module com.example.powershell_terminal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.powershell_terminal to javafx.fxml;
    exports com.example.powershell_terminal;
}