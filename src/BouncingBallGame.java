import java.awt.*;

public final class BouncingBallGame extends Game {

    private Ball ball;
    private int score;

    @Override
    public void initialize() {
        ball = new Ball(25);
    }

    @Override
    public void update() {
        ball.update();
        if (ball.hasTouched()) {
            score += 10;
        }
    }

    @Override
    public void drawOnBuffer(Graphics2D bufferEngine) {
        ball.draw(bufferEngine);

        bufferEngine.setPaint(Color.WHITE);
        bufferEngine.drawString("Score: " + score, 10, 20);
    }
}
