package Doctrina;

public abstract class Game {

    private RenderingEngine renderingEngine;
    private boolean playing = true;

    public abstract void initialize();
    public abstract void update();
    public abstract void draw(Canvas canvas);

    public final void start() {
        renderingEngine = new RenderingEngine();
        renderingEngine.start();
        initialize();
        run();
        conclude();
    }

    public void conclude() {

    }

    private void run() {
        GameTime time = new GameTime();
        while (playing) {
            update();
            draw(renderingEngine.buildCanvas());
            renderingEngine.drawOnScreen();
            time.sleep();
        }
    }
}
