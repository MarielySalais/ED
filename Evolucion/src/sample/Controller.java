package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import pez.Pez;

public class Controller {
    @FXML
    TextField txtnaci;
    @FXML
    ComboBox<String> cmbi;
    @FXML
    ListView lista;

    String[][] arreglo1=new String[2][10];
    int x=0;

    @FXML
    public void initialize() {
        cmbi.getItems().addAll("Trucha", "Pez payaso","Pez angel","Pez Globo","Pez betta","Pez guppy","Pez dorado","Pez gurami enano","Pez gato","salmon","Atun");
        cmbi.getSelectionModel().select(0);
    }



    public void insertar(ActionEvent event){
        if(x<10){
            arreglo1[0][x]=cmbi.getSelectionModel().getSelectedItem();
            arreglo1[1][x]=txtnaci.getText();
            x++;

        }else {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Arreglo lleno");
            alert.show();
        }

    }
    public void procesar(ActionEvent event){
        lista.getItems().clear();
        for(int y=0;y<x;y++){
            String tip=arreglo1[0][y];
            int can=Integer.parseInt(arreglo1[1][y]);
            Pez m=new Pez(tip,can);
            lista.getItems().add("Pescado "+m.getTipo_pez()+" Nacen "+m.getPor_nacimiento()+" Por cria y "+m.calcular()+" Al año");


        }

    }
}


