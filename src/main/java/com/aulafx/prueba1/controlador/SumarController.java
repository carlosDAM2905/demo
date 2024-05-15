package com.aulafx.prueba1.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumarController {

    // declarar los elementos de la vista que van a jugar un papelen la aplicación
    @FXML
    private Label lblResultado;
    @FXML
    private TextField txtOperador1;
    @FXML
    private TextField txtOperador2;
    @FXML
    private Button btnSumar;


    @FXML
    protected void sumar(ActionEvent actionEvent) {
        int operador1 = Integer.parseInt(txtOperador1.getText());

        int operador2 = Integer.parseInt(txtOperador2.getText());

        int suma = operador1 + operador2;
        // quiero que esta suma la muestre la etiqueta resultado

        lblResultado.setText(String.valueOf(suma));
    }
}