import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Game extends Application {

    public void lawnbutton(Button b, double posx, double posy, double sx, double sy){
        b.setLayoutX(posx);
        b.setLayoutY(posy);
        b.setPrefSize(sx,sy);
        b.setStyle("-fx-background-color:transparent;");
    }

    public void start(Stage stage)
    {
        try {
            StackPane stackPane = new StackPane();
            Pane p = new Pane();
            Image image1 = new Image("file:Lawn.png", 1330,700,false,false);
            ImageView iv1 = new ImageView();
            iv1.setImage(image1);

            Pane p2 = new Pane();
            Image image2 = new Image("file:pauseMenu.png", 1350,800,false,false);
            ImageView iv2 = new ImageView();
            iv2.setImage(image2);
            iv2.setPreserveRatio(true);
            p2.getChildren().add(iv2);

            Image zomimg = new Image("file:Zombie.gif",80,150,false,false);
            ImageView ivzom = new ImageView();
            ivzom.setImage(zomimg);
            ivzom.setPreserveRatio(true);
            ivzom.relocate(1135,40);
            p.getChildren().add(ivzom);

            Image plimg = new Image("file:Pea.gif",90,110,false,false);
            ImageView ivpl = new ImageView();
            ivpl.setImage(plimg);
            ivpl.setPreserveRatio(true);
            ivpl.relocate(90,100);
            p.getChildren().add(ivpl);

            Image lm1 = new Image("file:LawnMower.png", 100,70, false, false);
            ImageView ivlm1 = new ImageView();
            ivlm1.setImage(lm1);
            ivlm1.setPreserveRatio(true);
            ivlm1.relocate(10,115);
            p.getChildren().add(ivlm1);
            ImageView ivlm2 = new ImageView();
            ivlm2.setImage(lm1);
            ivlm2.setPreserveRatio(true);
            ivlm2.relocate(10,230);
            p.getChildren().add(ivlm2);
            ImageView ivlm3 = new ImageView();
            ivlm3.setImage(lm1);
            ivlm3.setPreserveRatio(true);
            ivlm3.relocate(10,335);
            p.getChildren().add(ivlm3);
            ImageView ivlm4 = new ImageView();
            ivlm4.setImage(lm1);
            ivlm4.setPreserveRatio(true);
            ivlm4.relocate(10,450);
            p.getChildren().add(ivlm4);
            ImageView ivlm5 = new ImageView();
            ivlm5.setImage(lm1);
            ivlm5.setPreserveRatio(true);
            ivlm5.relocate(10,565);
            p.getChildren().add(ivlm5);

            Button save = new Button("Save");
            save.setLayoutX(500);
            save.setLayoutY(375);
            save.setPrefSize(330,37);
            //pauseMenu.setStyle("-fx-background-color:transparent;");
            save.setOnAction(e->{
                System.out.println("Save selected");

            });

            Button restart = new Button("Restart");
            restart.setLayoutX(500);
            restart.setLayoutY(430);
            restart.setPrefSize(330,37);
            //pauseMenu.setStyle("-fx-background-color:transparent;");
            restart.setOnAction(e->{
                System.out.println("Restart selected");

            });

            Button exit = new Button("To Main Menu");
            exit.setLayoutX(500);
            exit.setLayoutY(495);
            exit.setPrefSize(330,30);
            //pauseMenu.setStyle("-fx-background-color:transparent;");
            exit.setOnAction(e->{
                System.out.println("Exit to main menu selected");

            });

            Button resume = new Button("Resume");
            resume.setLayoutX(400);
            resume.setLayoutY(565);
            resume.setPrefSize(500,88);
            //pauseMenu.setStyle("-fx-background-color:transparent;");
            resume.setOnAction(e->{
                System.out.println("Resume selected");
                stackPane.getChildren().remove(p2);

            });

            p2.getChildren().add(save);
            p2.getChildren().add(restart);
            p2.getChildren().add(exit);
            p2.getChildren().add(resume);

            Label NumSuns = new Label("");
            NumSuns.setText("50");
            p.getChildren().add(NumSuns);
            NumSuns.setLayoutX(70);
            NumSuns.setLayoutY(75);

            Button zz = new Button("0,0");
            lawnbutton(zz,70,100,120,100);
            Button zo = new Button("0,1");
            lawnbutton(zo,70,215,120,100);
            Button ztw = new Button("0,2");
            lawnbutton(ztw,70,330,120,100);
            Button zth = new Button("0,3");
            lawnbutton(zth,70,450,120,100);
            Button zerof = new Button("0,4");
            lawnbutton(zerof,70,560,120,100);
            Button oz = new Button("1,0");
            lawnbutton(oz,200,100,120,100);
            Button oo = new Button("1,1");
            lawnbutton(oo,200,215,120,100);
            Button otw = new Button("1,2");
            lawnbutton(otw,200,330,120,100);
            Button oth = new Button("1,3");
            lawnbutton(oth,200,450,120,100);
            Button of = new Button("1,4");
            lawnbutton(of,200,560,120,100);
            Button twz = new Button("2,0");
            lawnbutton(twz,340,100,120,100);
            Button two = new Button("2,1");
            lawnbutton(two,340,215,120,100);
            Button twtw = new Button("2,2");
            lawnbutton(twtw,340,330,120,100);
            Button twth = new Button("2,3");
            lawnbutton(twth,340,450,120,100);
            Button twf = new Button("2,4");
            lawnbutton(twf,340,560,120,100);
            Button thz = new Button("3,0");
            lawnbutton(thz,480,100,120,100);
            Button tho = new Button("3,1");
            lawnbutton(tho,480,215,120,100);
            Button thtw = new Button("3,2");
            lawnbutton(thtw,480,330,120,100);
            Button thth = new Button("3,3");
            lawnbutton(thth,480,450,120,100);
            Button thf = new Button("3,4");
            lawnbutton(thf,480,560,120,100);
            Button fz = new Button("4,0");
            lawnbutton(fz,610,100,120,100);
            Button fo = new Button("4,1");
            lawnbutton(fo,610,215,120,100);
            Button ftw = new Button("4,2");
            lawnbutton(ftw,610,330,120,100);
            Button fth = new Button("4,3");
            lawnbutton(fth,610,450,120,100);
            Button ff = new Button("4,4");
            lawnbutton(ff,610,560,120,100);
            Button fiz = new Button("5,0");
            lawnbutton(fiz,745,100,120,100);
            Button fio = new Button("5,1");
            lawnbutton(fio,745,215,120,100);
            Button fitw = new Button("5,2");
            lawnbutton(fitw,745,330,120,100);
            Button fith = new Button("5,3");
            lawnbutton(fith,745,450,120,100);
            Button fif = new Button("5,4");
            lawnbutton(fif,745,560,120,100);
            Button sz = new Button("6,0");
            lawnbutton(sz,875,100,120,100);
            Button so = new Button("6,1");
            lawnbutton(so,875,215,120,100);
            Button stw = new Button("6,2");
            lawnbutton(stw,875,330,120,100);
            Button sth = new Button("6,3");
            lawnbutton(sth,875,450,120,100);
            Button sf = new Button("6,4");
            lawnbutton(sf,875,560,120,100);
            Button sez = new Button("7,0");
            lawnbutton(sez,1010,100,120,100);
            Button seo = new Button("7,1");
            lawnbutton(seo,1010,215,120,100);
            Button setw = new Button("7,2");
            lawnbutton(setw,1010,330,120,100);
            Button seth = new Button("7,3");
            lawnbutton(seth,1010,450,120,100);
            Button sef = new Button("7,4");
            lawnbutton(sef,1010,560,120,100);
            Button ez = new Button("8,0");
            lawnbutton(ez,1135,100,120,100);
            Button eo = new Button("8,1");
            lawnbutton(eo,1135,215,120,100);
            Button etw = new Button("8,2");
            lawnbutton(etw,1135,330,120,100);
            Button eth = new Button("8,3");
            lawnbutton(eth,1135,450,120,100);
            Button ef = new Button("8,4");
            lawnbutton(ef,1135,560,120,100);

            //zz.setStyle("-fx-background-color:transparent;");
            //ng.setOnMouseEntered(e -> ng.setStyle("-fx-background-color: -fx-shadow-highlight-color, -fx-outer-border, -fx-inner-border, -fx-body-color;\""));
            //ng.setOnMouseExited(e -> ng.setStyle("-fx-background-color:transparent;");
            //zz.setOnAction(e->{
            //System.out.println("New game selected");
            //stackPane.getChildren().add(p);
            //});

            Group bgrp = new Group();
            bgrp.getChildren().add(zo);
            bgrp.getChildren().add(zz);
            bgrp.getChildren().add(ztw);
            bgrp.getChildren().add(zth);
            bgrp.getChildren().add(zerof);
            bgrp.getChildren().add(oz);
            bgrp.getChildren().add(oo);
            bgrp.getChildren().add(otw);
            bgrp.getChildren().add(oth);
            bgrp.getChildren().add(of);
            bgrp.getChildren().add(twz);
            bgrp.getChildren().add(two);
            bgrp.getChildren().add(twtw);
            bgrp.getChildren().add(twth);
            bgrp.getChildren().add(twf);
            bgrp.getChildren().add(thz);
            bgrp.getChildren().add(tho);
            bgrp.getChildren().add(thtw);
            bgrp.getChildren().add(thth);
            bgrp.getChildren().add(thf);
            bgrp.getChildren().add(fz);
            bgrp.getChildren().add(fo);
            bgrp.getChildren().add(ftw);
            bgrp.getChildren().add(fth);
            bgrp.getChildren().add(ff);
            bgrp.getChildren().add(fiz);
            bgrp.getChildren().add(fio);
            bgrp.getChildren().add(fitw);
            bgrp.getChildren().add(fith);
            bgrp.getChildren().add(fif);
            bgrp.getChildren().add(sz);
            bgrp.getChildren().add(so);
            bgrp.getChildren().add(stw);
            bgrp.getChildren().add(sth);
            bgrp.getChildren().add(sf);
            bgrp.getChildren().add(sez);
            bgrp.getChildren().add(seo);
            bgrp.getChildren().add(setw);
            bgrp.getChildren().add(seth);
            bgrp.getChildren().add(sef);
            bgrp.getChildren().add(ez);
            bgrp.getChildren().add(eo);
            bgrp.getChildren().add(etw);
            bgrp.getChildren().add(eth);
            bgrp.getChildren().add(ef);

            p.getChildren().add(bgrp);

            Button sun = new Button();

            stackPane.getChildren().addAll(iv1,p);

            Button pauseMenu = new Button("Menu");
            pauseMenu.setLayoutX(1150);
            pauseMenu.setLayoutY(0);
            pauseMenu.setPrefSize(170,27);
            //pauseMenu.setStyle("-fx-background-color:transparent;");
            p.getChildren().add(pauseMenu);
            pauseMenu.setOnAction(e->{
                System.out.println("Menu selected");
                stackPane.getChildren().add(p2);

            });

            Scene scene1 = new Scene(stackPane,1350, 700);

            stage.setTitle("Plants Vs Zombies");
            stage.setScene(scene1);
            stage.show();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Main Method
    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}