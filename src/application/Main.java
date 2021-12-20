package application;
 
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Main extends Application {
 
 @Override
 public void start(Stage primaryStage) throws Exception {
  Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));
  Scene scene = new Scene(root);
  primaryStage.setTitle("OneCard");
  primaryStage.setScene(scene);
  primaryStage.show();
 }
 
 public static void main(String[] args) {
  launch(args);
 }
}