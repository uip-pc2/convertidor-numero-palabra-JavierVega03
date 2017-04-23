<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.Menu?>
<?import javafx.scene.control.MenuBar?>
<?import javafx.scene.control.MenuItem?>
<?import javafx.scene.control.TextArea?>
<?import javafx.scene.layout.BorderPane?>
<?import javafx.scene.layout.ColumnConstraints?>
<?import javafx.scene.layout.GridPane?>
<?import javafx.scene.layout.HBox?>
<?import javafx.scene.layout.RowConstraints?>
<?import javafx.scene.layout.VBox?>

<GridPane alignment="center" hgap="10" vgap="10" xmlns="http://javafx.com/javafx/8.0.121" xmlns:fx="http://javafx.com/fxml/1" fx:controller="convertidoLetra.Letra">
    <children>
        <BorderPane prefHeight="200.0" prefWidth="300.0">
            <top>
                <MenuBar BorderPane.alignment="CENTER">
                    <menus>
                        <Menu mnemonicParsing="false" text="          CONVERTIDOR DE NUMERO A LETRA">
                            <items>
                                <MenuItem mnemonicParsing="false" onAction="#salir" text="Salir" />
                            </items>
                        </Menu>
                    </menus>
                </MenuBar>
            </top>
            <center>
                <VBox alignment="CENTER" prefHeight="200.0" prefWidth="100.0" BorderPane.alignment="CENTER">
                    <children>
                  <Label alignment="CENTER" contentDisplay="RIGHT" prefHeight="17.0" prefWidth="275.0" text="Numero Introducido:" />
                  <HBox alignment="CENTER" prefHeight="50.0" prefWidth="200.0">
                     <children>
                        <TextArea fx:id="numero_en_letras" editable="false" onInputMethodTextChanged="#mostrar" onKeyPressed="#mostrar" onKeyReleased="#mostrar" onKeyTyped="#mostrar" prefHeight="50.0" prefWidth="251.0" promptText="...Numero en letras..." />
                     </children>
                        </HBox>
                  <HBox alignment="CENTER" prefHeight="50.0" prefWidth="200.0">
                     <children>
                                <Button fx:id="bt_anterior" alignment="TOP_CENTER" mnemonicParsing="false" onAction="#cargarPrincipal" prefHeight="25.0" prefWidth="63.0" text="Anterior" />
                        <Button fx:id="bt_mostrar" alignment="TOP_CENTER" mnemonicParsing="false" onAction="#mostrar" prefHeight="25.0" prefWidth="63.0" text="Mostrar" />
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
