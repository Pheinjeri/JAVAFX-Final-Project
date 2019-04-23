/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admi;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author STUDENTS
 */
public class FXMLDocumentController implements Initializable {
    
    // Aside Nav Buttons
    @FXML
    private Button equipmentBtn;
    @FXML
    private Button libraryBtn;
    @FXML
    private Button analyticsBtn;
    @FXML
    private Button logoutBtn;
    
    // Anchorpanes
    @FXML
    private AnchorPane mainEquipmentPane;
    @FXML
    private AnchorPane mainLibraryPane;
    @FXML
    private AnchorPane mainAnalyticsPane;
    @FXML
    private AnchorPane mainLogOutPane;
    @FXML
    private AnchorPane requestEquipmentEntryPane;
    @FXML
    private AnchorPane requestLibraryEntryPane;
    
    //Other Buttons
    @FXML
    private Button equipmentAddBtn;
    @FXML
    private Button libraryAddBtn;
    
    //Other Buttons
    @FXML
    private Button equipmentSubmitBtn;
    @FXML
    private Button librarySubmitBtn;
    
    //TableView
    @FXML
    private TableView<Person> equipmentTable;
    @FXML
    private TableView<Person> libraryTable;
    
    //Observable Lists
    ObservableList<Person> equipmentData = FXCollections.observableArrayList();
    
    @FXML
    private void handleEquipmentButtonAction(ActionEvent event) {
        mainEquipmentPane.setVisible(true);
        mainLibraryPane.setVisible(false);
        mainAnalyticsPane.setVisible(false);
        mainLogOutPane.setVisible(false);
        requestEquipmentEntryPane.setVisible(false);
        requestLibraryEntryPane.setVisible(false);
    }
    
    @FXML
    private void handleLibraryButtonAction(ActionEvent event) {
        mainEquipmentPane.setVisible(false);
        mainLibraryPane.setVisible(true);
        mainAnalyticsPane.setVisible(false);
        mainLogOutPane.setVisible(false);
        requestEquipmentEntryPane.setVisible(false);
        requestLibraryEntryPane.setVisible(false);
    }
    
    @FXML
    private void handleAnalyticsButtonAction(ActionEvent event) {
        mainEquipmentPane.setVisible(false);
        mainLibraryPane.setVisible(false);
        mainAnalyticsPane.setVisible(true);
        mainLogOutPane.setVisible(false);
        requestEquipmentEntryPane.setVisible(false);
        requestLibraryEntryPane.setVisible(false);
    }
    
    @FXML
    private void handleLogOutButtonAction(ActionEvent event) {
        mainEquipmentPane.setVisible(false);
        mainLibraryPane.setVisible(false);
        mainAnalyticsPane.setVisible(false);
        mainLogOutPane.setVisible(true);
        requestEquipmentEntryPane.setVisible(false);
        requestLibraryEntryPane.setVisible(false);
    }
    
    @FXML
    private void handleEquipmentAddButtonAction(ActionEvent event) {
        mainEquipmentPane.setVisible(false);
        mainLibraryPane.setVisible(false);
        mainAnalyticsPane.setVisible(false);
        mainLogOutPane.setVisible(false);
        requestEquipmentEntryPane.setVisible(true);
        requestLibraryEntryPane.setVisible(false);
        
    }
    
    @FXML
    private void handleLibraryAddButtonAction(ActionEvent event) {
        mainEquipmentPane.setVisible(false);
        mainLibraryPane.setVisible(false);
        mainAnalyticsPane.setVisible(false);
        mainLogOutPane.setVisible(false);
        requestEquipmentEntryPane.setVisible(false);
        requestLibraryEntryPane.setVisible(true);
    }
    
    @FXML
    private void handleEquipmentSubmitButtonAction(ActionEvent event) {
        
    }
    
    @FXML
    private void handleLibrarySubmitButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        PieChart pieChart = new PieChart();

        PieChart.Data slice1 = new PieChart.Data("Equipment", 213);
        PieChart.Data slice2 = new PieChart.Data("Library"  , 67);
        PieChart.Data slice3 = new PieChart.Data("Other" , 36);

        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.getData().add(slice3);
        
        mainAnalyticsPane.getChildren().add(pieChart);
        
        for (int i = 0; i < 5; i++){
            Person p = new Person("derick", "masai", "derickmasai@gmail.com", "sdfsdf", "dsfsdfsd");
            equipmentData.addAll(p);
        }
        
        equipmentTable.setItems(equipmentData);
        libraryTable.setItems(equipmentData);
        
    }

    public static class Person {
 
        private final SimpleStringProperty item;
        private final SimpleStringProperty schoolID;
        private final SimpleStringProperty timeTaken;
        private final SimpleStringProperty timeReturned;
        private final SimpleStringProperty condition;
 
        private Person(String item, String schoolID, String timeTaken, String timeReturned, String condition) {
            this.item = new SimpleStringProperty(item);
            this.schoolID = new SimpleStringProperty(schoolID);
            this.timeTaken = new SimpleStringProperty(timeTaken);
            this.timeReturned = new SimpleStringProperty(timeReturned);
            this.condition = new SimpleStringProperty(condition);
        }
 
//        public String getFirstName() {
//            return timeReturned.get();
//        }
// 
//        public void setFirstName(String fName) {
//            timeReturned.set(fName);
//        }
// 
//        public String getLastName() {
//            return condition.get();
//        }
// 
//        public void setLastName(String fName) {
//            condition.set(fName);
//        }
        
    }
    
}
