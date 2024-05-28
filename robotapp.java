import java.awt.event.InputEvent;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class robotapp{
    public static void main(String[] args) throws Exception{
        Robot jud = new Robot();
        jud.mouseMove(1880,515);
        jud.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        jud.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        jud.mouseMove(1880,990);
        jud.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        jud.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);
        jud.mouseMove(1025,50);
        jud.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        jud.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);
        jud.mouseMove(1020,165);
        jud.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        jud.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle bounds = new Rectangle(screenSize);
        BufferedImage image= jud.createScreenCapture(bounds); 
        File file = new File("myScreenShot.png");
        ImageIO.write(image,"png", file);
        System.out.println("The screenshot is in " + file.getPath()); 

        jud.mouseMove(1280,80);
        Thread.sleep(2000);
        jud.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        jud.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}