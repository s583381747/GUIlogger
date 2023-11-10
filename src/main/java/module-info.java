module com.example.guilogger {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.guilogger to javafx.fxml;
    exports com.example.guilogger;
}