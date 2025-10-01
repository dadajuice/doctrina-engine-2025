package MovingRectangle;

import Doctrina.Canvas;
import Doctrina.Game;

import java.awt.*;

public class MovingRectangleGame extends Game {

    private Player player;
    private Npc npc;

    @Override
    public void initialize() {
        player = new Player();
        npc = new Npc();
    }

    @Override
    public void update() {
        player.update();
        npc.update();
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRectangle(0, 0, 800, 600, Color.BLUE);
        player.draw(canvas);
        npc.draw(canvas);
    }
}
