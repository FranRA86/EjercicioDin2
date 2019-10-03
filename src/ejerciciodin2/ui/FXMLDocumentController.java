/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodin2.ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author 2dam
 */
public class FXMLDocumentController {
    
    @FXML
    private Label labelcuenta;
    
    @FXML
    private Label lblnombre;
    
    @FXML
    private Label lbldni;
    
    @FXML
    private Label lblsaldo;
    
    @FXML
    private ComboBox cbcuenta;
    
    @FXML
    private Button btnsalir;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    public void initialize(){
        //Los campos de dni y nombreUsuario aparecerán con el nombre y apellidos del usuario.
        
        //El comboBox de NºCuenta aparecerá con las cuentas del usuario cargadas
        
        //La tabla no mostrara dato alguno de ninguna cuenta.
        
        //El campo de saldo no mostrara ningún dato.
        
        //El botón salir está habilitado.
        
        //El foco está en el comboBox de NºCuenta.
    }
    
     
    
}
