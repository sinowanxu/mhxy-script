package Util;

import Context.PointContext;

import java.awt.*;

import static Util.MouseEventUtil.moveMouseAndClick;

public class ChangeZhuZhanUtil {
    public static void changeTo1(Robot robot) throws AWTException{
        moveMouseAndClick(robot,PointContext.jiahao.x,PointContext.jiahao.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.zhuzhan.x,PointContext.zhuzhan.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.zhuzhan_niu1.x,PointContext.zhuzhan_niu1.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.zhuzhan_guanbi.x,PointContext.zhuzhan_guanbi.y);
    }
    public static void changeTo2(Robot robot)throws AWTException{
        moveMouseAndClick(robot,PointContext.jiahao.x,PointContext.jiahao.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.zhuzhan.x,PointContext.zhuzhan.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.zhuzhan_niu2.x,PointContext.zhuzhan_niu2.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.zhuzhan_guanbi.x,PointContext.zhuzhan_guanbi.y);
    }

    public static void changeTo3(Robot robot)throws AWTException{
        moveMouseAndClick(robot,PointContext.jiahao.x,PointContext.jiahao.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.zhuzhan.x,PointContext.zhuzhan.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.zhuzhan_niu3.x,PointContext.zhuzhan_niu3.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.zhuzhan_guanbi.x,PointContext.zhuzhan_guanbi.y);
    }

    public static void zanli(Robot robot)throws AWTException{
        moveMouseAndClick(robot,PointContext.duiwu.x,PointContext.duiwu.y);
        moveMouseAndClick(robot,PointContext.ziji.x,PointContext.ziji.y);
        moveMouseAndClick(robot,PointContext.zanliduiwu.x,PointContext.zanliduiwu.y);
        moveMouseAndClick(robot,PointContext.huidaorenwu.x,PointContext.huidaorenwu.y);
    }
    public static void likai(Robot robot)throws AWTException{
        moveMouseAndClick(robot,PointContext.duiwu.x,PointContext.duiwu.y);
        moveMouseAndClick(robot,PointContext.duiwu.x,PointContext.duiwu.y);
        moveMouseAndClick(robot,134,662);
        moveMouseAndClick(robot,975,71);
        moveMouseAndClick(robot,868,164);
    }
}
