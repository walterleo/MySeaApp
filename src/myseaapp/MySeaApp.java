/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myseaapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Walter
 */
public class MySeaApp extends Application {
    
    private ImageView sea0;
    private Rectangle sea0Clip;
    
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        
        sea0 = new ImageView(new Image(MySeaApp.class.getResourceAsStream("images/image1.jpg")));
        sea0Clip = new Rectangle(600, 420);
        sea0Clip.setArcHeight(20);
        sea0Clip.setArcWidth(60);
        
        sea0.setClip(sea0Clip);
        
        Pane root = new Pane();
        root.getChildren().add(sea0);
        
        
        
        Scene scene = new Scene(root, 300, 250);
         
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
