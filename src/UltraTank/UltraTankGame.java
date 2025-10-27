package UltraTank;

import Doctrina.Canvas;
import Doctrina.Game;

public class UltraTankGame extends Game {

    private GamePad gamePad;
    private Tank tank;

    @Override
    public void initialize() {
        gamePad = new GamePad();
        tank = new Tank(gamePad);
    }

    @Override
    public void update() {
        if (gamePad.isQuitPressed()) {
            stop();
        }
        tank.update();
    }

    @Override
    public void draw(Canvas canvas) {
        tank.draw(canvas);
    }
}
