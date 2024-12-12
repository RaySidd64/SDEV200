package chapter_thirty_four;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Module_6_assign_1 extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        Parent root =
                FXMLLoader.load(getClass().getResource("Problem1UI.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Problem1");
        stage.show();
    }
}