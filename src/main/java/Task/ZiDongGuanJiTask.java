package Task;

import Context.PointContext;

import java.awt.*;
import java.awt.image.RasterOp;

import static Util.MouseEventUtil.moveMouseAndClick;
import static Util.MouseEventUtil.moveMouseAndClickRight;

public class ZiDongGuanJiTask {
    public static void doZiDongGuanJi(Robot robot)throws AWTException{
        moveMouseAndClick(robot, PointContext.kaishi.x, PointContext.kaishi.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.guanjihuozhuxiao.x,PointContext.guanjihuozhuxiao.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.guanji.x,PointContext.guanji.y);
        robot.delay(1000);
    }
}
