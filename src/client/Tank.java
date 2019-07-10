package client;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Tank {

    private int x,y;
    private int speed;

    private Dir dir;

    Tank(){
        this.x = 100;
        this.y = 100;
        this.speed = 5;
        this.dir = Dir.UP;
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
                dir = Dir.LEFT;
                break;
            case KeyEvent.VK_UP:
                dir = Dir.UP;
                break;
            case KeyEvent.VK_RIGHT:
                dir = Dir.RIGHT;
                break;
            case KeyEvent.VK_DOWN:
                dir = Dir.DOWN;
                break;
        }
    }

    void move(){
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
}
