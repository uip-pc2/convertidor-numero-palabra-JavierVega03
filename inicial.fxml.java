<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.Menu?>
<?import javafx.scene.control.MenuBar?>
<?import javafx.scene.control.MenuItem?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.layout.BorderPane?>
<?import javafx.scene.layout.ColumnConstraints?>
<?import javafx.scene.layout.GridPane?>
<?import javafx.scene.layout.HBox?>
<?import javafx.scene.layout.RowConstraints?>
<?import javafx.scene.layout.VBox?>

<GridPane alignment="center" hgap="10" vgap="10" xmlns="http://javafx.com/javafx/8.0.121" xmlns:fx="http://javafx.com/fxml/1" fx:controller="numberletterconvert.Inicial">

    <children>
        <BorderPane prefHeight="200.0" prefWidth="300.0">
            <top>
                <MenuBar BorderPane.alignment="CENTER">
                    <menus>
                        <Menu mnemonicParsing="false" text="          CONVERTIDOR DE NUMERO A LETRA">
                            <items>
                                <MenuItem mnemonicParsing="false" onAction="#exit" text="Salir" />
                            </items>
                        </Menu>
                    </menus>
                </MenuBar>
            </top>
            <center>
                <VBox alignment="CENTER" prefHeight="200.0" prefWidth="100.0" BorderPane.alignment="CENTER">
                    <children>
                        <Label alignment="CENTER" contentDisplay="RIGHT" text="Numero:">
                            <graphic>
                                <TextField fx:id="numero_ingresado" promptText="Introduzca un numero..." />
                            </graphic>
                        </Label>
                        <HBox alignment="CENTER" prefHeight="50.0" prefWidth="200.0">
                            <children>
                                <Button fx:id="btn_convertir" mnemonicParsing="false" onAction="#convertir" text="Convertir" />
                                <Button mnemonicParsing="false" onAction="#limpiar" text="Limpiar" />
                            </children>
                        </HBox>
                    </children>
                </VBox>
            </center>
        </BorderPane>
    </children>
    <columnConstraints>
        <ColumnConstraints />
    </columnConstraints>
    <rowConstraints>
        <RowConstraints />
    </rowConstraints>
</GridPane>
