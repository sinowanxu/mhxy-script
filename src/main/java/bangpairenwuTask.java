import Context.PointContext;

import java.awt.*;

import static Task.XinHaoTask.doXinHaoTask;
import static Util.MouseEventUtil.moveMouseAndClick;
import static Util.MouseEventUtil.moveMouseAndClickRight;
import static Util.MouseEventUtil.moveMouseAndClick_quick;
import static Util.PointUtil.isContainColor_quick;

public class bangpairenwuTask {
    public static void main(String[] args) throws AWTException {
        PointContext.init();
        Robot robot = new Robot();
        robot.delay(5000);
        for (int i = 0; i < 6; i++) {
            MuMuTask.firstman(robot, i);
            doBangpaiTask(robot);
            MuMuTask.guanbimumu(robot);
        }
        // 下面是点加号的，先不用了
//        if(!isContainColor_quick(PointContext.mumu_jiahao.x,PointContext.mumu_jiahao.y,PointContext.mumu_jiahao_color)){
//            moveMouseAndClick(robot,PointContext.mumu_jiahao.x,PointContext.mumu_jiahao.y);
//        }
//        robot.delay(2000);
    }


    public static void doBangpaiTask(Robot robot) throws AWTException {

        // 下面是通过推送点任务
        moveMouseAndClick_quick(robot, PointContext.mumu_huodong.x, PointContext.huodong.y);
        robot.delay(2000);
        moveMouseAndClick_quick(robot, PointContext.mumu_huodongtuisong.x, PointContext.mumu_huodongtuisong.y);
        robot.delay(2000);
        moveMouseAndClick_quick(robot, PointContext.mumu_huodongcanjia1.x, PointContext.mumu_huodongcanjia1.y);
        robot.delay(5000);
        moveMouseAndClick_quick(robot, PointContext.mumu_huodongguanbi.x, PointContext.mumu_huodongguanbi.y);
        robot.delay(2000);
        // 点击帮派任务
        if (isContainColor_quick(PointContext.mumu_liuge1.x, PointContext.mumu_liuge1.y, PointContext.mumu_liuge1_color)) {
            moveMouseAndClick(robot, PointContext.mumu_liuge1.x, PointContext.mumu_liuge1.y);
            while (isContainColor_quick(PointContext.mumu_sige1.x, PointContext.mumu_sige1.y, PointContext.mumu_sige1_color)) {
                moveMouseAndClick(robot, PointContext.mumu_sige1.x, PointContext.mumu_sige1.y);
            }
            if (isContainColor_quick(PointContext.mumu_yige.x, PointContext.mumu_yige.y, PointContext.mumu_yige_color)) {
                moveMouseAndClick(robot, PointContext.mumu_yige.x, PointContext.mumu_yige.y);
            }
        } else if (isContainColor_quick(PointContext.mumu_wuge1.x, PointContext.mumu_wuge1.y, PointContext.mumu_wuge1_color)) {
            moveMouseAndClick(robot, PointContext.mumu_wuge1.x, PointContext.mumu_wuge1.y);
            while (isContainColor_quick(PointContext.mumu_sige1.x, PointContext.mumu_sige1.y, PointContext.mumu_sige1_color)) {
                moveMouseAndClick(robot, PointContext.mumu_sige1.x, PointContext.mumu_sige1.y);
            }
            if (isContainColor_quick(PointContext.mumu_yige.x, PointContext.mumu_yige.y, PointContext.mumu_yige_color)) {
                moveMouseAndClick(robot, PointContext.mumu_yige.x, PointContext.mumu_yige.y);
            }
        } else if (isContainColor_quick(PointContext.mumu_sige1.x, PointContext.mumu_sige1.y, PointContext.mumu_sige1_color)) {
            moveMouseAndClick(robot, PointContext.mumu_sige1.x, PointContext.mumu_sige1.y);
            while (isContainColor_quick(PointContext.mumu_sige1.x, PointContext.mumu_sige1.y, PointContext.mumu_sige1_color)) {
                moveMouseAndClick(robot, PointContext.mumu_sige1.x, PointContext.mumu_sige1.y);
            }
            if (isContainColor_quick(PointContext.mumu_yige.x, PointContext.mumu_yige.y, PointContext.mumu_yige_color)) {
                moveMouseAndClick(robot, PointContext.mumu_yige.x, PointContext.mumu_yige.y);
            }
        } else if (isContainColor_quick(PointContext.mumu_sange1.x, PointContext.mumu_sange1.y, PointContext.mumu_sange1_color)) {
            moveMouseAndClick(robot, PointContext.mumu_sange1.x, PointContext.mumu_sange1.y);
            while (isContainColor_quick(PointContext.mumu_sige1.x, PointContext.mumu_sige1.y, PointContext.mumu_sige1_color)) {
                moveMouseAndClick(robot, PointContext.mumu_sige1.x, PointContext.mumu_sige1.y);
            }
            if (isContainColor_quick(PointContext.mumu_yige.x, PointContext.mumu_yige.y, PointContext.mumu_yige_color)) {
                moveMouseAndClick(robot, PointContext.mumu_yige.x, PointContext.mumu_yige.y);
            }
        } else if (isContainColor_quick(PointContext.mumu_erge1.x, PointContext.mumu_erge1.y, PointContext.mumu_erge1_color)) {
            moveMouseAndClick(robot, PointContext.mumu_erge1.x, PointContext.mumu_erge1.y);
            while (isContainColor_quick(PointContext.mumu_sige1.x, PointContext.mumu_sige1.y, PointContext.mumu_sige1_color)) {
                moveMouseAndClick(robot, PointContext.mumu_sige1.x, PointContext.mumu_sige1.y);
            }
            if (isContainColor_quick(PointContext.mumu_yige.x, PointContext.mumu_yige.y, PointContext.mumu_yige_color)) {
                moveMouseAndClick(robot, PointContext.mumu_yige.x, PointContext.mumu_yige.y);
            }
        } else if (isContainColor_quick(PointContext.mumu_yige.x, PointContext.mumu_yige.y, PointContext.mumu_yige_color)) {
            moveMouseAndClick(robot, PointContext.mumu_yige.x, PointContext.mumu_yige.y);
            // 下面是师门答题的
            while (isContainColor_quick(PointContext.mumu_sige1.x, PointContext.mumu_sige1.y, PointContext.mumu_sige1_color)) {
                moveMouseAndClick(robot, PointContext.mumu_sige1.x, PointContext.mumu_sige1.y);
            }
        }

        doXinHaoTask(robot);

    }
}