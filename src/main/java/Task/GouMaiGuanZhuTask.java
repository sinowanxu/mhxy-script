package Task;

import Context.PointContext;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.concurrent.atomic.AtomicBoolean;

import static Util.MouseEventUtil.moveMouseAndClick;
import static Util.MouseEventUtil.moveMouseAndClick_quick;
import static Util.PointUtil.isContainColor_quick;

public class GouMaiGuanZhuTask {
    public static AtomicBoolean isFinished=new AtomicBoolean(false);
    public static void doGouMaiGuanZhu(final Robot robot)throws AWTException{
        new Thread(new Runnable() {
            public void run() {
                try {
                    Robot robot1=new Robot();
                    for(int i=0;i<1;i++){
                        robot1.delay(60000);
                    }
//                    robot1.delay(30000);
                    isFinished.set(true);
                }catch (AWTException e){
                    e.printStackTrace();
                }

            }
        }).start();
        while(true){
            if(!isFinished.get()){
//                robot.delay(500);
                moveMouseAndClick(robot,PointContext.guanzhu.x,PointContext.guanzhu.y);
                robot.delay(30);
                moveMouseAndClick(robot,PointContext.guanzhu_diyigewupin.x,PointContext.guanzhu_diyigewupin.y);
                robot.delay(500);
                moveMouseAndClick(robot,PointContext.guanzhu_goumai.x,PointContext.guanzhu_goumai.y);

//                moveMouseAndClick(robot,PointContext.guanzhu_queren.x,PointContext.guanzhu_queren.y);
                robot.mouseMove(PointContext.guanzhu_queren.x,PointContext.guanzhu_queren.y);
                robot.delay(500);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.delay(100);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robot.delay(100);
            }else {
                break;
            }

        }

    }


    public static void qianggou(Robot robot)throws AWTException{
        for(int i=0;i<10;i++){
            while(true){
                moveMouseAndClick_quick(robot,PointContext.guanzhu.x,PointContext.guanzhu.y);
                if(isContainColor_quick(PointContext.shangpinweixuanzhong.x,PointContext.shangpinweixuanzhong.y,PointContext.shangpinweixuanzhong_color)){
                    break;
                }
            }
            while(true){
                moveMouseAndClick_quick(robot,PointContext.shangpinweixuanzhong.x,PointContext.shangpinweixuanzhong.y);
                if(isContainColor_quick(PointContext.shangpinxuanzhong.x,PointContext.shangpinxuanzhong.y,PointContext.shangpinxuanzhong_color)){
                    break;
                }
            }
            while(true){
                moveMouseAndClick_quick(robot,PointContext.goumai.x,PointContext.goumai.y);
                if(isContainColor_quick(PointContext.shangpinqueren.x,PointContext.shangpinqueren.y,PointContext.shangpinqueren_color)){
                    break;
                }
            }

            while (true){
                moveMouseAndClick_quick(robot,PointContext.shangpinqueren.x,PointContext.shangpinqueren.y);
                if(!isContainColor_quick(PointContext.shangpinqueren.x,PointContext.shangpinqueren.y,PointContext.shangpinqueren_color)){
                    break;
                }
            }
        }



    }
}
