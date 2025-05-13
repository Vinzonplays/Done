package com.example.foodmanage.Controller;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class HomeController {



    @FXML
    private ImageView homeImageView;

    @FXML
    public void initialize() {
        // Load image if needed
        try {
            Image image = new Image(getClass().getResource("/image/home.png").toExternalForm()); // Optional image
            homeImageView.setImage(image);
        } catch (Exception e) {
            System.out.println("Image not found or failed to load.");
        }

    }
}
