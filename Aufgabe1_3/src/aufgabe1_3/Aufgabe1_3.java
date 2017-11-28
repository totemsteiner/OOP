/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe1_3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

/**
 *
 * @author lk
 */
public class Aufgabe1_3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button();
        btn1.setText("Good Morning");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guten Morgen auf Englisch: Good Morning");
            }
        });
        Button btn2 = new Button();
        btn2.setText("Bonjour");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guten Morgen auf Französisch: Bonjour");
            }
        });
        
        Button btn3 = new Button();
        btn3.setText("Buenos días");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guten Morgen auf Spanisch heißt: "
                        + "Buenos días");
            }
        });
        
        Button btn4 = new Button();
        btn4.setText("Доброе утро");
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guten Morgen auf Russisch: Доброе утро");
            }
        });
        
        
        VBox vbox = new VBox(4);
        vbox.getChildren().add(btn1);
        vbox.getChildren().add(btn2);
        vbox.getChildren().add(btn3);
        vbox.getChildren().add(btn4);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
            
        
        Scene scene = new Scene(vbox, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
