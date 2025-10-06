package Doctrina;

import java.awt.event.KeyEvent;

public class MovementController extends Controller {

    private int upKey;
    private int downKey;
    private int leftKey;
    private int rightKey;

    public MovementController() {
        upKey = KeyEvent.VK_UP;
        downKey = KeyEvent.VK_DOWN;
        leftKey = KeyEvent.VK_LEFT;
        rightKey = KeyEvent.VK_RIGHT;
        bindKey(upKey);
        bindKey(downKey);
        bindKey(leftKey);
        bindKey(rightKey);
    }

    public boolean isLeftPressed() {
        return isKeyPressed(leftKey);
    }

    public boolean isRightPressed() {
        return isKeyPressed(rightKey);
    }

    public boolean isUpPressed() {
        return isKeyPressed(upKey);
    }

    public boolean isDownPressed() {
        return isKeyPressed(downKey);
    }

    public boolean isMoving() {
        return isDownPressed()
                || isUpPressed()
                || isLeftPressed()
                || isRightPressed();
    }

    public void setDownKey(int keyCode) {
        removeKey(downKey);
        bindKey(keyCode);
        downKey = keyCode;
    }

    public void setUpKey(int keyCode) {
        removeKey(upKey);
        bindKey(keyCode);
        upKey = keyCode;
    }

    public void setLeftKey(int keyCode) {
        removeKey(leftKey);
        bindKey(keyCode);
        leftKey = keyCode;
    }

    public void setRightKey(int keyCode) {
        removeKey(rightKey);
        bindKey(keyCode);
        rightKey = keyCode;
    }
}
