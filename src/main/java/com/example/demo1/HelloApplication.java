package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5);
        pane.setVgap(5);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int s = (int )(Math.random()*3);
                if(s==0)
                    pane.add(new ImageView(new Image("C:\\Users\\NADAOMAR\\Desktop\\o.jpeg")),j,i);
                else if (s==1)
                    pane.add(new ImageView(new Image("C:\\Users\\NADAOMAR\\Desktop\\x.jpeg")),j,i);
            }
        }

        Scene scene = new Scene(pane);
        stage.setTitle("Exerise 14_01");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}