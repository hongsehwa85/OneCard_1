package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.css.Rule;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class setup extends Application implements Initializable {
	@FXML
	private Button play;
	@FXML
	private Button exit;
	@FXML
	private ChoiceBox users;
	@FXML
	private TextField name;

//	ObservableList<String> People =FXCollections.observableArrayList("일기토","삼국지","개판");
	ObservableList<String> People = FXCollections.observableArrayList("2", "3", "4");

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		play.setOnAction(e -> PlayAction(e));
		exit.setOnAction(e -> ExitAction(e));
		users.setValue("4");
		users.setItems(People);
		name.setText("우주 최강 1조");
	}

	public void PlayAction(ActionEvent event) {

		String username = name.getText();
		String rival = (String) users.getValue();
		int mode = Integer.parseInt(rival);
		System.out.println(username + rival);

		if (mode == 2) {
			try {
				Parent main = FXMLLoader.load(getClass().getResource("two.fxml"));
				Scene scene = new Scene(main);
				Stage primaryStage = (Stage) play.getScene().getWindow();
				primaryStage.setScene(scene);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (mode == 3) {
			try {
				Parent main = FXMLLoader.load(getClass().getResource("three.fxml"));
				Scene scene = new Scene(main);
				Stage primaryStage = (Stage) play.getScene().getWindow();
				primaryStage.setScene(scene);
			} catch (Exception e) {
				e.printStackTrace();
		}

		} else {
			try {
				Parent main = FXMLLoader.load(getClass().getResource("four.fxml"));
				Scene scene = new Scene(main);
				Stage primaryStage = (Stage) play.getScene().getWindow();
				primaryStage.setScene(scene);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public void ExitAction(ActionEvent event) {
		Platform.exit();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("setup.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("OneCard");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}