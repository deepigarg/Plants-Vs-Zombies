package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Characters extends ImageView {
    int Health;
    int maxHealth;
    int[] Position;
    boolean dead=false;
    final String type;
    Image i;

    protected Characters(int x, int y, int h, int w, String type){
        this.relocate(x,y);
        this.type = type;

        setTranslateX(x);
        setTranslateY(y);
    }

    public void die(){

    }
    public int getHealth(){
        return Health;
    }
    void moveRight(){
        setTranslateX(getTranslateX()+50);
    }
    public void reduceHealth(int a){

    }
    public int[] getPosition(){
        return Position;
    }
    public void setPosition(int x, int y){

    }
}

class Pea extends Characters{

    protected Pea(int x, int y, int h, int w, String type) {
        super(x, y, h, w, type);
        this.setImage(new Image("Peabullet.png",90,100,false,false));
    }
}
