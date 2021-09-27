/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.app2;

import javafx.geometry.Insets;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class JavaFXApp2 implements EventHandler {
   @Override
    public void start(Stage primaryStage) {
        // Texto de la parte superior de la ventana
        primaryStage.setTitle("JavaFX Welcome");
        
        // Creamos la cuadricula sobre la que trabajaremos, y le damos un estilo.
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Creamos la escena y añadimos los label y los fields, sobre los que podremos escribir.
        Scene escena = new Scene(grid, 400, 350);
        primaryStage.setScene(escena);
        
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 25));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        
        // Añadimos el boton de inicio sesion.
        Button boton = new Button("Sing in");
        HBox hboxBoton = new HBox(10);
        hboxBoton.setAlignment(Pos.BOTTOM_RIGHT);
        hboxBoton.getChildren().add(boton);
        grid.add(hboxBoton, 1, 4);
        
        // Mostramos mensaje al pulsar el boton
        final Text actiontarget = new Text();
        grid.add(actiontarget,1 ,6);
        
        boton.setOnAction(new EventHandler<ActionEvent>()
        {
           @Override
           public void handle(ActionEvent evento)
           {
               actiontarget.setFill (Color.FIREBRICK);
               actiontarget.setText ("Boton de inicio sesion presionado");
           }
        });
        
        primaryStage.show();
    }

  
    public static void main(String[] args) {
        launch(args);
    }
    
}
