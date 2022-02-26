package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;

public class DepartmentFormController implements Initializable {

	private Department entity;

	@FXML
	private TextField txtId;

	@FXML
	private TextField txtName;

	@FXML
	private Label LabelErrorName;

	@FXML
	private Button btSave;

	@FXML
	private Button btCancel;

	public void setDepartment(Department entity) {
		this.entity = entity;

	}

	@FXML
	private void onbtSaveAction() {
		System.out.println("OnBtSave");

	}

	@FXML
	private void onbtCancelAction() {
		System.out.println("OnBtCancel");

	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

	private void initializaNodes() {

		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 30);
	}

	public void updateFormData() {

		if (entity == null) {
			throw new IllegalStateException("Entities was null");

		}
		txtId.setText(String.valueOf(entity.getId()));
		txtName.setText(String.valueOf(entity.getName()));

	}

}
