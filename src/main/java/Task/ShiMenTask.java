package Task;

import java.awt.*;
import java.util.concurrent.atomic.AtomicBoolean;

import Context.PointContext;
import Util.ColorUtil;
import Util.ResetCloseUtil;

import static Util.ColorUtil.getColor;
import static Util.MouseEventUtil.moveMouseAndClick;
import static Util.MouseEventUtil.moveMouseAndClickRight;
import static Util.PointUtil.isContainColor;


public class ShiMenTask {
    public static AtomicBoolean wancheng=new AtomicBoolean(false);
    public static void doShiMenTask(Robot robot) throws AWTException {

//        moveMouseAndClick(robot, PointContext.ditu.x, PointContext.ditu.y);
//        robot.delay(1000);
//        moveMouseAndClick(robot, PointContext.fangcun.x, PointContext.fangcun.y);
//        robot.delay(1000);
//        moveMouseAndClick(robot, PointContext.xiaoditu.x, PointContext.xiaoditu.y);
//        robot.delay(1000);
//        moveMouseAndClick(robot, PointContext.putizushi.x, PointContext.putizushi.y);
//        robot.delay(3000);
//        moveMouseAndClick(robot, PointContext.shimen_lingqurenwu.x, PointContext.shimen_lingqurenwu.y);
//        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.renwulan1.x, PointContext.renwulan1.y);
        moveMouseAndClick(robot, PointContext.shimen_yige1.x, PointContext.shimen_yige1.y);

        moveMouseAndClick(robot, PointContext.shimen_quwancheng1.x, PointContext.shimen_quwancheng1.y);
        robot.delay(3000);
        moveMouseAndClick(robot, PointContext.shimen_yige1.x, PointContext.shimen_yige1.y);
        moveMouseAndClick(robot, PointContext.shimen_quwancheng2.x, PointContext.shimen_quwancheng2.y);
        robot.delay(3000);
        moveMouseAndClick(robot, PointContext.shimen_yige1.x, PointContext.shimen_yige1.y);
        moveMouseAndClick(robot, PointContext.shimen_quwancheng3.x, PointContext.shimen_quwancheng3.y);
        robot.delay(3000);
        moveMouseAndClick(robot, PointContext.shimen_yige1.x, PointContext.shimen_yige1.y);
        moveMouseAndClick(robot, PointContext.shimen_quwancheng4.x, PointContext.shimen_quwancheng4.y);
        robot.delay(3000);
        moveMouseAndClick(robot, PointContext.shimen_yige1.x, PointContext.shimen_yige1.y);
        moveMouseAndClick(robot, PointContext.shimen_quwancheng5.x, PointContext.shimen_quwancheng5.y);
        robot.delay(3000);
        moveMouseAndClick(robot, PointContext.shimen_yige1.x, PointContext.shimen_yige1.y);
        moveMouseAndClick(robot, PointContext.shimen_quwancheng6.x, PointContext.shimen_quwancheng6.y);
        robot.delay(3000);
        moveMouseAndClick(robot, PointContext.shimen_yige1.x, PointContext.shimen_yige1.y);
        moveMouseAndClick(robot, PointContext.shimen_quwancheng7.x, PointContext.shimen_quwancheng7.y);
        robot.delay(3000);
        moveMouseAndClick(robot, PointContext.shimen_yige1.x, PointContext.shimen_yige1.y);

        moveMouseAndClick(robot, PointContext.renwulan1.x, PointContext.renwulan1.y);
        moveMouseAndClick(robot, PointContext.shimen_yige1.x, PointContext.shimen_yige1.y);

        new Thread(new Runnable() {
            public void run() {
                try {
                    Robot robot = new Robot();
                    for(int i=0;i<20;i++){
                        robot.delay(60000);
                    }
                    wancheng.set(true);

                } catch (AWTException e) {
                    e.printStackTrace();
                }
            }
        }).start();



        while (true) {
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            robot.delay(6000);

            ResetCloseUtil.closeAllWindows(robot);


            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            robot.delay(4000);
            moveMouseAndClick(robot, PointContext.shimen_liuge1.x, PointContext.shimen_liuge1.y);
            moveMouseAndClick(robot, PointContext.shangjiao.x, PointContext.shangjiao.y);
            moveMouseAndClick(robot, PointContext.shiyong.x, PointContext.shiyong.y);

            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            robot.delay(4000);
            moveMouseAndClick(robot, PointContext.shimen_wuge1.x, PointContext.shimen_wuge1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shangjiao.x, PointContext.shangjiao.y);
            moveMouseAndClick(robot, PointContext.shiyong.x, PointContext.shiyong.y);


            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            robot.delay(4000);
            moveMouseAndClick(robot, PointContext.shimen_wuge1.x, PointContext.shimen_wuge1.y);
            moveMouseAndClick(robot, PointContext.shimen_yige1.x, PointContext.shimen_yige1.y);
            moveMouseAndClick(robot, PointContext.shangjiao.x, PointContext.shangjiao.y);
            moveMouseAndClick(robot, PointContext.shiyong.x, PointContext.shiyong.y);

            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            robot.delay(4000);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shangjiao.x, PointContext.shangjiao.y);
            moveMouseAndClick(robot, PointContext.shiyong.x, PointContext.shiyong.y);

            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            robot.delay(4000);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shimen_yige1.x, PointContext.shimen_yige1.y);
            moveMouseAndClick(robot, PointContext.shangjiao.x, PointContext.shangjiao.y);
            moveMouseAndClick(robot, PointContext.shiyong.x, PointContext.shiyong.y);

            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            robot.delay(4000);
            moveMouseAndClick(robot, PointContext.shimen_sange1.x, PointContext.shimen_sange1.y);
            moveMouseAndClick(robot, PointContext.shimen_yige1.x, PointContext.shimen_yige1.y);
            moveMouseAndClick(robot, PointContext.shangjiao.x, PointContext.shangjiao.y);
            moveMouseAndClick(robot, PointContext.shiyong.x, PointContext.shiyong.y);



            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            robot.delay(15000);
            moveMouseAndClick(robot, PointContext.shimen_erge1.x, PointContext.shimen_erge1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shangjiao.x, PointContext.shangjiao.y);
            moveMouseAndClick(robot, PointContext.shiyong.x, PointContext.shiyong.y);

            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            robot.delay(4000);
            moveMouseAndClick(robot, PointContext.shimen_erge1.x, PointContext.shimen_erge1.y);
            moveMouseAndClick(robot, PointContext.shimen_yige1.x, PointContext.shimen_yige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shangjiao.x, PointContext.shangjiao.y);
            moveMouseAndClick(robot, PointContext.shiyong.x, PointContext.shiyong.y);

            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            robot.delay(4000);
            moveMouseAndClick(robot, PointContext.shimen_yige1.x, PointContext.shimen_yige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shangjiao.x, PointContext.shangjiao.y);
            moveMouseAndClick(robot, PointContext.shiyong.x, PointContext.shiyong.y);

            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            robot.delay(4000);
            moveMouseAndClick(robot, PointContext.goumai.x, PointContext.goumai.y);

            if (wancheng.get()){
                break;
            }
        }

    }
}
