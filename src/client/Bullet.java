package client;

import java.awt.*;

public class Bullet {

    private int x,y;
    private Dir dir;
    private int speed;
    private final int OFFSET = 15;

    private boolean living;

    Bullet(Tank tank){
        x = tank.getX()+OFFSET;
        y = tank.getY()+OFFSET;
        dir = tank.getDir();
        speed = 15;
        living = true;
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
        if (x<0||x>GameFrame.GAME_WIDTH||y<0||y>GameFrame.GAME_HEIGHT){living = false;}
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

    public boolean isLiving() {
        return living;
    }
}
