package test1;

import java.io.*;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//missing flat file import

public class Login {
	private static String loginName;
	private static String loginPass;
	private static String compareTag;
	private static String connString;
	
	private final static String dirPath = "C:\\Users\\shaun.lee\\eclipse-workspace\\JavaFileReader2";
	private final static String dirLogin = "loginFolder";
	
	//main method can be considered to be outside of the class
	public static void main (String args[]) {
		
		try {
			//here the class constructor is invoked to initialize the state of the class
			Login panel = new Login();
			
			if(!panel.getLogin()) {
				JOptionPane.showMessageDialog(null, "Login Credentials does not exists.");
			}else {
				pane();
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		
	
	}
	public static void pane() {
		JTextField username = new JTextField();
		JTextField password = new JPasswordField();
		//create object array which can hold any type of object
		Object[] message = {
		    "Username:", username,
		    "Password:", password
		};
//null used when default frame is used.
		//JOptionpane.showConfirmDialog(Component, object,String,option type)
		int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
		if (option == JOptionPane.OK_OPTION) {
		    if (username.getText().equals(loginName) && password.getText().equals(loginPass)) {
		        System.out.println("Login successful");
		    } else {
		        System.out.println("login failed");
		    }
		} else {
		    System.out.println("Login canceled");
		}
	}
	/*public static void getLogin() {
		File passFile = new File(dirPath + File.separator + dirLogin + File.separator +"Login.txt");
		if(passFile.exists()) {
			System.out.println("Login info exists");
		}else {
			System.out.println("does not");
		}
	}*/
	
	public static boolean getLogin() {
		loginName = "";
		loginPass = "";
		compareTag = "";
		connString = "";
		File passFile = new File(dirPath + File.separator + dirLogin + File.separator +"Login.txt");
		if(passFile.exists()) {
			System.out.println("Login info exists");
			List<String>loginList = new FlatFile(passFile).getContentList();
			loginName = loginList.size() >= 1 ? loginList.get(0) : "";
			loginPass = loginList.size() >= 2 ? loginList.get(1) : "";
			compareTag = loginList.size() >= 3 ? loginList.get(2) : "";
			connString = loginList.size() >= 4 ? loginList.get(3) : "";	
			JOptionPane.showMessageDialog(null, "LoginID is :" + loginName + " Password is :" + loginPass);
		}
		if (loginName.equals("") || loginPass.equals("")) {
			JOptionPane.showMessageDialog(null, "Login credential does not exist");
			return false;
		}
		return true;
	}
}
