import java.awt.event.InputEvent;
import java.awt.*;
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
        jud.mouseMove(1020,165);
        jud.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        jud.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    }
}