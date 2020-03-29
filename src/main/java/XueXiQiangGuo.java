import Context.PointContext;

import java.awt.*;

import static Util.MouseEventUtil.mouseWheel;
import static Util.MouseEventUtil.moveMouseAndClick;
import static Util.MouseEventUtil.pressF11;

public class XueXiQiangGuo {
    public static void main(String[] args)throws AWTException{
        Robot robot=new Robot();
//        moveMouseAndClick(robot, PointContext.mumumoniqi.x, PointContext.mumumoniqi.y);
//        robot.delay(60000);
        robot.delay(3000);
        pressF11(robot);
        robot.delay(2000);
        moveMouseAndClick(robot, PointContext.xxqg_tubiao.x, PointContext.xxqg_tubiao.y);
        robot.delay(20000);
//        moveMouseAndClick(robot, PointContext.xxqg_jifen.x, PointContext.xxqg_jifen.y);
//        robot.delay(10000);
//        moveMouseAndClick(robot, PointContext.xxqg_yueduwenzhang.x, PointContext.xxqg_yueduwenzhang.y);
//        robot.delay(10000);
//
//        // 下面是阅读文章
//        moveMouseAndClick(robot, PointContext.xxqg_zonghe.x, PointContext.xxqg_zonghe.y);
//        robot.delay(2000);
//        moveMouseAndClick(robot, PointContext.xxqg_zonghewenzhang1.x, PointContext.xxqg_zonghewenzhang1.y);
//        robot.delay(60000*2);
//        moveMouseAndClick(robot, PointContext.xxqg_wenzhangfanhui.x, PointContext.xxqg_wenzhangfanhui.y);
//        robot.delay(2000);
//
//        moveMouseAndClick(robot, PointContext.xxqg_zonghewenzhang2.x, PointContext.xxqg_zonghewenzhang2.y);
//        robot.delay(60000*2);
//        moveMouseAndClick(robot, PointContext.xxqg_wenzhangfanhui.x, PointContext.xxqg_wenzhangfanhui.y);
//        robot.delay(2000);
//
//        moveMouseAndClick(robot, PointContext.xxqg_zonghewenzhang3.x, PointContext.xxqg_zonghewenzhang3.y);
//        robot.delay(60000*2);
//        moveMouseAndClick(robot, PointContext.xxqg_wenzhangfanhui.x, PointContext.xxqg_wenzhangfanhui.y);
//        robot.delay(2000);
//
//        moveMouseAndClick(robot, PointContext.xxqg_zonghewenzhang4.x, PointContext.xxqg_zonghewenzhang4.y);
//        robot.delay(60000*2);
//        moveMouseAndClick(robot, PointContext.xxqg_wenzhangfanhui.x, PointContext.xxqg_wenzhangfanhui.y);
//        robot.delay(2000);
//
//        moveMouseAndClick(robot, PointContext.xxqg_zonghewenzhang5.x, PointContext.xxqg_zonghewenzhang5.y);
//        robot.delay(60000*2);
//        moveMouseAndClick(robot, PointContext.xxqg_wenzhangfanhui.x, PointContext.xxqg_wenzhangfanhui.y);
//        robot.delay(2000);
//
//        moveMouseAndClick(robot, PointContext.xxqg_zonghewenzhang6.x, PointContext.xxqg_zonghewenzhang6.y);
//        robot.delay(60000*2);
//        moveMouseAndClick(robot, PointContext.xxqg_wenzhangfanhui.x, PointContext.xxqg_wenzhangfanhui.y);
//        robot.delay(2000);

        // 下面是试听学习
        moveMouseAndClick(robot, PointContext.xxqg_jifen.x, PointContext.xxqg_jifen.y);
        robot.delay(10000);
        moveMouseAndClick(robot, PointContext.xxqg_shitingxuexi.x, PointContext.xxqg_shitingxuexi.y);
        robot.delay(3000);
        moveMouseAndClick(robot, PointContext.xxqg_xuexishipin.x, PointContext.xxqg_xuexishipin.y);
        robot.delay(3000);
        moveMouseAndClick(robot, PointContext.xxqg_xuexixinshijie.x, PointContext.xxqg_xuexixinshijie.y);
        robot.delay(3000);
        moveMouseAndClick(robot, PointContext.xxqg_shitingxuexi1.x, PointContext.xxqg_shitingxuexi1.y);
        robot.delay(3*60000);
        moveMouseAndClick(robot, PointContext.xxqg_wenzhangfanhui.x, PointContext.xxqg_wenzhangfanhui.y);
        robot.delay(2000);

        moveMouseAndClick(robot, PointContext.xxqg_fendouxinshidai.x, PointContext.xxqg_fendouxinshidai.y);
        robot.delay(3000);
        moveMouseAndClick(robot, PointContext.xxqg_shitingxuexi1.x, PointContext.xxqg_shitingxuexi1.y);
        robot.delay(3*60000);
        moveMouseAndClick(robot, PointContext.xxqg_wenzhangfanhui.x, PointContext.xxqg_wenzhangfanhui.y);
        robot.delay(2000);
        moveMouseAndClick(robot, PointContext.xxqg_shitingxuexi2.x, PointContext.xxqg_shitingxuexi2.y);
        robot.delay(3*60000);
        moveMouseAndClick(robot, PointContext.xxqg_wenzhangfanhui.x, PointContext.xxqg_wenzhangfanhui.y);
        robot.delay(2000);

        moveMouseAndClick(robot, PointContext.xxqg_qiangjunzhilu.x, PointContext.xxqg_qiangjunzhilu.y);
        robot.delay(3000);
        moveMouseAndClick(robot, PointContext.xxqg_shitingxuexi1.x, PointContext.xxqg_shitingxuexi1.y);
        robot.delay(3*60000);
        moveMouseAndClick(robot, PointContext.xxqg_wenzhangfanhui.x, PointContext.xxqg_wenzhangfanhui.y);
        robot.delay(2000);
        moveMouseAndClick(robot, PointContext.xxqg_shitingxuexi2.x, PointContext.xxqg_shitingxuexi2.y);
        robot.delay(3*60000);
        moveMouseAndClick(robot, PointContext.xxqg_wenzhangfanhui.x, PointContext.xxqg_wenzhangfanhui.y);
        robot.delay(2000);

        moveMouseAndClick(robot, PointContext.xxqg_lushuiqingshan.x, PointContext.xxqg_lushuiqingshan.y);
        robot.delay(3000);
        moveMouseAndClick(robot, PointContext.xxqg_shitingxuexi1.x, PointContext.xxqg_shitingxuexi1.y);
        robot.delay(3*60000);
        moveMouseAndClick(robot, PointContext.xxqg_wenzhangfanhui.x, PointContext.xxqg_wenzhangfanhui.y);
        robot.delay(2000);
        moveMouseAndClick(robot, PointContext.xxqg_shitingxuexi2.x, PointContext.xxqg_shitingxuexi2.y);
        robot.delay(3*60000);
        moveMouseAndClick(robot, PointContext.xxqg_wenzhangfanhui.x, PointContext.xxqg_wenzhangfanhui.y);
        robot.delay(2000);

        moveMouseAndClick(robot, PointContext.xxqg_yidaiyilu.x, PointContext.xxqg_yidaiyilu.y);
        robot.delay(3000);
        moveMouseAndClick(robot, PointContext.xxqg_shitingxuexi1.x, PointContext.xxqg_shitingxuexi1.y);
        robot.delay(3*60000);
        moveMouseAndClick(robot, PointContext.xxqg_wenzhangfanhui.x, PointContext.xxqg_wenzhangfanhui.y);
        robot.delay(2000);
        moveMouseAndClick(robot, PointContext.xxqg_shitingxuexi2.x, PointContext.xxqg_shitingxuexi2.y);
        robot.delay(3*60000);
        moveMouseAndClick(robot, PointContext.xxqg_wenzhangfanhui.x, PointContext.xxqg_wenzhangfanhui.y);
        robot.delay(2000);


        mouseWheel(robot,PointContext.xxqg_shitingxuexi1,-5000);
        robot.delay(5000);



    }
}
