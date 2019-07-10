package client;

import java.awt.*;

public class Bullet {

    private int x,y;
    private Dir dir;
    private int speed;
    private final int OFFSET = 15;

    Bullet(Tank tank){
        x = tank.getX()+OFFSET;
        y = tank.getY()+OFFSET;
        dir = tank.getDir();
        speed = 15;
    }

    void paint(Graphics g){
        switch (dir){
            case LEFT:
                g.drawImage(ResourceManager.BulletLeft,x,y,null);
                break;
            case UP:
                g.drawImage(ResourceManager.BulletUp,x,y,null);
                break;
            case RIGHT:
                g.drawImage(ResourceManager.BulletRight,x,y,null);
                break;
            case DOWN:
                g.drawImage(ResourceManager.BulletDown,x,y,null);
                break;
        }
        move();
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
