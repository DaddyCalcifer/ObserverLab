package com.example.programmingtechnologyobserver;

import Components.cClock;
import Components.cImage;
import Components.cMedia;
import Components.cPhrase;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import Observer.TimeServer;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public Label TimerText;
    @FXML
    public BorderPane MediaPage;
    @FXML
    public BorderPane ImagePane;
    private TimeServer timeServer;
    private cClock cClock;
    private cPhrase cPhrase;
    private cImage cImage;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        timeServer = new TimeServer();

        cClock = new cClock();
        cImage = new cImage();
        cPhrase = new cPhrase();

        timeServer.attach(cClock);
        timeServer.attach(cPhrase);
        timeServer.attach(cImage);

        this.MediaPage.setBottom(cClock.getClock());
        this.MediaPage.setCenter(cPhrase.getPhrase());
        this.ImagePane.setCenter(cImage.getImg());
    }
}