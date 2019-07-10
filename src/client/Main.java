package client;

public class Main {
    public static void main(String[] args) {

        GameFrame gf = new GameFrame();

        while(true){
            try {
                Thread.sleep(25);
                gf.repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
