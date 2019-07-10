package client;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Tank {

    private int x,y;
    private int speed;
    private boolean moving;
    private GameFrame gameFrame;

    private Dir dir;

    boolean bL, bU, bR, bD;

    Tank(GameFrame gameFrame){
        this.x = 100;
        this.y = 100;
        this.speed = 5;
        this.dir = Dir.UP;
        this.gameFrame = gameFrame;
    }

    void paint(Graphics g){
        switch (dir){
            case LEFT:
                g.drawImage(ResourceManager.TankLeft,x,y,null);
                break;
            case UP:
                g.drawImage(ResourceManager.TankUp,x,y,null);
                break;
            case RIGHT:
                g.drawImage(ResourceManager.TankRight,x,y,null);
                break;
            case DOWN:
                g.drawImage(ResourceManager.TankDown,x,y,null);
                break;
        }
        move();
    }

    void keyPressed(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                bL = true;
                break;
            case KeyEvent.VK_UP:
                bU = true;
                break;
            case KeyEvent.VK_RIGHT:
                bR = true;
                break;
            case KeyEvent.VK_DOWN:
                bD = true;
                break;
        }
        changeTankDir();
    }

    void keyReleased(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                bL = false;
                break;
            case KeyEvent.VK_UP:
                bU = false;
                break;
            case KeyEvent.VK_RIGHT:
                bR = false;
                break;
            case KeyEvent.VK_DOWN:
                bD = false;
                break;
            case KeyEvent.VK_SPACE:
                this.fire();
                break;
        }
        changeTankDir();
    }

    private void changeTankDir() {
        if (!bL && !bU && !bR && !bD){
            moving = false;
            return;
        }
        if (bL) dir = Dir.LEFT;
        if (bU) dir = Dir.UP;
        if (bR) dir = Dir.RIGHT;
        if (bD) dir = Dir.DOWN;
        moving = true;
    }

    void move(){
        if (!moving){
            return;
        }
        switch (dir){
            case LEFT:
                x -= speed;
                break;
            case UP:
                y -= speed;
                break;
            case RIGHT:
                x += speed;
                break;
            case DOWN:
                y += speed;
                break;
        }
    }

    void fire(){
        gameFrame.bullets.add(new Bullet(this));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Dir getDir() {
        return dir;
    }
}
