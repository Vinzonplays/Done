package com.example.foodmanage;

import javafx.beans.property.*;

import java.time.LocalDate;

public class Order {
    private final StringProperty orderId;
    private final StringProperty customerName;
    private final ObjectProperty<LocalDate> orderDate;
    private final DoubleProperty totalAmount;
    private final StringProperty status;

    public Order(String orderId, String customerName, LocalDate orderDate, double totalAmount, String status) {
        this.orderId = new SimpleStringProperty(orderId);
        this.customerName = new SimpleStringProperty(customerName);
        this.orderDate = new SimpleObjectProperty<>(orderDate);
        this.totalAmount = new SimpleDoubleProperty(totalAmount);
        this.status = new SimpleStringProperty(status);
    }

    public StringProperty orderIdProperty() { return orderId; }
    public StringProperty customerNameProperty() { return customerName; }
    public ObjectProperty<LocalDate> orderDateProperty() { return orderDate; }
    public DoubleProperty totalAmountProperty() { return totalAmount; }
    public StringProperty statusProperty() { return status; }
}
