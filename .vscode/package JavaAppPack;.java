package JavaAppPack;

import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.VBox;
import javafx.stage.Stage;

public class UserInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userName = input.nextString();

        System.out.println("Enter your birthday:");

    }

    public class UserInput extends Application {
        @Override
        public void start(Stage primaryStage) {
            Button btSI = new Button("Sign In");
            Scene scene = new Scene(btSI, 200, 250);
            primaryStage.setTitle("COT: Chronically On Time");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public static void main(String[] args) {
            Application.launch(args);
        }
    }
}
