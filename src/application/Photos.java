package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.User;
import model.UserList;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import controller.LoginController;

/**
 * This is the main class for the PhotoAlbum
 * This class reads the list of users from the users.dat file and starts the LoginController.
 * @author Wajeeha Rehman
 * @author Pavendeep Kaur
 */
public class Photos extends Application 
{	
	Stage mainStage;
	
	/**
	 * Sets everything up for app startup
	 * @throws IOException					Exception for switching scenes
	 * @throws ClassNotFoundException		Exception for switching scenes
	 */
	@Override
	public void start(Stage primaryStage) throws IOException, ClassNotFoundException 
	{
		
		UserList ulist2 = UserList.read();
		//System.out.println(ulist2);
		
		mainStage = primaryStage;
		Parent parent;
		try 
		{
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Login.fxml"));
			parent = (Parent) loader.load();
		
			Scene scene = new Scene(parent,588,500); 
			
			mainStage.setScene(scene);
			mainStage.setTitle("Pictionary");
			mainStage.setResizable(true);
			mainStage.show();
			
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
