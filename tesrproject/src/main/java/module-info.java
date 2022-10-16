module com.mycompany.tesrproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tesrproject to javafx.fxml;
    exports com.mycompany.tesrproject;
}
