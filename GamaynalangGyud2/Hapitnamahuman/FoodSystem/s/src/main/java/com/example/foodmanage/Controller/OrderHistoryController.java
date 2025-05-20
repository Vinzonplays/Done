package com.example.foodmanage.Controller;

import com.example.foodmanage.Order;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class OrderHistoryController {

    @FXML
    private TableView<Order> orderTable;

    @FXML
    private TableColumn<Order, String> orderIdCol;

    @FXML
    private TableColumn<Order, String> customerNameCol;

    @FXML
    private TableColumn<Order, LocalDate> orderDateCol;

    @FXML
    private TableColumn<Order, Double> totalAmountCol;

    @FXML
    private TableColumn<Order, String> statusCol;

    @FXML
    public void initialize() {
        orderIdCol.setCellValueFactory(cellData -> cellData.getValue().orderIdProperty());
        customerNameCol.setCellValueFactory(cellData -> cellData.getValue().customerNameProperty());
        orderDateCol.setCellValueFactory(cellData -> cellData.getValue().orderDateProperty());
        totalAmountCol.setCellValueFactory(cellData -> cellData.getValue().totalAmountProperty().asObject());
        statusCol.setCellValueFactory(cellData -> cellData.getValue().statusProperty());

        orderTable.setItems(getCompletedOrders());
    }

    private ObservableList<Order> getCompletedOrders() {
        return FXCollections.observableArrayList(
                new Order("ORD001", "Alice", LocalDate.now().minusDays(2), 29.99, "Completed"),
                new Order("ORD002", "Bob", LocalDate.now().minusDays(1), 45.50, "Completed"),
                new Order("ORD003", "Charlie", LocalDate.now().minusDays(3), 19.75, "Completed")
        );
    }
}
