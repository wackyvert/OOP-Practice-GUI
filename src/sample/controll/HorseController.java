package sample.controll;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.animalClasses.Bird;
import sample.animalClasses.Horse;


import java.util.Optional;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;


public class HorseController {
    public static Horse userHorse;
    public static Bird userBird;
    @FXML
    private AnchorPane rootPane;
    ActionEvent event;

    @FXML
    public void back(ActionEvent event) throws Exception {
        Parent homeScreen = FXMLLoader.load(getClass().getResource("Pick an animal lol.fxml"));
        Scene horseStuff = new Scene(homeScreen);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(horseStuff);
    }
    @FXML
    public void HorseScene(ActionEvent event) throws Exception {

        TextInputDialog nameInput = new TextInputDialog("Sus");
        nameInput.setTitle("Please name your horse");
        nameInput.setHeaderText("What will the horse's name be?");
        nameInput.setContentText("Name the horse! Do it!");
        Optional<String> result = nameInput.showAndWait();
        String horseName = result.get();
        userHorse = new Horse(result.get());
        Parent horseBehavior = FXMLLoader.load(getClass().getResource("horsebehavior.fxml"));
        Scene horseStuff = new Scene(horseBehavior);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(horseStuff);


    }
    @FXML
    public void BirdScene(ActionEvent event) throws Exception{
        TextInputDialog nameInput = new TextInputDialog("Sus");
        nameInput.setTitle("Please name your bird");
        nameInput.setHeaderText("What will the bird's name be?");
        nameInput.setContentText("Name the Bird! Do it!");
        Optional<String> result = nameInput.showAndWait();

        userBird = new Bird(result.get());
        Parent birdBehavior = FXMLLoader.load(getClass().getResource("birdbehavior.fxml"));
        Scene birdStuff = new Scene(birdBehavior);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(birdStuff);
    }
    @FXML
    public void HorseEat(ActionEvent event) throws Exception {
        TextInputDialog nameInput = new TextInputDialog("Sus");
        nameInput.setTitle("Dinner time for "+userHorse.getName()+"!");
        nameInput.setHeaderText("What's for dinner?");
        nameInput.setContentText("Food: ");
        nameInput.setGraphic(new ImageView(this.getClass().getResource("3eb-front.jpg").toString()));
        Optional<String> result = nameInput.showAndWait();
        String food = result.get();
        userHorse.eat(food);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Your horse is done eating");
        alert.setHeaderText("Food Eaten");
        alert.setContentText("I just ate "+food+"!");
        alert.showAndWait();
    }
    @FXML
    public void HorseSleep(ActionEvent event) throws Exception {
        TextInputDialog nameInput = new TextInputDialog("Sus");
        nameInput.setTitle("Sleep");
        nameInput.setHeaderText("Rockaby baby...");
        nameInput.setContentText("Sleep time: (in milliseconds)");
        Optional<String> result = nameInput.showAndWait();
        int sleep = parseInt(result.get());
        userHorse.sleep(sleep);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Your horse is awake!");
        alert.setHeaderText("Good morning!");
        int sleepTime = sleep/1000;
        alert.setContentText("I just slept for "+sleepTime+" seconds!");
        alert.showAndWait();
    }
    @FXML
    public void HorseWalk(ActionEvent event) throws Exception {
        TextInputDialog nameInput = new TextInputDialog("0");
        nameInput.setTitle("Walk");
        nameInput.setHeaderText("Time to go on a walk!");
        nameInput.setContentText("Walk distance: (in meters)");
        Optional<String> result = nameInput.showAndWait();
        double walk = parseDouble(result.get());
        userHorse.walk(walk);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Your horse is done walking");
        alert.setHeaderText("I'm back!");
        alert.setContentText("I just walked "+walk+" meters!");
        alert.showAndWait();
    }
    public void BirdEat(ActionEvent event) throws Exception {
        TextInputDialog nameInput = new TextInputDialog("Sus");
        nameInput.setTitle("Dinner time for "+userBird.getName()+"!");
        nameInput.setHeaderText("What's for dinner?");
        nameInput.setContentText("Food: ");
        Optional<String> result = nameInput.showAndWait();
        String food = result.get();
        userBird.eat(food);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Your horse is done eating");
        alert.setHeaderText("Food Eaten");
        alert.setContentText("I just ate "+food+"!");
        alert.showAndWait();
    }
    @FXML
    public void BirdSleep(ActionEvent event) throws Exception {
        TextInputDialog nameInput = new TextInputDialog("Sus");
        nameInput.setTitle("Sleep");
        nameInput.setHeaderText("Rockaby baby...");
        nameInput.setContentText("Sleep time: (in milliseconds)");
        Optional<String> result = nameInput.showAndWait();
        int sleep = parseInt(result.get());
        userBird.sleep(sleep);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Your horse is awake!");
        alert.setHeaderText("Good morning!");
        int sleepTime = sleep/1000;
        alert.setContentText("I just slept for "+sleepTime+" seconds!");
        alert.showAndWait();
    }
    @FXML
    public void BirdWalk(ActionEvent event) throws Exception {
        TextInputDialog nameInput = new TextInputDialog("0");
        nameInput.setTitle("Walk");
        nameInput.setHeaderText("Time to go on a walk!");
        nameInput.setContentText("Walk distance: (in meters)");
        Optional<String> result = nameInput.showAndWait();
        double walk = parseDouble(result.get());
        userBird.walk(walk);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Your horse is done walking");
        alert.setHeaderText("I'm back!");
        alert.setContentText("I just walked "+walk+" meters!");
        alert.showAndWait();
    }
    @FXML
    public void BirdFly(ActionEvent event) throws Exception {
        TextInputDialog nameInput = new TextInputDialog("0");
        nameInput.setTitle("Fly");
        nameInput.setHeaderText("Time to go on a fly!");
        nameInput.setContentText("Fly distance: (in meters)");
        Optional<String> result = nameInput.showAndWait();
        double fly = 0;
        try {
            fly = parseDouble(result.get());
            userBird.fly(fly);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Your bird is done flying!");
            alert.setHeaderText("I'm back!");
            alert.setContentText("I just flew "+fly+" meters!");
            alert.showAndWait();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("NumberFormatException");
            alert.setContentText("Enter a number, you bone head! \" "+result.get()+"\" is not a number!");
            alert.showAndWait();
        }

    }
}
