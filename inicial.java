package convertidorLetra;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Inicial {


    @FXML
    public void num(ActionEvent actionEvent) {

    }
    @FXML
    public void limpiar(ActionEvent actionEvent) {
        numero_ingresado.setText("");
    }

    @FXML
    Button btn_convertir;

    @FXML
    public TextField numero_ingresado;

    @FXML
    public void convertir(ActionEvent actionEvent) {
        double numbe = Double.parseDouble(numero_ingresado.getText());
        int nu = (int) numbe;
        Letra conver = new Letra();
        conver.setRecibir(nu);


        Stage stage = (Stage) btn_convertir.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("letra.fxml"));

        Parent root = null;
        try {
            root = fxmlLoader.load();
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("se detecto un error");
            alerta.setHeaderText("ups!...");
            alerta.showAndWait();
            Platform.exit();
        }
        FadeTransition ft = new FadeTransition(Duration.millis(1500), root);
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        ft.play();
        Letra controller = fxmlLoader.<Letra>getController();
        controller.setRecibir(nu);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    public void exit(ActionEvent actionEvent) {Platform.exit();
    }

}


