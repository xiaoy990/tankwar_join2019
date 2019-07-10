package client;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame extends Frame {

    int x = 100, y = 100;
    int speed = 10;

    public GameFrame(){

        setLocation(100,100);
        setSize(800,600);
        setVisible(true);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
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
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g){
        g.fillRect(x,y,60,60);
    }
}
