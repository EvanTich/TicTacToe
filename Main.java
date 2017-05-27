import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("tictactoe.fxml"));
        primaryStage.setTitle("TicTacToe");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 192, 228));
        primaryStage.getIcons().add(Controller.xImage);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
