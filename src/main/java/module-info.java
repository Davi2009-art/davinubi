module com.mycompany.testenunesjogo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.testenunesjogo to javafx.fxml;
    exports com.mycompany.testenunesjogo;
}
