package Task;

import Context.PointContext;
import Util.ResetCloseUtil;
import com.sun.org.glassfish.external.statistics.annotations.Reset;

import java.awt.*;
import java.util.concurrent.atomic.AtomicBoolean;

import static Util.ChangeZhuZhanUtil.changeTo1;
import static Util.MouseEventUtil.moveMouseAndClick;
import static Util.PointUtil.isContainColor;

public class MiJingXiangYaoTask {
    public static AtomicBoolean isFinished=new AtomicBoolean(false);
    public static void doMiJingXiangYaoTask(Robot robot)throws AWTException{
        ResetCloseUtil.closeAllWindows(robot);
        robot.delay(5000);
        changeTo1(robot);
        moveMouseAndClick(robot,PointContext.ditu.x,PointContext.ditu.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.donghaiwan.x,PointContext.donghaiwan.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.xiaoditu.x,PointContext.xiaoditu.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.yunleyou.x,PointContext.yunleyou.y);
        robot.delay(5000);
        moveMouseAndClick(robot,PointContext.mijing_mijingxiangyao.x,PointContext.mijing_mijingxiangyao.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.mijing_diyigezhu.x,PointContext.mijing_diyigezhu.y);
        robot.delay(1000);
        moveMouseAndClick(robot,PointContext.mijing_tiaozhan.x,PointContext.mijing_tiaozhan.y);
        robot.delay(1000);

        new Thread(new Runnable() {
            public void run() {
                try {
                    Robot robot=new Robot();
                    for(int i=0;i<60;i++){
                        robot.delay(60000);
                    }
                    isFinished.set(true);
                    robot.delay(5000);
                    moveMouseAndClick(robot,PointContext.ditu.x,PointContext.ditu.y);
                    robot.delay(1000);
                    moveMouseAndClick(robot,PointContext.donghaiwan.x,PointContext.donghaiwan.y);
                }catch (AWTException e){
                    e.printStackTrace();
                }

            }
        }).start();

        while (true){
            moveMouseAndClick(robot,PointContext.mijing_renwu.x,PointContext.mijing_renwu.y);
            robot.delay(10000);
            moveMouseAndClick(robot,PointContext.mijing_jinruzhandou.x,PointContext.mijing_jinruzhandou.y);
            if(isFinished.get()){
                break;
            }
        }

        ResetCloseUtil.closeAllWindows(robot);
        robot.delay(5000);
        moveMouseAndClick(robot,PointContext.mijing_likai.x,PointContext.mijing_likai.y);
    }
}
