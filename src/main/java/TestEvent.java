import Context.PointContext;

import java.awt.*;

import static Util.MouseEventUtil.mouseWheel;

public class TestEvent {
    public static void main(String[] args)throws AWTException{
        Robot robot=new Robot();
        robot.delay(2000);
        mouseWheel(robot,PointContext.mumu_diyigerenwu ,-2000);
    }
}
