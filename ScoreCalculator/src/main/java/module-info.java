module com.example.scorecalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.scorecalculator to javafx.fxml;
    exports com.example.scorecalculator;
}