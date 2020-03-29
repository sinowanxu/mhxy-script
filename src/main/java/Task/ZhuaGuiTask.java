package Task;

import Context.PointContext;
import Util.ResetCloseUtil;

import java.awt.*;
import java.util.concurrent.atomic.AtomicBoolean;


import static Util.ColorUtil.getColor;
import static Util.MouseEventUtil.mousePressMoveDown;
import static Util.MouseEventUtil.moveMouseAndClick;
import static Util.PointUtil.isContainColor;

public class ZhuaGuiTask {
    public static AtomicBoolean isFinish=new AtomicBoolean(false);
    public static void doZhuaGuiTask(Robot robot) throws AWTException {
        boolean isQueRen = true;
        int i=0;
//        new Thread(new Runnable() {
//            public void run() {
//                try {
//                    Robot robot1=new Robot();
//                    for(int i=0;i<420;i++){
//                        robot1.delay(60000);
//                    }
//
//                    isFinish.set(true);
//
//                }catch (AWTException e){
//                    e.printStackTrace();
//                }
//
//            }
//        }).start();
        while (true) {
            if (isQueRen) {
                ResetCloseUtil.closeAllWindows(robot);
                moveMouseAndClick(robot, PointContext.ditu.x, PointContext.ditu.y);
                robot.delay(1000);
                moveMouseAndClick(robot, PointContext.changan.x, PointContext.changan.y);
                robot.delay(1000);
                moveMouseAndClick(robot, PointContext.xiaoditu.x, PointContext.xiaoditu.y);
                robot.delay(1000);
                moveMouseAndClick(robot, PointContext.zhongkui.x, PointContext.zhongkui.y);
                robot.delay(10000);
                moveMouseAndClick(robot, PointContext.zhuagui_zhuaguirenwu.x, PointContext.zhuagui_zhuaguirenwu.y);
                robot.delay(3000);
                moveMouseAndClick(robot, PointContext.quxiao.x, PointContext.quxiao.y);
                robot.delay(3000);
                moveMouseAndClick(robot, PointContext.quxiao.x, PointContext.quxiao.y);
                robot.delay(3000);
                moveMouseAndClick(robot, PointContext.firstTask.x, PointContext.firstTask.y);
                robot.delay(3000);
                moveMouseAndClick(robot, PointContext.firstTask.x, PointContext.firstTask.y);
                isQueRen = false;
            } else {
                moveMouseAndClick(robot, PointContext.firstTask.x, PointContext.firstTask.y);
                if (isContainColor(PointContext.zhuagui_quxiao.x, PointContext.zhuagui_quxiao.y, PointContext.zhuagui_quxiao_color)) {
                    robot.delay(3000);
                    moveMouseAndClick(robot, PointContext.zhuagui_quxiao.x, PointContext.zhuagui_quxiao.y);
                    ResetCloseUtil.closeAllWindows(robot);
                    robot.delay(3000);
                    isQueRen = true;
                    i++;
                }
            }

//            if(isFinish.get()){
//                break;
//            }
        }


        // 抓完一轮

    }
}
