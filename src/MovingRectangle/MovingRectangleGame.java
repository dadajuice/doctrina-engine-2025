package MovingRectangle;

import Doctrina.Canvas;
import Doctrina.Controller;
import Doctrina.Game;

import java.awt.*;

public class MovingRectangleGame extends Game {

    private Controller controller;
    private Player player;
    private Npc npc;

    @Override
    public void initialize() {
        controller = new Controller();
        addKeyListener(controller);
        player = new Player(controller);
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
