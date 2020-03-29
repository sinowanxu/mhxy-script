package Task;

import Context.PointContext;

import java.awt.*;
import java.nio.channels.Pipe;

import static Util.MouseEventUtil.moveMouseAndClick;

public class Kaoshi {
    public static void kejukaoshi(Robot robot) throws AWTException{

        for(int i=0;i<30;i++){
            moveMouseAndClick(robot,PointContext.kejukaoshi.x,PointContext.kejukaoshi.y);
            robot.delay(2000);
        }


    }
    public static void sanjieqiyuan(Robot robot ) throws AWTException{
        for(int i=0;i<30;i++){
            moveMouseAndClick(robot,PointContext.sanjieqiyuan.x,PointContext.sanjieqiyuan.y);
            robot.delay(2000);
        }
    }
}
