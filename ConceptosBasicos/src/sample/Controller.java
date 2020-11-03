package sample;

import Converciones.Conversion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML TextField txtEdad;
    @FXML Label lblTitulo;

    public void evento1(ActionEvent event){
        Conversion conversion=new Conversion();
        int numero=Integer.parseInt(txtEdad.getText());
        lblTitulo.setText(conversion.binario(numero));
    }

}
