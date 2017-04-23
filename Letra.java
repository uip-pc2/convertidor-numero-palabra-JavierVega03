package convertidorLetra;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;



/**
     *
     *@author Grimaldo Castro Moreno
     */
    public class Letra {

   public Button bt_anterior;

    @FXML
    public void salir(ActionEvent actionEvent) {
        Platform.exit(); // Para salir del programa
    }



    @FXML
    public Button btn_mostrar;
    @FXML
    public TextArea numero_en_letras;
    @FXML
    public Label mostrarnumero;

   private int recibir;
    private String nombre;
@FXML
    public void setRecibir(int recibir) {
        this.recibir = recibir;
    }


   @FXML
    public void mostrar (ActionEvent actionEvent) {
       Convertidoratexto numer = new Convertidoratexto(recibir);
       String res = numer.convertirLetras(recibir);

       if (res == "") {
           Alert alerta = new Alert(Alert.AlertType.ERROR);
           alerta.setTitle("Error");
           alerta.setHeaderText("ups!");
           alerta.showAndWait();
           Platform.exit();
       } else {
           numero_en_letras.appendText(res);

           }
       }

  // }

       @FXML
       public void cargarPrincipal (ActionEvent actionEvent) throws IOException {
           Stage stage = (Stage) bt_anterior.getScene().getWindow(); // Guarda el Stage actual basado en el boton
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("inicial.fxml")); // Carga el fichero FXML de Principal
           Parent root = (Parent) fxmlLoader.load(); // Carga inicial de la pantalla padre
           Scene scene = new Scene(root); // Establece Scene de la pantalla padre
           stage.setScene(scene); // Monta Scene en Stage
           stage.show(); // Muestra Stage
       }


    }
