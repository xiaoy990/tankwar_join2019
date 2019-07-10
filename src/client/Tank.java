package client;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Tank {

    private int x,y;
    private int speed;

    Tank(){
        this.x = 100;
        this.y = 100;
        this.speed = 10;
    }

    void paint(Graphics g){
        g.fillRect(x,y,60,60);
    }

    void keyPressed(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                x -= speed;
                break;
            case KeyEvent.VK_UP:
                y -= speed;
                break;
            case KeyEvent.VK_RIGHT:
                x += speed;
                break;
            case KeyEvent.VK_DOWN:
                y += speed;
                break;
        }
    }
}
