module no.hvl.dat109.stigespill {
    requires javafx.controls;
    requires javafx.fxml;


    opens no.hvl.dat109.stigespill to javafx.fxml;
    exports no.hvl.dat109.stigespill;
}