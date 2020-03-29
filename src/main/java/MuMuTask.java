import Context.PointContext;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import static Task.XinHaoTask.doXinHaoTask;
import static Task.XinHaoTask.doXinHaoWinClose;
import static Util.MouseEventUtil.moveMouseAndClick;
import static Util.MouseEventUtil.moveMouseAndClickRight;
import static Util.MouseEventUtil.pressF11;
import static Util.PointUtil.isContainColor_quick;

public class MuMuTask {
    public static void main(String[] args) throws AWTException {
        PointContext.init();
        Robot robot = new Robot();
        robot.delay(5000);
//        for(int i=0;i<6;i++){
//            firstman(robot,i);
//            doXinHaoTask(robot);
//            guanbimumu(robot);
//        }
        doXinHaoTask(robot);
    }

    public static void guanbimumu(Robot robot) throws AWTException{
        robot.keyPress(KeyEvent.VK_ALT);
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_F4);
        robot.delay(500);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.delay(500);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.delay(2000);
        moveMouseAndClick(robot,PointContext.mumu_guanbimumu.x,PointContext.mumu_guanbimumu.y);
        robot.delay(10000);
    }
    public static void firstman(Robot robot,int i) throws AWTException {
        moveMouseAndClick(robot, PointContext.mumumoniqi.x, PointContext.mumumoniqi.y);
        robot.delay(60000);
        pressF11(robot);
        robot.delay(10000);
        moveMouseAndClick(robot, PointContext.menghuantubiao.x, PointContext.menghuantubiao.y);
        robot.delay(10000);
        // 等待梦幻进入
        while (!isContainColor_quick(PointContext.mumu_xuanfu.x, PointContext.mumu_xuanfu.y, PointContext.mumu_xuanfu_color)) {
            robot.delay(2000);
        }
        // 点击选服
        robot.delay(10000);
        moveMouseAndClick(robot, PointContext.mumu_xuanfu.x, PointContext.mumu_xuanfu.y);
        robot.delay(10000);
        moveMouseAndClick(robot, PointContext.mumu_xuanfudiyige.x, PointContext.mumu_xuanfudiyige.y);
        robot.delay(3000);
        // 第一个人物
        moveMouseAndClick(robot, PointContext.mumu_renwuArray[i].x, PointContext.mumu_renwuArray[i].y);
        robot.delay(10000);

        while(!isContainColor_quick(PointContext.mumu_huodong.x,PointContext.mumu_huodong.y,PointContext.mumu_huodongcolor)){
            doXinHaoWinClose(robot,true,true);
        }

        // 取消三界奇缘，关闭福利窗口
//        moveMouseAndClick(robot, PointContext.mumu_quxiao.x, PointContext.mumu_quxiao.y);
//        moveMouseAndClick(robot, PointContext.mumu_guanbifuli.x, PointContext.mumu_guanbifuli.y);
    }
}
