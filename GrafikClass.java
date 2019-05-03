import com.sun.org.apache.xalan.internal.xsltc.cmdline.getopt.GetOpt;
import com.sun.org.apache.xpath.internal.operations.Gt;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import jdk.nashorn.internal.objects.annotations.Getter;
import javafx.scene.shape.Circle;

public class GrafikClass<get> extends Application {
	@Override
	public void start(Stage stage) {

		Circle circle = new Circle();

		circle.setCenterX(300.0f);
		circle.setCenterY(135.0f);
		circle.setRadius(100.0f);
		circle.setFill(Color.RED);

		Group root = new Group(circle);

		Scene scene = new Scene(root, 600, 300, Color.WHITE);

		stage.setTitle("Japan");

		stage.setScene(scene);

		stage.show();
	} 

	public static void main(String args[]) {
		launch(args);
	}
}