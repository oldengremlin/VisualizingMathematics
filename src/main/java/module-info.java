module ua.org.olden.visualizingmathematics {
    requires javafx.controls;
    requires javafx.fxml;

    requires StringNumeric; 
    requires SumeriansBabylon;

    opens ua.org.olden.visualizingmathematics to javafx.fxml;
    exports ua.org.olden.visualizingmathematics;
}
