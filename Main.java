package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.fxml.Initializable;

public class Main implements Initializable {
	@FXML
	private Button btn1;
	@FXML
	private ImageView profile;
	@FXML
	private Button gg;
    @FXML 
    private ImageView Deck;
    
	public void initialize(URL location, ResourceBundle resources) {
		btn1.setOnAction(e -> btn1Action(e));
		gg.setOnAction(e -> ggAction(e));
		Deck.setOnMouseClicked(e -> dpush(e));
		
	
	}

	public void dpush(MouseEvent e) {
		System.out.println("play");
	}

	public void btn1Action(ActionEvent event) {
		System.out.println("play");
	}

	public void ggAction(ActionEvent event) {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(gg.getScene().getWindow());
		dialog.setTitle("GG");
		Parent parent = null;
		try {
			parent = FXMLLoader.load(getClass().getResource("gg.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Button Home = (Button) parent.lookup("#try");
		Home.setOnAction(e -> dialog.close());
		Button realgg = (Button) parent.lookup("#gg");
		realgg.setOnAction(e -> dialog.close());
		Scene scene = new Scene(parent);
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();
	}

	public void turn() {
		int i;
		for(i=0;i<10;i++) {
	        System.out.println("Win");
		}
	}
}
