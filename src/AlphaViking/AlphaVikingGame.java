package AlphaViking;

import Doctrina.Canvas;
import Doctrina.Game;

public class AlphaVikingGame extends Game {

    private Player player;
    private GamePad gamePad;

    @Override
    public void initialize() {
        gamePad = new GamePad();
        player = new Player(gamePad);
        player.moveTo(200, 200);
    }

    @Override
    public void update() {
        if (gamePad.isQuitPressed()) {
            stop();
        }
        player.update();
    }

    @Override
    public void draw(Canvas canvas) {
        player.draw(canvas);
    }
}
