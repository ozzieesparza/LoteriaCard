package replit;

//IMPORTED PACKAGES
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;              //class for specific view in GUI window
import javafx.scene.layout.VBox;        //class for layout pane, organized top-to-bottom
import javafx.scene.control.Label;      //class for label component
import javafx.scene.control.Button;     //class for button component
import javafx.geometry.Pos;
import javafx.event.EventHandler;       //interface for handling events
import javafx.event.ActionEvent;        //class for type of event for action (like button or key pressed)
import javafx.scene.image.ImageView;

public class Main extends Application implements EventHandler<ActionEvent> {
	//CONSTANTS
    private static final LoteriaCard[] LOTERIA_CARDS = {
			new LoteriaCard("EChALE STEM","0.png",0),
            new LoteriaCard("Las matematicas", "1.png", 1),
            new LoteriaCard("Las ciencias", "2.png", 2),
            new LoteriaCard("La Tecnología", "8.png", 8),
            new LoteriaCard("La ingeniería", "9.png", 9),
    };

	//CLASS-LEVEL VARIABLES
	

	/*** GUI COMPONENTS ***/
  	private Button button;
	//private ImageView image;  
	private int count = 0;
	//private Image image;

	//GUI METHODS
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
	//SETUP COMPONENTS
	Label message = new Label("Welcome to EChALE STEM Loteria!");
    /*
	*/
	
	
	
	button = new Button("Draw Random Card"); //or can set text using setText method separately
  	button.setOnAction(this); //who the event handler is (which object/class should handle the event)
	

	//ADD COMPONENTS
	ImageView imageView = new ImageView();
	//Set the dimensions
	imageView.setFitHeight(400); 
  	imageView.setFitWidth(350); 
	imageView.setImage(LOTERIA_CARDS[0].getImage());
  
	////setting the fit height and width of the image view 
    

	//LOTERIA_CARDS[2].getImage()
	VBox layout = new VBox();
	layout.getChildren().add(message);
    layout.getChildren().add(imageView);
	layout.getChildren().add(button);
	layout.setAlignment(Pos.CENTER);

 	//SETUP SCENE AND SHOW
    Scene scene = new Scene(layout, 350, 500); //layout,dimensions of window 
	
	primaryStage.setScene(scene);
    primaryStage.setTitle("EChALE STEM Loteria"); //setting title of main window
    primaryStage.show();
    }

	@Override
  	public void handle(ActionEvent actionEvent) { //generic method used to handle when events occur (like handle button click)
    //good practice to identify source, in case you have multiple event types/sources
    
	if(actionEvent.getSource() == button) {
      System.out.println("Hello CS 112!");
	  //int rand = (int)(Math.random() * 4) + 1;
	  //imageView.setImage(LOTERIA_CARDS[rand].getImage());
	  ///
    }
  }


}
