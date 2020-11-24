package com.syntax.class29;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class GUIAppPart2 extends Application {

    public static void main(String[] args) {

        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button=new Button("Click Me");
        VBox vBoxlayout=new VBox();
        //StackPane vBoxlayout=new StackPane();
        vBoxlayout.getChildren().add(button);
        Scene scene=new Scene(vBoxlayout,600,600);
        primaryStage.setTitle("Next Billion Dollar App");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
