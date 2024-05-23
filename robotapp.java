import java.awt.event.InputEvent;
import java.awt.*;
public class robotapp{
    public static void main(String[] args) throws Exception{
        Robot jud = new Robot();
        jud.mouseMove(1870,1220);
        jud.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    }
}