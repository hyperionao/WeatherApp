module hyperionao.weatherappgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens hyperionao.weatherappgui to javafx.fxml;
    exports hyperionao.weatherappgui;
}