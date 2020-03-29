package Task;

import Context.PointContext;
import Util.ChangeZhuZhanUtil;
import Util.ResetCloseUtil;

import java.awt.*;

import static Task.XinHaoTask.clickN;
import static Util.ColorUtil.getColor;
import static Util.MouseEventUtil.moveMouseAndClick;
import static Util.PointUtil.isContainColor;

public class FuBenTask {
    public static void doXiaShiFuBenTask(Robot robot) throws AWTException,InterruptedException {
//        ChangeZhuZhanUtil.changeTo1(robot);
//        robot.delay(1000);
//        moveMouseAndClick(robot, PointContext.ditu.x, PointContext.ditu.y);
//        robot.delay(3000);
//        moveMouseAndClick(robot, PointContext.changan.x, PointContext.changan.y);
//        robot.delay(3000);
//        moveMouseAndClick(robot, PointContext.xiaoditu.x, PointContext.xiaoditu.y);
//        robot.delay(3000);
//        moveMouseAndClick(robot, PointContext.fuben_baixiaoxianzi.x, PointContext.fuben_baixiaoxianzi.y);
//        robot.delay(6000);
//        moveMouseAndClick(robot, PointContext.fuben_xuanzefuben.x, PointContext.fuben_xuanzefuben.y);
//        robot.delay(1000);
//        moveMouseAndClick(robot, PointContext.fuben_xiashi.x, PointContext.fuben_xiashi.y);
//        robot.delay(1000);
//        moveMouseAndClick(robot, PointContext.xiashifuben_jinru.x, PointContext.xiashifuben_jinru.y);
//
//        // 切换窗口同意进入
//        moveMouseAndClick(robot, PointContext.xiashi_chuangkou11.x, PointContext.xiashi_chuangkou11.y);
//        moveMouseAndClick(robot, PointContext.xiashi_chuangkou12.x, PointContext.xiashi_chuangkou12.y);
//        moveMouseAndClick(robot, PointContext.xiashi_chuangkou13.x, PointContext.xiashi_chuangkou13.y);
//        moveMouseAndClick(robot, PointContext.xiashi_chuangkou21.x, PointContext.xiashi_chuangkou21.y);
//        moveMouseAndClick(robot, PointContext.xiashi_chuangkou22.x, PointContext.xiashi_chuangkou22.y);
//        moveMouseAndClick(robot, PointContext.xiashi_chuangkou01.x, PointContext.xiashi_chuangkou01.y);
//        moveMouseAndClick(robot, PointContext.xiashi_chuangkou02.x, PointContext.xiashi_chuangkou02.y);

        // 进入战斗
        moveMouseAndClick(robot, PointContext.xiashi_tiaoguojuqing.x, PointContext.xiashi_tiaoguojuqing.y);
        robot.delay(3000);
        moveMouseAndClick(robot, PointContext.xiashi_renwulan1.x, PointContext.xiashi_renwulan1.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.xiashi_jinruzhandou11.x, PointContext.xiashi_jinruzhandou11.y);
        robot.delay(5000);
        while(!isContainColor(PointContext.xiashi_zhandoujieshu.x,PointContext.xiashi_zhandoujieshu.y,PointContext.xiashi_zhandoujieshu_color)){
            Thread.sleep(1000);
        }
        moveMouseAndClick(robot, PointContext.xiashi_tiaoguojuqing.x, PointContext.xiashi_tiaoguojuqing.y);
        robot.delay(3000);
        moveMouseAndClick(robot, PointContext.xiashi_renwulan1.x, PointContext.xiashi_renwulan1.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.xiashi_jinruzhandou11.x, PointContext.xiashi_jinruzhandou11.y);
        robot.delay(5000);
        while(!isContainColor(PointContext.xiashi_zhandoujieshu.x,PointContext.xiashi_zhandoujieshu.y,PointContext.xiashi_zhandoujieshu_color)){
            Thread.sleep(1000);
        }

        moveMouseAndClick(robot, PointContext.xiashi_tiaoguojuqing.x, PointContext.xiashi_tiaoguojuqing.y);
        robot.delay(3000);
        moveMouseAndClick(robot, PointContext.xiashi_renwulan1.x, PointContext.xiashi_renwulan1.y);
        robot.delay(1000);
    }

    public static void doLvYanRuMengPuTongFuBenTask(Robot robot) throws AWTException,InterruptedException {
        ChangeZhuZhanUtil.changeTo2(robot);
        moveMouseAndClick(robot, PointContext.ditu.x, PointContext.ditu.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.changan.x, PointContext.changan.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.xiaoditu.x, PointContext.xiaoditu.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.fuben_baixiaoxianzi.x, PointContext.fuben_baixiaoxianzi.y);
        robot.delay(6000);
        moveMouseAndClick(robot, PointContext.fuben_xuanzefuben.x, PointContext.fuben_xuanzefuben.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.fuben_putong.x, PointContext.fuben_putong.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.fuben_jinru.x, PointContext.fuben_jinru.y);
        robot.delay(6000);

        moveMouseAndClick(robot, PointContext.xiashi_tiaoguojuqing.x, PointContext.xiashi_tiaoguojuqing.y);
        moveMouseAndClick(robot, PointContext.renwulan1.x, PointContext.renwulan1.y);
        robot.delay(6000);
        clickN(5);
        robot.delay(3000);
        moveMouseAndClick(robot,PointContext.fuben_jinruzhandou.x,PointContext.fuben_jinruzhandou.y);
        robot.delay(5000);
        while(!isContainColor(PointContext.fuben_zhandoujieshu.x,PointContext.fuben_zhandoujieshu.y,PointContext.fuben_zhandoujieshu_color)){
            Thread.sleep(2000);
        }

        robot.delay(5000);
        moveMouseAndClick(robot, PointContext.xiashi_tiaoguojuqing.x, PointContext.xiashi_tiaoguojuqing.y);
        robot.delay(5000);
        moveMouseAndClick(robot, PointContext.renwulan1.x, PointContext.renwulan1.y);
        robot.delay(10000);

        moveMouseAndClick(robot,PointContext.fuben_jinruzhandou.x,PointContext.fuben_jinruzhandou.y);
        robot.delay(5000);
        while(!isContainColor(PointContext.fuben_zhandoujieshu.x,PointContext.fuben_zhandoujieshu.y,PointContext.fuben_zhandoujieshu_color)){
            Thread.sleep(2000);
        }

        robot.delay(3000);
        moveMouseAndClick(robot, PointContext.xiashi_tiaoguojuqing.x, PointContext.xiashi_tiaoguojuqing.y);
        robot.delay(5000);
        moveMouseAndClick(robot, PointContext.renwulan1.x, PointContext.renwulan1.y);
        robot.delay(10000);
        moveMouseAndClick(robot,PointContext.fuben_jinruzhandou.x,PointContext.fuben_jinruzhandou.y);
        robot.delay(5000);
        while(!isContainColor(PointContext.fuben_zhandoujieshu.x,PointContext.fuben_zhandoujieshu.y,PointContext.fuben_zhandoujieshu_color)){
            Thread.sleep(2000);
        }
        robot.delay(1000);
        clickN(5);
        robot.delay(10000);
        ResetCloseUtil.closeAllWindows(robot);
        moveMouseAndClick(robot, PointContext.renwulan1.x, PointContext.renwulan1.y);
//        clickTaskAndStartFight(robot);


    }


    public static void doLiuLiSuiPuTongFuBenTask(Robot robot) throws AWTException,InterruptedException {
        ChangeZhuZhanUtil.changeTo2(robot);
        moveMouseAndClick(robot, PointContext.ditu.x, PointContext.ditu.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.changan.x, PointContext.changan.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.xiaoditu.x, PointContext.xiaoditu.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.fuben_baixiaoxianzi.x, PointContext.fuben_baixiaoxianzi.y);
        robot.delay(5000);
        moveMouseAndClick(robot, PointContext.fuben_xuanzefuben.x, PointContext.fuben_xuanzefuben.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.fuben_putong.x, PointContext.fuben_putong.y);
        robot.delay(1000);
        moveMouseAndClick(robot, PointContext.fuben_jinru2.x, PointContext.fuben_jinru2.y);
        robot.delay(6000);


        moveMouseAndClick(robot, PointContext.xiashi_tiaoguojuqing.x, PointContext.xiashi_tiaoguojuqing.y);
        robot.delay(10000);
        moveMouseAndClick(robot, PointContext.renwulan1.x, PointContext.renwulan1.y);
        robot.delay(10000);
        moveMouseAndClick(robot,PointContext.fuben_jinruzhandou.x,PointContext.fuben_jinruzhandou.y);
        robot.delay(5000);
        while(!isContainColor(PointContext.fuben_zhandoujieshu.x,PointContext.fuben_zhandoujieshu.y,PointContext.fuben_zhandoujieshu_color)){
            Thread.sleep(2000);
        }


        robot.delay(2000);
        moveMouseAndClick(robot, PointContext.xiashi_tiaoguojuqing.x, PointContext.xiashi_tiaoguojuqing.y);
        robot.delay(5000);
        moveMouseAndClick(robot, PointContext.renwulan1.x, PointContext.renwulan1.y);
        robot.delay(10000);
        clickN(5);
        robot.delay(5000);
        while(!isContainColor(PointContext.fuben_zhandoujieshu.x,PointContext.fuben_zhandoujieshu.y,PointContext.fuben_zhandoujieshu_color)){
            Thread.sleep(2000);
        }

        robot.delay(10000);
        moveMouseAndClick(robot, PointContext.xiashi_tiaoguojuqing.x, PointContext.xiashi_tiaoguojuqing.y);
        robot.delay(5000);
        moveMouseAndClick(robot, PointContext.renwulan1.x, PointContext.renwulan1.y);
        robot.delay(10000);
        moveMouseAndClick(robot,PointContext.fuben_jinruzhandou.x,PointContext.fuben_jinruzhandou.y);
        robot.delay(5000);
        while(!isContainColor(PointContext.fuben_zhandoujieshu.x,PointContext.fuben_zhandoujieshu.y,PointContext.fuben_zhandoujieshu_color)){
            Thread.sleep(2000);
        }
        robot.delay(10000);
        moveMouseAndClick(robot, PointContext.xiashi_tiaoguojuqing.x, PointContext.xiashi_tiaoguojuqing.y);

        robot.delay(10000);
        ResetCloseUtil.closeAllWindows(robot);
        moveMouseAndClick(robot, PointContext.renwulan1.x, PointContext.renwulan1.y);

    }


//    private static void clickTaskAndStartFight(Robot robot) throws AWTException {
//        Thread t = new Thread(new Runnable() {
//            public void run() {
//                try {
//                    Robot robot = new Robot();
//                    while (true) {
//                        robot.delay(3000);
//                        if (isContainColor(PointContext.fuben_tiaoguojuqing.x, PointContext.fuben_tiaoguojuqing.y, PointContext.fuben_tiaoguojuqing_color)) {
//                            moveMouseAndClick(robot, PointContext.fuben_tiaoguojuqing_zhenshiweizhi.x, PointContext.fuben_tiaoguojuqing_zhenshiweizhi.y);
//                        }
//                        if (isContainColor(PointContext.paihang.x, PointContext.paihang.y, PointContext.paihang_color)) {
//                            break;
//                        }
//                    }
//
//                } catch (AWTException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        });
//        t.start();
//        while (true) {
//            robot.delay(1000);
//            moveMouseAndClick(robot, PointContext.renwulan1.x, PointContext.renwulan1.y);
//            robot.delay(1000);
//            if (isContainColor(PointContext.fuben_jinruzhandou.x, PointContext.fuben_jinruzhandou.y, PointContext.fuben_jinruzhandou_color)) {
//                moveMouseAndClick(robot, PointContext.fuben_jinruzhandou.x, PointContext.fuben_jinruzhandou.y);
//            } else if (isContainColor(PointContext.paihang.x, PointContext.paihang.y, PointContext.paihang_color)) {
//                break;
//            }
//            for (int i = 0; i < 6; i++) {
//                moveMouseAndClick(robot, PointContext.renwulan1.x, PointContext.renwulan1.y);
//            }
//
//
//        }
//
//
//    }

    public static void delayMinute(int n) throws AWTException{
        Robot robot=new Robot();
        for(int i=0;i<n;i++){
            robot.delay(60000);
        }
    }
}
