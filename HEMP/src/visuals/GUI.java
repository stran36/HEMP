package visuals;

import calculations.FoodTester;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;

public class GUI extends BorderPane {

	private VBox scene1;
	private VBox scene2;
	private VBox scene3;
	private final int HEIGHT = 500;
	private final int WIDTH = 500;

	// ChoiceBox for "Body Type"
	ChoiceBox<String> choices = new ChoiceBox<>();

	// ChoiceBox for "Choose Your Age!"
	ComboBox<String> ageBox = new ComboBox<String>();

	// Setting for main program window
	public GUI() {
		this.setMaxSize(WIDTH, HEIGHT);
		this.setMinSize(WIDTH, HEIGHT);
		this.getStyleClass().add("body");
		createScene2();
		createScene3();
		setPrimaryScene();
		setMainBackground();
		setTitle();
	}
	

	// Setting for first scene
	public void setPrimaryScene() {
		scene1 = new VBox();
		scene1.getStyleClass().add("boxes");

		// Make horizontal box for each option
		HBox horizontalBox1 = new HBox(8);
		horizontalBox1.getStyleClass().add("boxes");
		HBox horizontalBox2 = new HBox(8);
		horizontalBox2.getStyleClass().add("boxes");
		HBox horizontalBox3 = new HBox(8);
		horizontalBox3.getStyleClass().add("boxes");

		// Label "Body Goal!"
		Label bodyGoal = new Label("Body Goal!");
		bodyGoal.getStyleClass().add("labels");

		// Fill "Body Type" ChoiceBox
		choices.getItems().addAll("Slim", "Healthy", "Body Builder", "Strict Diet");

		// Set action for "Body Type" ChoiceBox or change picture based on body type
		// choice
		HBox bodyTypePictureBox1 = new HBox(8);
		bodyTypePictureBox1.getChildren().clear();
		bodyTypePictureBox1.setPrefHeight(100);

		Group scene1Group1 = new Group();
		scene1Group1.getChildren().addAll(bodyTypePictureBox1);
		
		Image image1 = new Image("http://clipart-library.com/images/qcBobppXi.png");
		ImageView imageView1 = imageViewSetup(image1);

		Image image2 = new Image("https://thumb7.shutterstock.com/display_pic_with_logo/3814334/571041247/stock-vector-body-workout-stretching-exercises-healthy-life-style-concept-stick-figure-pictogram-icon-571041247.jpg");
		ImageView imageView2 = imageViewSetup(image2);

		Image image3 = new Image("http://mariafresa.net/data_gallery/snatch-overhead-squat-weightlifting-olympic-weightlifting-nick-Kjqjgz-clipart.jpg");
		ImageView imageView3 = imageViewSetup(image3);

		Image image4 = new Image("https://cdn3.iconfinder.com/data/icons/vacation-4/32/vacation_29-512.png");
		ImageView imageView4 = imageViewSetup(image4);


		// Picture changes for Body Goal
		choices.setOnAction((event) -> {
			if (choices.getSelectionModel().isSelected(0)) {
				System.out.println("Your body goal is: " + choices.getSelectionModel().getSelectedItem());

				// Show Slim Body Picture
				Node [] arrayNode = {invisibleImage(), imageView1, invisibleImage(), invisibleImage()};
				scene1Group1.getChildren().clear();
				resetHBox(bodyTypePictureBox1,arrayNode); 
				scene1Group1.getChildren().addAll(bodyTypePictureBox1);
			}

			if (choices.getSelectionModel().isSelected(1)) {
				System.out.println("Your body goal is: " + choices.getSelectionModel().getSelectedItem());

				// Show Healthy Body Picture
				Node [] arrayNode = {invisibleImage(), imageView2, invisibleImage(), invisibleImage()};
				scene1Group1.getChildren().clear();
				resetHBox(bodyTypePictureBox1,arrayNode); 
				scene1Group1.getChildren().addAll(bodyTypePictureBox1);
			}

			if (choices.getSelectionModel().isSelected(2)) {
				System.out.println("Your body goal is: " + choices.getSelectionModel().getSelectedItem());
				
				// Show Body Builder Picture
				Node [] arrayNode = {invisibleImage(), imageView3, invisibleImage(), invisibleImage()};
				scene1Group1.getChildren().clear();
				resetHBox(bodyTypePictureBox1,arrayNode); 
				scene1Group1.getChildren().addAll(bodyTypePictureBox1);
			}

			if (choices.getSelectionModel().isSelected(3)) {
				System.out.println("Your body goal is: " + choices.getSelectionModel().getSelectedItem());
				
				// Show Strict Diet Picture
				Node [] arrayNode = {invisibleImage(), imageView4, invisibleImage(), invisibleImage()};
				scene1Group1.getChildren().clear();
				resetHBox(bodyTypePictureBox1,arrayNode); 
				scene1Group1.getChildren().addAll(bodyTypePictureBox1);
			}
		});

		// Label "Choose your Age"
		Label age = new Label("Choose Your Age!");
		age.getStyleClass().add("labels");

		// Generate ages into String Array Form
		String[] ageArray = new String[100];
		for (int i = 1; i <= 100; i++) {
			ageArray[i - 1] = String.valueOf(i);
		}
		ObservableList<String> ageOptions = FXCollections.observableArrayList(ageArray);

		// Fill "Choose you Age" ChoiceBox
		ageBox.getItems().addAll(ageOptions);
		ageBox.setPrefWidth(100);
		ageBox.setVisibleRowCount(4);

		// Button and Label for finish
		Label finish = new Label("Finished?");
		Button switch_button = new Button("Click Here!!");
		switchToScene2(switch_button);

		// Put each label ComboBox into a HorizontalBox
		horizontalBox1.getChildren().addAll(bodyGoal, choices);
		horizontalBox1.setAlignment(Pos.BASELINE_CENTER);
		horizontalBox2.getChildren().addAll(age, ageBox);
		horizontalBox2.setAlignment(Pos.BASELINE_CENTER);
		horizontalBox3.getChildren().addAll(finish, switch_button);
		horizontalBox3.setAlignment(Pos.BASELINE_CENTER);

		scene1.getChildren().addAll(emptyBoxPrinter(), horizontalBox1, emptyBoxPrinter(), scene1Group1,
				emptyBoxPrinter(), horizontalBox2, emptyBoxPrinter(), emptyBoxPrinter(), emptyBoxPrinter(), emptyBoxPrinter(), emptyBoxPrinter(), horizontalBox3,
				emptyBoxPrinter());
		scene1.setAlignment(Pos.CENTER);
		scene1.setAlignment(Pos.TOP_CENTER);
		this.setCenter(scene1);

	}

	// Return invisible Image
	public ImageView invisibleImage() {
		Image image = new Image("https://st.depositphotos.com/1026456/1245/v/450/depositphotos_12458533-stock-illustration-stick-figure.jpg");
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setFitHeight(100);
		imageView.setFitWidth(100);
		imageView.setVisible(false);
		return imageView;
	}

	// Return empty Horizontal Box
	public HBox emptyBoxPrinter() {
		HBox emptyBox = new HBox(8);
		emptyBox.setAlignment(Pos.BASELINE_CENTER);
		emptyBox.getChildren().addAll(new Label());
		emptyBox.setPrefHeight(100000000);
		emptyBox.setVisible(false);
		return emptyBox;

	}

	// Set title
	public void setTitle() {
		VBox topBox = new VBox();

		Label title = new Label("Hemp!");
		title.getStyleClass().add("title");

		Label description = new Label("Hungry. Eating. Meal. Planner.");

		topBox.getChildren().addAll(title, description);
		topBox.setAlignment(Pos.CENTER);
		this.setTop(topBox);
	}

	// Set main background picture
	public void setMainBackground() {

		// URL for main fruit Image
		// https://hdwallsource.com/img/2014/5/fruit-background-20359-20869-hd-wallpapers.jpg
		BackgroundImage myBI = new BackgroundImage(
				new Image("https://hdwallsource.com/img/2014/5/fruit-background-20359-20869-hd-wallpapers.jpg", WIDTH,
						HEIGHT, false, true),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
				BackgroundSize.DEFAULT);

		// then you set to your node
		scene1.setBackground(new Background(myBI));
	}

	// Switch to Scene1
	public void switchToScene1(Button button) {
		button.setOnAction(e -> {
			this.setCenter(scene1);
		});
	}
	
	// Switch to Scene2
	public void switchToScene2(Button button) {
		button.setOnAction(e -> {
			if (choices.getSelectionModel().isEmpty() == false && ageBox.getSelectionModel().isEmpty() == false) {
				this.setCenter(scene2);
			} 
			else {
				if (choices.getSelectionModel().isEmpty()) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Error in body type input");
					alert.setContentText("Please select a body type.");
					alert.showAndWait();
				}

				if (ageBox.getSelectionModel().isEmpty()) {
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Error in age input");
					alert.setContentText("Please select an age.");
					alert.showAndWait();
				}
			}
		});
	}
	
	private void switchToScene3(Button button) {
		button.setOnAction(e->{
			this.setCenter(scene3);
		});
	}

	// Create Scene 2
	public void createScene2() {
		scene2 = new VBox();
		scene2.getStyleClass().add("boxes");
		
		HBox horizontalBox = new HBox(8);

		VBox verticalBox = new VBox();
		verticalBox.setAlignment(Pos.CENTER_LEFT);
		
		VBox daysBox = new VBox();

		Button switch_button = new Button("Finished!");
		switchToScene3(switch_button);
		
		// ChoiceBoxes for "Scene2"
		ChoiceBox<String> scene2ComboBox1 = new ChoiceBox<>();
		ChoiceBox<String> scene2ComboBox2 = new ChoiceBox<>();
		ChoiceBox<String> scene2ComboBox3 = new ChoiceBox<>();
		ChoiceBox<String> scene2ComboBox4 = new ChoiceBox<>();
		ChoiceBox<String> scene2ComboBox5 = new ChoiceBox<>();
		ChoiceBox<String> scene2ComboBox6 = new ChoiceBox<>();
		ChoiceBox<String> scene2ComboBox7 = new ChoiceBox<>();
		
		// Labels for Week
		Label monday = new Label("Monday");
		monday.getStyleClass().add("days");
		Label tuesday = new Label("Tuesday");
		tuesday.getStyleClass().add("days");
		Label wednesday = new Label("Wednesday");
		wednesday.getStyleClass().add("days");
		Label thursday = new Label("Thursday");
		thursday.getStyleClass().add("days");
		Label friday = new Label("Friday");
		friday.getStyleClass().add("days");
		Label saturday = new Label("Saturday");
		saturday.getStyleClass().add("days");
		Label sunday = new Label("Sunday");
		sunday.getStyleClass().add("days");
		
		// Populating ComboBoxes with Different food Items
		scene2ComboBox1.getItems().addAll("Food1", "Food2", "Food3", "Food4");
		scene2ComboBox2.getItems().addAll("Food1", "Food2", "Food3", "Food4");
		scene2ComboBox3.getItems().addAll("Food1", "Food2", "Food3", "Food4");
		scene2ComboBox4.getItems().addAll("Food1", "Food2", "Food3", "Food4");
		scene2ComboBox5.getItems().addAll("Food1", "Food2", "Food3", "Food4");
		scene2ComboBox6.getItems().addAll("Food1", "Food2", "Food3", "Food4");
		scene2ComboBox7.getItems().addAll("Food1", "Food2", "Food3", "Food4");
		
		// Populating The daysBox with Days
		daysBox.getChildren().addAll(monday,tuesday,wednesday,thursday,friday,saturday,sunday);
		daysBox.getStyleClass().add("verticalBox");
		daysBox.setSpacing(19);
		
		// Adding Combo Boxes to their parent (verticalBox)
		verticalBox.getChildren().addAll(scene2ComboBox1,scene2ComboBox2,scene2ComboBox3,scene2ComboBox4,scene2ComboBox5,scene2ComboBox6,scene2ComboBox7);
		verticalBox.getStyleClass().add("verticalBox");
		verticalBox.setSpacing(10);
		
		String sampleParagraph = "The quick brown fox jumped over the lazy dog. The quick brown fox jumped over the lazy dog. The quick brown fox jumped over the lazy dog. The quick brown fox jumped over the lazy dog.";
		
		Label description = new Label();
		description.getStyleClass().add("des");
		//description.setMinSize(250, 275);
		description.setWrapText(true);
		description.setText(sampleParagraph);
		description.setTextAlignment(TextAlignment.CENTER);
		description.setPrefSize(250, 275);
		
		// Adding daysBox & verticalBox (side by side with padding)
		horizontalBox.getChildren().addAll(daysBox, verticalBox, description);
		horizontalBox.getStyleClass().add("boxSpacing");
		
		// HBox only for the button (this goes below the daysBox & verticalBox) **It stacks HORIZONTALLY
		HBox buttonBox = new HBox();
		buttonBox.getChildren().add(switch_button);
		buttonBox.setAlignment(Pos.BASELINE_CENTER);
		
		// Populating the VBox Scene
		scene2.getChildren().addAll(horizontalBox, buttonBox);
		
		//Adding Scene to BorderPane (Parent)
		this.setCenter(scene2);
	}
	
	//Create Scene 3
	public void createScene3() {
		scene3 = new VBox();
		scene3.getStyleClass().add("boxes");
		FoodTester test = new FoodTester();
		Label Monday = new Label(test.printMonday());
		scene3.getChildren().add(Monday);
	}

	//Reset HorizontalBox for new Image
	public HBox resetHBox(HBox h, Node [] n)
	{
		h.getChildren().clear();

		// Set Box
		h.getChildren().addAll(n);
		h.setPrefHeight(100);
		h.setAlignment(Pos.CENTER_LEFT);   
		return h;
		
	}

	// Setup ImageView for new Image
	public ImageView imageViewSetup(Image a)
	{
		ImageView tempImageView = new ImageView(a);
		tempImageView.setFitHeight(100);
		tempImageView.setFitWidth(100);
		return tempImageView;
	}
}
