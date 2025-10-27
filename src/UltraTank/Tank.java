package UltraTank;

import Doctrina.Canvas;
import Doctrina.ControllableEntity;

import java.awt.*;

public class Tank extends ControllableEntity {

    public Tank(GamePad gamePad) {
        super(gamePad);
        setDimension(30, 30);
        setSpeed(2);
        moveTo(100, 100);
    }

    @Override
    public void update() {
        moveWithController();
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRectangle(this, Color.GREEN);
    }
}
