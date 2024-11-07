package org.example;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;


public class KalkulatorJFX extends Application implements EventHandler {
    private TextField textInput1;
    private TextField operator;
    private TextField textInput2;
    private TextField textHasil;
    private Button btnTambah;
    private Button btnKurang;
    private Button btnKali;
    private Button btnBagi;
    // Scene
    private Scene scene;
    // Root Layout
    private HBox body;
    private VBox verticalLayout;
    private HBox buttonsLayout;
    private HBox inputsLayout;

    @Override
    public void start(Stage stage) throws Exception {
        this.textInput1 = new TextField();
        this.textInput1.setPromptText("...");
        this.textInput1.getStyleClass().add("input");
        this.textInput2 = new TextField();
        this.textInput2.setPromptText("...");
        this.textInput2.getStyleClass().add("input");
        this.textHasil = new TextField();
        this.textHasil.getStyleClass().add("hasil");
        this.textHasil.setEditable(false);
        this.operator = new TextField();
        this.operator.getStyleClass().add("operator");
        this.operator.setEditable(false);

        // Buttons
        this.btnTambah = new Button("+");
        this.btnKurang = new Button("-");
        this.btnKali = new Button("x");
        this.btnBagi = new Button(":");

        // Styling buttons
        this.btnTambah.getStyleClass().add("button");
        this.btnKurang.getStyleClass().add("button");
        this.btnKali.getStyleClass().add("button");
        this.btnBagi.getStyleClass().add("button");

        // Layout horizontal untuk inputs
        this.inputsLayout = new HBox();
        this.inputsLayout.getStyleClass().add("input-layout");
        this.inputsLayout.getChildren().add(this.textInput1);
        this.inputsLayout.getChildren().add(this.operator);
        this.inputsLayout.getChildren().add(this.textInput2);

        // Layout horizontal untuk buttons
        this.buttonsLayout = new HBox();
        this.buttonsLayout.getStyleClass().add("button-layout");
        this.buttonsLayout.getChildren().add(this.btnTambah);
        this.buttonsLayout.getChildren().add(this.btnKurang);
        this.buttonsLayout.getChildren().add(this.btnKali);
        this.buttonsLayout.getChildren().add(this.btnBagi);

        // Letakkan komponen ke layout
        this.verticalLayout = new VBox();
        this.verticalLayout.setSpacing(10);
        this.verticalLayout.getChildren().add(this.inputsLayout);
        this.verticalLayout.getChildren().add(this.textHasil);
        this.verticalLayout.getChildren().add(this.buttonsLayout);

        // Letakkan layout ke Horizontal Body
        this.body = new HBox();
        this.body.setAlignment(Pos.CENTER);
        HBox.setMargin(this.verticalLayout, new Insets(20, 0, 0, 0));
        this.body.getChildren().add(this.verticalLayout);

        // Masukkan layout ke dalam scene
        this.scene = new Scene(this.body, 420, 240);

        // Menambahkan CSS ke scene
        this.scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/style.css")).toExternalForm());

        // Masukkan scene ke stage
        stage.setScene(this.scene);

        // Tampilkan stage
        stage.setTitle("Kalkulator-JFX");
        stage.show();

        // Handle click event dari setiap button
        this.btnTambah.setOnAction(this);
        this.btnKurang.setOnAction(this);
        this.btnKali.setOnAction(this);
        this.btnBagi.setOnAction(this);
    }

    @Override
    public void handle(Event event) {
        String hasil = null;
        String operator = null;
        if (event.getSource() == this.btnTambah) {
            hasil = String.valueOf(this.tambah(this.textInput1.getText(), this.textInput2.getText()));
            operator = "+";
        } else if (event.getSource() == this.btnKurang) {
            hasil = String.valueOf(this.kurang(this.textInput1.getText(), this.textInput2.getText()));
            operator = "-";
        } else if (event.getSource() == this.btnKali) {
            hasil = String.valueOf(this.kali(this.textInput1.getText(), this.textInput2.getText()));
            operator = "x";
        } else if (event.getSource() == this.btnBagi) {
            hasil = String.valueOf(this.bagi(this.textInput1.getText(), this.textInput2.getText()));
            operator = ":";
        }

        if (hasil != null) {
            this.textHasil.setText(hasil);
            this.operator.setText(operator);
        }
    }

    private double tambah(String strB1, String strB2) {
        double b1 = Double.parseDouble(strB1);
        double b2 = Double.parseDouble(strB2);

        return b1 + b2;
    }

    private double kurang(String strB1, String strB2) {
        double b1 = Double.parseDouble(strB1);
        double b2 = Double.parseDouble(strB2);

        return b1 - b2;
    }

    private double kali(String strB1, String strB2) {
        double b1 = Double.parseDouble(strB1);
        double b2 = Double.parseDouble(strB2);

        return b1 * b2;
    }

    private double bagi(String strB1, String strB2) {
        double b1 = Double.parseDouble(strB1);
        double b2 = Double.parseDouble(strB2);

        return b1 / b2;
    }
}
