package AlphaViking;

import Doctrina.Canvas;
import Doctrina.Game;

public class AlphaVikingGame extends Game {

    private Player player;
    private GamePad gamePad;
    private World world;
    private Tree tree;

    @Override
    public void initialize() {
        gamePad = new GamePad();
        player = new Player(gamePad);
        player.moveTo(200, 200);
        world = new World();
        world.load();
        tree = new Tree(300, 350);
    }

    @Override
    public void update() {
        if (gamePad.isQuitPressed()) {
            stop();
        }
        player.update();
        if (player.getY() < tree.getY() + 52) {
            tree.blockadeFromTop();
        } else {
            tree.blockageFromBottom();
        }
    }

    @Override
    public void draw(Canvas canvas) {
        world.draw(canvas);
        // 80 (tree height) - 28 (max for layer switch)
        if (player.getY() < tree.getY() + 52) {
            player.draw(canvas);
            tree.draw(canvas);
        } else {
            tree.draw(canvas);
            player.draw(canvas);
        }
    }
}
