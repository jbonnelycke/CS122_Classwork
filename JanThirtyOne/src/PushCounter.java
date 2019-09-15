import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class PushCounter extends Application {
	private int count;
	private Text countText;
	Stage stage1 = new Stage();
	public void start(Stage stage0) {
		count = 0;
		countText = new Text("Pushes: 0");

		Button push = new Button("Push Me!");
		push.setOnAction(this::processButtonPress);

		FlowPane pane = new FlowPane(push, countText);
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(20);
		pane.setStyle("-fx-background-color: cyan");

		Scene scene = new Scene(pane, 300, 100);

		stage0.setTitle("Push Counter");
		stage0.setScene(scene);
		stage0.show();
	}

	public void processButtonPress(ActionEvent event) {
		count++; // Updates the counter on ButtonPress
		countText.setText("Pushes: " + count);
		stage1.show();
		if (count == 7) 
			stage1.close();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
