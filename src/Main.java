import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Robot robot = null;
        try {
            System.out.println("mc start");
            robot = new Robot();
            while (true) {
                robot.delay(3000);
                robot.keyPress(71);
                robot.keyRelease(71);
            }
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

    }
}