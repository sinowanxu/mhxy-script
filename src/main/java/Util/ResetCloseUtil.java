package Util;

import Context.PointContext;

import java.awt.*;

import static Util.MouseEventUtil.moveMouseAndClick;
import static Util.MouseEventUtil.moveMouseAndClickRight;

public class ResetCloseUtil {
    public static void closeAllWindows(Robot robot)throws AWTException{

        moveMouseAndClickRight(robot,PointContext.goumai.x,PointContext.goumai.y);
        moveMouseAndClickRight(robot,PointContext.goumai.x,PointContext.goumai.y);
        moveMouseAndClickRight(robot,PointContext.goumai.x,PointContext.goumai.y);
        moveMouseAndClick(robot,PointContext.xingchenzhilu_guanbi.x, PointContext.xingchenzhilu_guanbi.y);
        moveMouseAndClickRight(robot,PointContext.xingchenzhilu_guanbi.x, PointContext.xingchenzhilu_guanbi.y);
    }
}
