
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;

public class FlagMaker {

	public static FlagClass Sweden() {
		FlagClass flagga = new FlagClass();
		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.BLUE);

		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(300);
		hStripe.setHeight(40);
		hStripe.setTranslateY(80);
		hStripe.setFill(Color.YELLOW);

		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(40);
		vStripe.setHeight(200);
		vStripe.setTranslateX(80);
		vStripe.setFill(Color.YELLOW);

		flagga.getChildren().addAll(bg, vStripe, hStripe);

		return flagga;

	}

	public static FlagClass Denmark() {
		FlagClass flagga = new FlagClass();
		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.RED);

		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(300);
		hStripe.setHeight(40);
		hStripe.setTranslateY(80);
		hStripe.setFill(Color.WHITE);

		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(40);
		vStripe.setHeight(200);
		vStripe.setTranslateX(80);
		vStripe.setFill(Color.WHITE);

		flagga.getChildren().addAll(bg, vStripe, hStripe);

		return flagga;
	}

	public static FlagClass Laos() {

		FlagClass flagga = new FlagClass();
		Circle bg = new Circle();
		bg.setRadius(80);
		bg.setTranslateX(250);
		bg.setTranslateY(250);
		bg.setFill(Color.WHITE);
		bg.setRotationAxis(Rotate.X_AXIS);

		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(500);
		hStripe.setHeight(200);
		hStripe.setTranslateY(150);
		hStripe.setFill(Color.DARKORCHID);

		Rectangle aStripe = new Rectangle();
		aStripe.setWidth(500);
		aStripe.setHeight(150);
		aStripe.setTranslateY(350);
		aStripe.setFill(Color.RED);

		Rectangle aStripe1 = new Rectangle();
		aStripe1.setWidth(500);
		aStripe1.setHeight(150);
		aStripe1.setTranslateY(0);
		aStripe1.setFill(Color.RED);

		flagga.getChildren().addAll(hStripe, bg, aStripe, aStripe1);

		return flagga;

	}

	public static FlagClass Finland() {

		FlagClass flagga = new FlagClass();
		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.WHITE);

		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(300);
		hStripe.setHeight(40);
		hStripe.setTranslateY(80);
		hStripe.setFill(Color.BLUE);

		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(40);
		vStripe.setHeight(200);
		vStripe.setTranslateX(80);
		vStripe.setFill(Color.BLUE);

		flagga.getChildren().addAll(bg, vStripe, hStripe);

		return flagga;
	}

	public static FlagClass Japan() {
		FlagClass flagga = new FlagClass();

		Rectangle vStripe = new Rectangle();

		vStripe.setWidth(600);
		vStripe.setHeight(300);
		vStripe.setTranslateX(0);
		vStripe.setFill(Color.WHITE);

		Circle circle = new Circle();

		circle.setCenterX(250f);
		circle.setCenterY(150f);
		circle.setRadius(90.0f);
		circle.setFill(Color.RED);

		Group root = new Group(vStripe, circle);

		Scene scene = new Scene(root, 600, 300, Color.WHITE);

		flagga.getChildren().addAll(vStripe, circle);

		return flagga;

	}

	public static FlagClass Ukraine() {
		FlagClass flagga = new FlagClass();

		Rectangle vStripe = new Rectangle();

		vStripe.setWidth(600);
		vStripe.setHeight(150);
		vStripe.setTranslateX(0);
		vStripe.setFill(Color.BLUE);

		Rectangle vStripe2 = new Rectangle();

		vStripe2.setWidth(600);
		vStripe2.setHeight(150);
		vStripe2.setTranslateY(150);
		vStripe2.setFill(Color.YELLOW);

		Group root = new Group(vStripe, vStripe2);

		Scene scene = new Scene(root, 600, 300, Color.LAVENDER);

		flagga.getChildren().addAll(vStripe, vStripe2);

		return flagga;

	}

	public static FlagClass Switzerland() {
		FlagClass flagga = new FlagClass();

		Rectangle vStripe = new Rectangle();

		vStripe.setWidth(500);
		vStripe.setHeight(500);
		vStripe.setTranslateX(0);
		vStripe.setFill(Color.RED);

		Rectangle vStripe2 = new Rectangle();

		vStripe2.setWidth(300);
		vStripe2.setHeight(100);
		vStripe2.setTranslateX(100);
		vStripe2.setTranslateY(200);
		vStripe2.setFill(Color.WHITE);

		Rectangle hStripe = new Rectangle();

		hStripe.setWidth(100);
		hStripe.setHeight(300);
		hStripe.setTranslateX(200);
		hStripe.setTranslateY(100);
		hStripe.setFill(Color.WHITE);

		Group root = new Group(vStripe, vStripe2, hStripe);

		Scene scene = new Scene(root, 700, 700, Color.LAVENDER);

		flagga.getChildren().addAll(vStripe, vStripe2, hStripe);

		return flagga;

	}

	public static FlagClass Iceland() {
		FlagClass flagga = new FlagClass();
		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.BLUE);

		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(300);
		hStripe.setHeight(40);
		hStripe.setTranslateY(80);
		hStripe.setFill(Color.WHITE);

		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(40);
		vStripe.setHeight(200);
		vStripe.setTranslateX(85);
		vStripe.setFill(Color.WHITE);

		Rectangle hStripe2 = new Rectangle();
		hStripe2.setWidth(300);
		hStripe2.setHeight(30);
		hStripe2.setTranslateY(85);
		hStripe2.setFill(Color.RED);

		Rectangle vStripe2 = new Rectangle();
		vStripe2.setWidth(30);
		vStripe2.setHeight(200);
		vStripe2.setTranslateX(90);
		vStripe2.setFill(Color.RED);

		flagga.getChildren().addAll(bg, vStripe, hStripe, hStripe2, vStripe2);

		return flagga;

	}

	public static FlagClass Norway() {
		FlagClass flagga = new FlagClass();
		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.RED);

		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(300);
		hStripe.setHeight(40);
		hStripe.setTranslateY(80);
		hStripe.setFill(Color.WHITE);

		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(40);
		vStripe.setHeight(200);
		vStripe.setTranslateX(85);
		vStripe.setFill(Color.WHITE);

		Rectangle hStripe2 = new Rectangle();
		hStripe2.setWidth(300);
		hStripe2.setHeight(30);
		hStripe2.setTranslateY(85);
		hStripe2.setFill(Color.BLUE);

		Rectangle vStripe2 = new Rectangle();
		vStripe2.setWidth(30);
		vStripe2.setHeight(200);
		vStripe2.setTranslateX(90);
		vStripe2.setFill(Color.BLUE);

		flagga.getChildren().addAll(bg, vStripe, hStripe, hStripe2, vStripe2);

		return flagga;

	}

	public static FlagClass Indonesia() {
		FlagClass flagga = new FlagClass();

		Rectangle vStripe = new Rectangle();

		vStripe.setWidth(600);
		vStripe.setHeight(150);
		vStripe.setTranslateX(0);
		vStripe.setFill(Color.RED);

		Rectangle vStripe2 = new Rectangle();

		vStripe2.setWidth(600);
		vStripe2.setHeight(150);
		vStripe2.setTranslateY(150);
		vStripe2.setFill(Color.WHITE);

		Group root = new Group(vStripe, vStripe2);

		Scene scene = new Scene(root, 600, 300, Color.LAVENDER);

		flagga.getChildren().addAll(vStripe, vStripe2);

		return flagga;

	}

	public static FlagClass Russia() {
		FlagClass flagga = new FlagClass();

		Rectangle vStripe = new Rectangle();

		vStripe.setWidth(600);
		vStripe.setHeight(100);
		vStripe.setTranslateX(0);
		vStripe.setFill(Color.WHITE);

		Rectangle vStripe2 = new Rectangle();

		vStripe2.setWidth(600);
		vStripe2.setHeight(100);
		vStripe2.setTranslateY(100);
		vStripe2.setFill(Color.BLUE);

		Rectangle vStripe3 = new Rectangle();

		vStripe3.setWidth(600);
		vStripe3.setHeight(100);
		vStripe3.setTranslateY(200);
		vStripe3.setFill(Color.RED);

		Group root = new Group(vStripe, vStripe2, vStripe3);

		Scene scene = new Scene(root, 600, 300, Color.LAVENDER);

		flagga.getChildren().addAll(vStripe, vStripe2, vStripe3);

		return flagga;

	}
	
	public static FlagClass Netherlands() {
		FlagClass flagga = new FlagClass();

		Rectangle vStripe = new Rectangle();

		vStripe.setWidth(600);
		vStripe.setHeight(100);
		vStripe.setTranslateX(0);
		vStripe.setFill(Color.DARKRED);

		Rectangle vStripe2 = new Rectangle();

		vStripe2.setWidth(600);
		vStripe2.setHeight(100);
		vStripe2.setTranslateY(100);
		vStripe2.setFill(Color.WHITE);

		Rectangle vStripe3 = new Rectangle();

		vStripe3.setWidth(600);
		vStripe3.setHeight(100);
		vStripe3.setTranslateY(200);
		vStripe3.setFill(Color.BLUE);

		Group root = new Group(vStripe, vStripe2, vStripe3);

		Scene scene = new Scene(root, 600, 300, Color.LAVENDER);

		flagga.getChildren().addAll(vStripe, vStripe2, vStripe3);

		return flagga;

	}
	
	public static FlagClass Poland() {
		FlagClass flagga = new FlagClass();

		Rectangle vStripe = new Rectangle();

		vStripe.setWidth(600);
		vStripe.setHeight(150);
		vStripe.setTranslateX(0);
		vStripe.setFill(Color.WHITE);

		Rectangle vStripe2 = new Rectangle();

		vStripe2.setWidth(600);
		vStripe2.setHeight(150);
		vStripe2.setTranslateY(150);
		vStripe2.setFill(Color.RED);

		Group root = new Group(vStripe, vStripe2);

		Scene scene = new Scene(root, 600, 300, Color.LAVENDER);

		flagga.getChildren().addAll(vStripe, vStripe2);

		return flagga;

	}
	
	public static FlagClass Hungary() {
		FlagClass flagga = new FlagClass();

		Rectangle vStripe = new Rectangle();

		vStripe.setWidth(600);
		vStripe.setHeight(100);
		vStripe.setTranslateX(0);
		vStripe.setFill(Color.DARKRED);

		Rectangle vStripe2 = new Rectangle();

		vStripe2.setWidth(600);
		vStripe2.setHeight(100);
		vStripe2.setTranslateY(100);
		vStripe2.setFill(Color.WHITE);

		Rectangle vStripe3 = new Rectangle();

		vStripe3.setWidth(600);
		vStripe3.setHeight(100);
		vStripe3.setTranslateY(200);
		vStripe3.setFill(Color.DARKGREEN);

		Group root = new Group(vStripe, vStripe2, vStripe3);

		Scene scene = new Scene(root, 600, 300, Color.LAVENDER);

		flagga.getChildren().addAll(vStripe, vStripe2, vStripe3);

		return flagga;

	}

	public static FlagClass Estonia() {
		FlagClass flagga = new FlagClass();

		Rectangle vStripe = new Rectangle();

		vStripe.setWidth(600);
		vStripe.setHeight(100);
		vStripe.setTranslateX(0);
		vStripe.setFill(Color.MIDNIGHTBLUE);

		Rectangle vStripe2 = new Rectangle();

		vStripe2.setWidth(600);
		vStripe2.setHeight(100);
		vStripe2.setTranslateY(100);
		vStripe2.setFill(Color.BLACK);

		Rectangle vStripe3 = new Rectangle();

		vStripe3.setWidth(600);
		vStripe3.setHeight(100);
		vStripe3.setTranslateY(200);
		vStripe3.setFill(Color.WHITE);

		Group root = new Group(vStripe, vStripe2, vStripe3);

		Scene scene = new Scene(root, 600, 300, Color.LAVENDER);

		flagga.getChildren().addAll(vStripe, vStripe2, vStripe3);

		return flagga;

	}
	
	public static FlagClass Lithuania() {
		FlagClass flagga = new FlagClass();

		Rectangle vStripe = new Rectangle();

		vStripe.setWidth(600);
		vStripe.setHeight(100);
		vStripe.setTranslateX(0);
		vStripe.setFill(Color.YELLOW);

		Rectangle vStripe2 = new Rectangle();

		vStripe2.setWidth(600);
		vStripe2.setHeight(100);
		vStripe2.setTranslateY(100);
		vStripe2.setFill(Color.GREEN);

		Rectangle vStripe3 = new Rectangle();

		vStripe3.setWidth(600);
		vStripe3.setHeight(100);
		vStripe3.setTranslateY(200);
		vStripe3.setFill(Color.RED);

		Group root = new Group(vStripe, vStripe2, vStripe3);

		Scene scene = new Scene(root, 600, 300, Color.LAVENDER);

		flagga.getChildren().addAll(vStripe, vStripe2, vStripe3);

		return flagga;

	}
	
	public static FlagClass Quwait() {
		FlagClass flagga = new FlagClass();

		Rectangle vStripe = new Rectangle();

		vStripe.setWidth(600);
		vStripe.setHeight(113);
		vStripe.setTranslateX(0);
		vStripe.setFill(Color.GREEN);
		
		Rectangle vStripe2 = new Rectangle();

		vStripe2.setWidth(600);
		vStripe2.setHeight(72);
		vStripe2.setTranslateY(113);
		vStripe2.setFill(Color.WHITE);
		
		Rectangle vStripe3 = new Rectangle();

		vStripe3.setWidth(600);
		vStripe3.setHeight(113);
		vStripe3.setTranslateY(185);
		vStripe3.setFill(Color.RED);
		
		Polygon poly = new Polygon(0, 0, // x1, y1
				0, 300, // x2 , y2
				200, 185, // x3 , y3
				200, 113); // x4 , y4
		poly.setFill(Color.BLACK);
		

		Group root = new Group(vStripe, vStripe2, vStripe3, poly);

		Scene scene = new Scene(root, 600, 300, Color.WHITE);

		flagga.getChildren().addAll(vStripe, vStripe2, vStripe3, poly);

		return flagga;

	}
	
	public static FlagClass Greenland() {
		FlagClass flagga = new FlagClass();

		Rectangle vStripe = new Rectangle();

		vStripe.setWidth(600);
		vStripe.setHeight(150);
		vStripe.setTranslateX(0);
		vStripe.setFill(Color.WHITE);
		
		Rectangle vStripe2 = new Rectangle();

		vStripe2.setWidth(600);
		vStripe2.setHeight(150);
		vStripe2.setTranslateY(150);
		vStripe2.setFill(Color.RED);
		
		Circle circle2 = new Circle();

		circle2.setCenterX(200f);
		circle2.setCenterY(150f);
		circle2.setRadius(90.0f);
		circle2.setFill(Color.WHITE);
		
		Arc arc = new Arc();
		arc.setCenterX(200.0f);
		arc.setCenterY(150.0f);
		arc.setRadiusX(90.0f);
		arc.setRadiusY(90.0f);
		arc.setStartAngle(0f);
		arc.setLength(180.0f);
		arc.setType(ArcType.ROUND);
		arc.setFill(Color.RED);

		Group root = new Group(vStripe, vStripe2, circle2, arc);

		Scene scene = new Scene(root, 600, 300, Color.WHITE);

		flagga.getChildren().addAll(vStripe, vStripe2, circle2, arc);

		return flagga;

	}
	
	public static FlagClass Congo() {
		FlagClass flagga = new FlagClass();

		Rectangle vStripe = new Rectangle();

		vStripe.setWidth(600);
		vStripe.setHeight(300);
		vStripe.setTranslateX(0);
		vStripe.setFill(Color.YELLOW);
		
		Polygon poly = new Polygon(0, 0,
				0, 300,
				400, 0);
		
		poly.setFill(Color.GREEN);
		
		Polygon poly2 = new Polygon(600, 300,
				600, 0,
				200, 300);
		
		poly2.setFill(Color.RED);
		
		Group root = new Group(vStripe, poly, poly2);

		Scene scene = new Scene(root, 600, 300, Color.WHITE);

		flagga.getChildren().addAll(vStripe, poly, poly2);

		return flagga;

	}
	
}