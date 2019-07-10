package client;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ResourceManager {
    public static BufferedImage TankUp,TankLeft,TankRight,TankDown;

    static {
        try {
            TankUp = ImageIO.read(ResourceManager.class.getClassLoader().getResourceAsStream("img/tankmodel/GoodTank1_up.png"));
            TankDown = ImageIO.read(ResourceManager.class.getClassLoader().getResourceAsStream("img/tankmodel/GoodTank1_down.png"));
            TankLeft = ImageIO.read(ResourceManager.class.getClassLoader().getResourceAsStream("img/tankmodel/GoodTank1_left.png"));
            TankRight = ImageIO.read(ResourceManager.class.getClassLoader().getResourceAsStream("img/tankmodel/GoodTank1_right.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
