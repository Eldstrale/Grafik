import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FlagApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();
		Scene scene = new Scene(root, 600, 600, Color.LAVENDER);
		primaryStage.setScene(scene);
		primaryStage.show();
		
//      root.getChildren().add(FlagMaker.Sweden());
//		root.getChildren().add(FlagMaker.Denmark());
//		root.getChildren().add(FlagMaker.Laos());
//		root.getChildren().add(FlagMaker.Finland());
//		root.getChildren().add(FlagMaker.Japan());
//		root.getChildren().add(FlagMaker.Ukraine());
//		root.getChildren().add(FlagMaker.Switzerland());
//		root.getChildren().add(FlagMaker.Iceland());
//		root.getChildren().add(FlagMaker.Norway());
//		root.getChildren().add(FlagMaker.Indonesia());
//		root.getChildren().add(FlagMaker.Russia());
//		root.getChildren().add(FlagMaker.Netherlands());
//		root.getChildren().add(FlagMaker.Poland());
//		root.getChildren().add(FlagMaker.Hungary());
//		root.getChildren().add(FlagMaker.Estonia());
//		root.getChildren().add(FlagMaker.Lithuania());
//		root.getChildren().add(FlagMaker.Quwait());
//		root.getChildren().add(FlagMaker.Greenland());
//		root.getChildren().add(FlagMaker.Congo());
	}

	public static void main(String[] args) {
		launch();
	}

}