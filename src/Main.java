import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
    private Rectangle rectangle1 = new Rectangle();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Text Highlighting");
        Pane root = new Pane();
        Text text = new Text("The little dog jumped over the brown fox!\nNow for some good news fow all men and women, and dogs.");
        text.setLayoutX(5);
        text.setLayoutY(15);
        text.setLineSpacing(2);
        text.setWrappingWidth(600);

        System.out.println(text.getFont() + " " + text.getLayoutBounds().getHeight());

        rectangle1.setHeight(12);
        rectangle1.setWidth(12);
        rectangle1.setLayoutX(5);
        rectangle1.setLayoutY(5);
        rectangle1.setFill(Color.RED);
        rectangle1.setOpacity(.2);
        root.getChildren().addAll(text, rectangle1);

        primaryStage.setScene(new Scene(root, 800, 800));
        primaryStage.show();
    }

}
