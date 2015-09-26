package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class CentralControl extends Application {
	@Override
	public void start(Stage primaryStage) {

			GridPane grid = new GridPane();
			Scene scene = new Scene(grid,800,600);
			grid.setId("pane");
			
			//Text which displays the connection status of BBB
			Text connectionStatus = new Text();
			grid.add(connectionStatus, 6, 0);
			connectionStatus.setText("Disconnected");
			connectionStatus.setFill(Color.RED);
			
			//Buttons
			Button connectButton = new Button();
			connectButton.setText("Connect");
			
			connectButton.setOnAction(new EventHandler<ActionEvent>(){
				
			@Override
				public void handle(ActionEvent e){
					System.out.println("do something");
				}
			});
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
	}

	
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
