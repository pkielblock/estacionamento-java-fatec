/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class MenuController implements Initializable {

    @FXML
    private AnchorPane menuPane;
    @FXML
    private VBox hboxBotoes1;
    @FXML
    private Button btnCadastroCarro;
    @FXML
    private Button btnCadastroCliente;
    @FXML
    private Button btnCadastroVaga;
    @FXML
    private VBox hboxBotoes2;
    @FXML
    private Button btnConsulta;
    @FXML
    private Button btnSair;
    @FXML
    private Label lblTitulo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnCadastroCarro_Click(ActionEvent event) {
    }

    @FXML
    private void btnCadastroCliente_Click(ActionEvent event) {
    }

    @FXML
    private void btnCadastroVaga_Click(ActionEvent event) {
    }

    @FXML
    private void btnConsulta_Click(ActionEvent event) {           
    }

    @FXML
    private void btnSair_Click(ActionEvent event) {
    }

}
