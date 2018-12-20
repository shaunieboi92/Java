package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class ButtonController {
	@FXML
	private TextField nameField;
	@FXML
	private Button helloButton;
	@FXML
	private Button byeButton;
	@FXML
	private CheckBox ourCheckBox;
	
	//add function for initializing hello and bye button state
	@FXML
	public void initialize() {
		helloButton.setDisable(true);//this will disable the buttons, it is an API of JavaFX
		byeButton.setDisable(true);
	}
	
	@FXML
	//Set event handler for clicking action of the button
	public void onButtonClicked(ActionEvent e) {
		String name = nameField.getText();
		if(e.getSource().equals(helloButton)) {
			System.out.println(e.getSource());
			System.out.println("Hello, " + name);
		}
		else if(e.getSource().equals(byeButton)) {
			System.out.println(e.getSource());
			System.out.println("Bye, " + name);
		}
		if(ourCheckBox.isSelected()) {
			nameField.clear();
			helloButton.setDisable(true);
			byeButton.setDisable(true);
		}
		

	}
	@FXML
	public void handleKeyReleased() {
		//set boolean disableButtons should field be empty
		String name = nameField.getText();
		boolean disableButtons = name.isEmpty() || name.trim().isEmpty();
		helloButton.setDisable(disableButtons);
		byeButton.setDisable(disableButtons);

	}
	public void handleChange() {
		System.out.println("The check box is " + (ourCheckBox.isSelected()? "checked" : "Not checked"));
	}

}
