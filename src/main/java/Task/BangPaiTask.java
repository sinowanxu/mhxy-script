package Task;

import Context.PointContext;
import Util.ResetCloseUtil;

import java.awt.*;
import java.util.concurrent.atomic.AtomicBoolean;

import static Task.XinHaoTask.clickN;
import static Util.MouseEventUtil.moveMouseAndClick;
import static Util.MouseEventUtil.moveMouseAndClickRight;
import static Util.PointUtil.isContainColor;

public class BangPaiTask {
    public static AtomicBoolean wancheng = new AtomicBoolean(false);

    public static void doBangPaiTask(Robot robot) throws AWTException {
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.jiahao.x, PointContext.jiahao.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.bangpai.x, PointContext.bangpai.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.huidaobangpai.x, PointContext.huidaobangpai.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.bangpai_guanbi.x, PointContext.bangpai_guanbi.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.bangpai_lingqu.x, PointContext.bangpai_lingqu.y);
        robot.delay(5000);
        moveMouseAndClick(robot, PointContext.shimen_sange1.x, PointContext.shimen_sange1.y);
        robot.delay(5000);
//
//        moveMouseAndClick(robot, PointContext.jiahao.x, PointContext.jiahao.y);
//        robot.delay(1000);
//
////        moveMouseAndClick(robot, PointContext.bangpai_qinglongtangrenwu.x, PointContext.bangpai_qinglongtangrenwu.y);
////        robot.delay(4000);
//        moveMouseAndClick(robot, PointContext.xiaoditu.x, PointContext.xiaoditu.y);
//        robot.delay(1000);
//        moveMouseAndClick(robot, PointContext.qinglongtangzongguan.x, PointContext.qinglongtangzongguan.y);
//        robot.delay(8000);
//        moveMouseAndClick(robot, PointContext.bangpai_lingqurenwu.x, PointContext.bangpai_lingqurenwu.y);
//        robot.delay(1000);
//        clickN(1);


        new Thread(new Runnable() {
            public void run() {
                try {
                    Robot robot = new Robot();
                    for (int i = 0; i < 100; i++) {
                        robot.delay(60000);
                    }
                    wancheng.set(true);

                } catch (AWTException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                try {
                    Robot robot = new Robot();
                    while (true){
                        robot.delay(60000);
                        moveMouseAndClick(robot,PointContext.xingchenzhilu_guanbi.x, PointContext.xingchenzhilu_guanbi.y);
                        moveMouseAndClickRight(robot,PointContext.xingchenzhilu_guanbi.x, PointContext.xingchenzhilu_guanbi.y);
                    }

                } catch (AWTException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        while(true){
            // 和师门属于同一个任务栏
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            robot.delay(3000);

            // 右键三下取消所有窗口
            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            moveMouseAndClick(robot, PointContext.shiyong.x, PointContext.shiyong.y);

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
            moveMouseAndClick(robot, PointContext.shimen_sange1.x, PointContext.shimen_sange1.y);
            moveMouseAndClick(robot, PointContext.shimen_yige1.x, PointContext.shimen_yige1.y);
            moveMouseAndClick(robot, PointContext.shangjiao.x, PointContext.shangjiao.y);
            moveMouseAndClick(robot, PointContext.shiyong.x, PointContext.shiyong.y);



            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            robot.delay(4000);
            moveMouseAndClick(robot, PointContext.shimen_erge1.x, PointContext.shimen_erge1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shimen_sige1.x, PointContext.shimen_sige1.y);
            moveMouseAndClick(robot, PointContext.shangjiao.x, PointContext.shangjiao.y);
            moveMouseAndClick(robot, PointContext.shiyong.x, PointContext.shiyong.y);

            // 右键三下取消所有窗口
            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            moveMouseAndClick(robot, PointContext.bangpai_fangcunshouxi.x, PointContext.bangpai_fangcunshouxi.y);

            // 右键2下取消所有窗口
            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            moveMouseAndClick(robot, PointContext.goumai.x, PointContext.goumai.y);

            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            moveMouseAndClick(robot, PointContext.bangpai_yuanshoucheng.x, PointContext.bangpai_yuanshoucheng.y);

            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            moveMouseAndClick(robot, PointContext.bangpai_qinglongtangzhuguan.x, PointContext.bangpai_qinglongtangzhuguan.y);


            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            moveMouseAndClick(robot, PointContext.bangpai_yunyoule.x, PointContext.bangpai_yunyoule.y);

            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            moveMouseAndClick(robot, PointContext.bangpai_qinglongtangzhuguan.x, PointContext.bangpai_qinglongtangzhuguan.y);
            moveMouseAndClick(robot, PointContext.bangpai_shangjiao.x, PointContext.bangpai_shangjiao.y);

            ResetCloseUtil.closeAllWindows(robot);
            moveMouseAndClick(robot, PointContext.shimen_renwulan1.x, PointContext.shimen_renwulan1.y);
            robot.delay(2000);
            moveMouseAndClick(robot, PointContext.bangpai_datangshouxi.x, PointContext.bangpai_datangshouxi.y);

            if(wancheng.get()){
                break;
            }
        }




    }
}
