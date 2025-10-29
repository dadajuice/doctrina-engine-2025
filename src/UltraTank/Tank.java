package UltraTank;

import Doctrina.Canvas;
import Doctrina.ControllableEntity;

import java.awt.*;

public class Tank extends ControllableEntity {

    private int cooldown = 0;

    public Tank(GamePad gamePad) {
        super(gamePad);
        setDimension(30, 30);
        setSpeed(2);
        moveTo(100, 100);
    }

    public Missile fire() {
        if (cooldown == 0) {
            cooldown = 50;
            return new Missile(this);
        }
        return null;
    }

    @Override
    public void update() {
        moveWithController();
        if (cooldown > 0) {
            cooldown--;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRectangle(this, Color.GREEN);
    }
}
