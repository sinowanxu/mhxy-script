package Task;

import Context.PointContext;
import Util.ResetCloseUtil;

import java.awt.*;

import static Util.ChangeZhuZhanUtil.changeTo1;
import static Util.ChangeZhuZhanUtil.changeTo2;
import static Util.MouseEventUtil.moveMouseAndClick;

public class YunBiaoTask {
    public static void doYunBiaoTask(Robot robot) throws AWTException {
        ResetCloseUtil.closeAllWindows(robot);
        robot.delay(5000);
        changeTo2(robot);
        moveMouseAndClick(robot, PointContext.ditu.x, PointContext.ditu.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.changan.x, PointContext.changan.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.xiaoditu.x, PointContext.xiaoditu.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.zhengbiaotou.x, PointContext.zhengbiaotou.y);
        robot.delay(10000);
        moveMouseAndClick(robot, PointContext.yunbiao_renwu.x, PointContext.yunbiao_renwu.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.yunbiao_queren.x, PointContext.yunbiao_queren.y);
        for(int i=0;i<5;i++){
            robot.delay(60000);
        }
        moveMouseAndClick(robot, PointContext.yunbiao_renwu.x, PointContext.yunbiao_renwu.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.yunbiao_queren.x, PointContext.yunbiao_queren.y);
        for(int i=0;i<5;i++){
            robot.delay(60000);
        }
        moveMouseAndClick(robot, PointContext.yunbiao_renwu.x, PointContext.yunbiao_renwu.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.yunbiao_queren.x, PointContext.yunbiao_queren.y);
        for(int i=0;i<5;i++){
            robot.delay(60000);
        }


    }
}
