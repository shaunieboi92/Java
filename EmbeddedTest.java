package application;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javafx.application.Platform;

public class EmbeddedTest extends JPanel{
	JLabel formTitle, first,last,buttonLbl;
	private JTextField firstField, lastField;
	
	//constructor for SwingForm
	public EmbeddedTest() {
		JPanel innerPanel = new JPanel();
		GridLayout gl = new GridLayout(3,2);
		innerPanel.setLayout(gl);
		
		first = new JLabel("First Name: ");
		firstField = new JTextField(10);
		innerPanel.add(first);
		innerPanel.add(firstField);
		last = new JLabel("Last Name: ");
		lastField = new JTextField(10);
		innerPanel.add(last);
		innerPanel.add(lastField);
		
		JButton button = new JButton("Submit");
		button.addActionListener((event)->{
			Platform.runLater(()->{
				UserEntryForm.fxLabel.setText("Message from Swing form...");
			});
		});
		buttonLbl = new JLabel("Click Me: ");
		innerPanel.add(buttonLbl);
		innerPanel.add(button);
		innerPanel.setVisible(true);
		add(innerPanel);
	}
}
