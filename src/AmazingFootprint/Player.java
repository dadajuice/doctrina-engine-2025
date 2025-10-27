package AmazingFootprint;

import Doctrina.Canvas;
import Doctrina.MovableEntity;

import java.awt.*;

public class Player extends MovableEntity {

    private GamePad gamePad;

    public Player(GamePad gamePad) {
        moveTo(200, 200);
        setSpeed(3);
        setDimension(20, 60);
        this.gamePad = gamePad;
    }

    public void update() {
        if (gamePad.isDownPressed()) {
            moveDown();
        } else if (gamePad.isUpPressed()) {
            moveUp();
        } else if (gamePad.isLeftPressed()) {
            moveLeft();
        } else if (gamePad.isRightPressed()) {
            moveRight();
        }
    }

    public Footprint layFootprint() {
        return new Footprint(x, y);
    }

    public void draw(Canvas canvas) {
        canvas.drawRectangle(this, Color.WHITE);
    }
}
