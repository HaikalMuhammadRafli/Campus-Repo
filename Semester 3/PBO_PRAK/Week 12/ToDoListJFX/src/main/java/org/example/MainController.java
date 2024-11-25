package org.example;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import org.example.core.Task;
import org.example.core.ToDoListModel;

import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class MainController implements ChangeListener<Task> {

    String[] priorities = {"High", "Moderate", "Low"};

    int number = 1;

    @FXML
    Button createBtn;

    @FXML
    Button markAsDoneBtn;

    @FXML
    Button deleteBtn;

    @FXML
    TextField txtTitle;

    @FXML
    DatePicker deadlineDate;

    @FXML
    ChoiceBox<String> chbPriority;

    @FXML
    ListView<Task> listTask;

    private ToDoListModel model;

    @FXML
    public void initialize() {
        chbPriority.setItems(FXCollections.observableArrayList(priorities));

        // atur event handler ketika salah satu baris (item) pada ListView diklik
        this.listTask.getSelectionModel().selectedItemProperty().addListener(this);

        this.model = new ToDoListModel();

        ArrayList<Task> taskData = this.model.loadTasks();

        this.listTask.getItems().addAll(taskData);
    }

    @FXML
    public void onCreateBtn_Action(ActionEvent actionEvent) {
        String taskTitle = this.txtTitle.getText();
        Date taskDeadline = Date.from(this.deadlineDate.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());
        String taskPriority = this.chbPriority.getValue();

        // check if empty
        // need to check the deadline!!
        if (taskTitle == null || taskTitle.trim().isEmpty() || taskPriority == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Task info cannot be empty!");
            alert.showAndWait();
            return;
        }

        Task task = new Task(taskTitle, taskDeadline, taskPriority);

        // run store task
        this.model.storeTask(task);

        this.listTask.getItems().add(task);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Task successfully added!");
        alert.showAndWait();

        // clear form
        this.txtTitle.clear();
        this.chbPriority.getSelectionModel().clearSelection();
        this.deadlineDate.setValue(null);
        number++;
    }

    @FXML
    public void onMarkAsDoneBtn_Action(ActionEvent actionEvent) {
        //
    }

    @FXML
    public void onDeleteBtn_Action(ActionEvent actionEvent) {
        //
    }

    @Override
    public void changed(ObservableValue<? extends Task> observableValue, Task before, Task now) {
        this.txtTitle.setText(now.getTitle());
        this.chbPriority.setValue(now.getPriority());
        this.deadlineDate.setValue(now.getDeadline().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
    }
}
