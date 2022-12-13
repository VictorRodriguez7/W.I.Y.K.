module home.wiyk {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens home.wiyk to javafx.fxml;
    exports home.wiyk;
}