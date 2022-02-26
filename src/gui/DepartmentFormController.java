package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable{
	
	@FXML 
	private TextField txtId; 

	@FXML 
	private TextField txtName; 

	@FXML 
	private Label LabelErrorName; 
	
	@FXML 
	private Button btSave ;
	
	@FXML 
	private Button btCancel ;
	
	
	@FXML 
	private void onbtSaveAction ( ) {
		System.out.println("OnBtSave");
		
	}
	
	@FXML 
	private void onbtCancelAction ( ) {
		System.out.println("OnBtCancel");
		
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
				
	}
	 private void initializaNodes()  {
		 
		 Constraints.setTextFieldInteger(txtId);
		 Constraints.setTextFieldMaxLength(txtName, 30 );
	 }
	

}
