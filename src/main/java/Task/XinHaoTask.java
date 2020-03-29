package Task;

import Context.PointContext;
import Util.ColorUtil;
import Util.ResetCloseUtil;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.atomic.AtomicBoolean;

import static Util.MouseEventUtil.*;
import static Util.PointUtil.isContainColor;
import static Util.PointUtil.isContainColor_quick;

public class XinHaoTask {
    public static AtomicBoolean isFinished=new AtomicBoolean(false);
    public static void doXinHaoTask(final Robot robot) throws AWTException {
        PointContext.init();
        isFinished.set(false);
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000*60*240);
                    isFinished.set(true);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }


            }
        }).start();
        // 新号任务

        new Thread(new Runnable() {
            public void run() {
                boolean jineng_flag=false;
                boolean zhuzhan_flag=false;
                while(true){
                    try {
                        if (isContainColor_quick(PointContext.mumu_woyoujingyan.x, PointContext.mumu_woyoujingyan.y, PointContext.mumu_woyoujingyan_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_woyoujingyan.x, PointContext.mumu_woyoujingyan.y);
                        }
                        if (isContainColor_quick(PointContext.mumu_shanghuigoumai.x, PointContext.mumu_shanghuigoumai.y, PointContext.mumu_shanghuigoumai_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_shanghuigoumai.x, PointContext.mumu_shanghuigoumai.y);
                        }
                        if (isContainColor_quick(PointContext.mumu_baitangoumai.x, PointContext.mumu_baitangoumai.y, PointContext.mumu_baitangoumai_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_baitangoumai.x, PointContext.mumu_baitangoumai.y);
                        }
                        if (isContainColor_quick(PointContext.mumu_shimenrenwu1.x, PointContext.mumu_shimenrenwu1.y, PointContext.mumu_shimenrenwu1_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_shimenrenwu1.x, PointContext.mumu_shimenrenwu1.y);
                        }else if (isContainColor_quick(PointContext.mumu_shimenrenwu2.x, PointContext.mumu_shimenrenwu2.y, PointContext.mumu_shimenrenwu2_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_shimenrenwu2.x, PointContext.mumu_shimenrenwu2.y);
                        }else if (isContainColor_quick(PointContext.mumu_shimenrenwu3.x, PointContext.mumu_shimenrenwu3.y, PointContext.mumu_shimenrenwu3_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_shimenrenwu3.x, PointContext.mumu_shimenrenwu3.y);
                        } else if (isContainColor_quick(PointContext.mumu_shimenrenwu4.x, PointContext.mumu_shimenrenwu4.y, PointContext.mumu_shimenrenwu4_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_shimenrenwu4.x, PointContext.mumu_shimenrenwu4.y);
                        }else if (isContainColor_quick(PointContext.mumu_shimenrenwu5.x, PointContext.mumu_shimenrenwu5.y, PointContext.mumu_shimenrenwu5_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_shimenrenwu5.x, PointContext.mumu_shimenrenwu5.y);
                        }else if (isContainColor_quick(PointContext.mumu_shimenrenwu6.x, PointContext.mumu_shimenrenwu6.y, PointContext.mumu_shimenrenwu6_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_shimenrenwu6.x, PointContext.mumu_shimenrenwu6.y);
                        }else if (isContainColor_quick(PointContext.mumu_shimenrenwu7.x, PointContext.mumu_shimenrenwu7.y, PointContext.mumu_shimenrenwu7_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_shimenrenwu7.x, PointContext.mumu_shimenrenwu7.y);
                        }


                        if (isContainColor_quick(PointContext.mumu_shimenguanbi.x, PointContext.mumu_shimenguanbi.y, PointContext.mumu_shimenguanbi_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_shimenguanbi.x, PointContext.mumu_shimenguanbi.y);
                        }

                        if (isContainColor_quick(PointContext.mumu_toutouguaiguanbi.x, PointContext.mumu_toutouguaiguanbi.y, PointContext.mumu_toutouguaiguanbi_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_toutouguaiguanbi.x, PointContext.mumu_toutouguaiguanbi.y);
                        }


                        if (isContainColor_quick(PointContext.mumu_yijixinshoulibao.x, PointContext.mumu_yijixinshoulibao.y, PointContext.mumu_yijixinshoulibao_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_yijixinshoulibao.x, PointContext.mumu_yijixinshoulibao.y);
                            robot.delay(5000);
                            moveMouseAndClick(robot, PointContext.mumu_guanbifuli.x, PointContext.mumu_guanbifuli.y);
                        }
                        if (isContainColor_quick(PointContext.mumu_lingqushengjijiangli.x, PointContext.mumu_lingqushengjijiangli.y, PointContext.mumu_lingqushengjijiangli_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_lingqushengjijiangli.x, PointContext.mumu_lingqushengjijiangli.y);
                            robot.delay(5000);
                            moveMouseAndClick(robot, PointContext.mumu_guanbifuli.x, PointContext.mumu_guanbifuli.y);
                        }

                        if (isContainColor_quick(PointContext.mumu_zhupanduan.x, PointContext.mumu_zhupanduan.y, PointContext.mumu_zhupanduan_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_zhu.x, PointContext.mumu_zhu.y);
                        }

                        if (isContainColor_quick(PointContext.mumu_jineng.x, PointContext.mumu_jineng.y, PointContext.mumu_jineng_color)&&!jineng_flag) {
                            moveMouseAndClick(robot, PointContext.mumu_jineng.x, PointContext.mumu_jineng.y);
                            robot.delay(2000);
                            moveMouseAndClick(robot, PointContext.mumu_yijianshengji.x, PointContext.mumu_yijianshengji.y);
                            robot.delay(2000);
                            moveMouseAndClick(robot, PointContext.mumu_guanbijineng.x, PointContext.mumu_guanbijineng.y);
                            jineng_flag=true;
                        }

                        if (isContainColor_quick(PointContext.mumu_zhuzhan.x, PointContext.mumu_zhuzhan.y, PointContext.mumu_zhuzhan_color)&&!zhuzhan_flag) {
                            moveMouseAndClick(robot, PointContext.mumu_zhuzhan.x, PointContext.mumu_zhuzhan.y);
                            robot.delay(2000);
                            moveMouseAndClick(robot, PointContext.mumu_zhuzhandierge.x, PointContext.mumu_zhuzhandierge.y);
                            robot.delay(2000);
                            moveMouseAndClick(robot, PointContext.mumu_zhuzhanshangzhen.x, PointContext.mumu_zhuzhanshangzhen.y);
                            robot.delay(2000);
                            moveMouseAndClick(robot, PointContext.mumu_zhuzhanjiahao.x, PointContext.mumu_zhuzhanjiahao.y);
                            robot.delay(2000);
                            moveMouseAndClick(robot, PointContext.mumu_zhuzhandierge.x, PointContext.mumu_zhuzhandierge.y);
                            robot.delay(2000);
                            moveMouseAndClick(robot, PointContext.mumu_zhuzhanguanbi.x, PointContext.mumu_zhuzhanguanbi.y);
                            zhuzhan_flag=true;
                        }

                        if(isContainColor_quick(PointContext.mumu_paobiaoquxiao.x, PointContext.mumu_paobiaoquxiao.y, PointContext.mumu_paobiaoquxiao_color)){
                            moveMouseAndClick_quick(robot,PointContext.mumu_paobiaoquxiao.x,PointContext.mumu_paobiaoquxiao.y);
                        }

                        if (isContainColor_quick(PointContext.mumu_fuliguanbi.x, PointContext.mumu_fuliguanbi.y, PointContext.mumu_fuliguanbi_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_fuliguanbi.x, PointContext.mumu_fuliguanbi.y);
                        }

                        if (isContainColor_quick(PointContext.mumu_juanxianbanggongClose.x, PointContext.mumu_juanxianbanggongClose.y, PointContext.mumu_juanxianbanggongClose_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_juanxianbanggongClose.x, PointContext.mumu_juanxianbanggongClose.y);
                        }
                        if (isContainColor_quick(PointContext.mumu_sanjieqinyouClose.x, PointContext.mumu_sanjieqinyouClose.y, PointContext.mumu_sanjieqinyouClose_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_sanjieqinyouClose.x, PointContext.mumu_sanjieqinyouClose.y);
                        }
                        if (isContainColor_quick(PointContext.mumu_jinru1Close.x, PointContext.mumu_jinru1Close.y, PointContext.mumu_jinru1Close_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_jinru1Close.x, PointContext.mumu_jinru1Close.y);
                        }

                        if (isContainColor_quick(PointContext.mumu_chongwuClose.x, PointContext.mumu_chongwuClose.y, PointContext.mumu_chongwuClose_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_chongwuClose.x, PointContext.mumu_chongwuClose.y);
                        }
                        if (isContainColor_quick(PointContext.mumu_xingxiushouceClose.x, PointContext.mumu_xingxiushouceClose.y, PointContext.mumu_xingxiushouceClose_color)) {
                            moveMouseAndClick(robot, PointContext.mumu_xingxiushouceClose.x, PointContext.mumu_xingxiushouceClose.y);
                        }

        //                        if (isContainColor_quick(PointContext.mumu_sanjieqiyuan.x, PointContext.mumu_sanjieqiyuan.y, PointContext.mumu_sanjieqiyuan_color)) {
        //                            moveMouseAndClick(robot, PointContext.mumu_sanjieqiyuan.x, PointContext.mumu_sanjieqiyuan.y);
        //                        }

                        if(isFinished.get()){
                            break;
                        }
                    }catch (AWTException e){
                        e.printStackTrace();
                    }

                }
            }
        }).start();

        mouseWheel(robot,PointContext.mumu_diyigerenwu,-2000);
        robot.delay(2000);
        mouseWheel(robot,PointContext.mumu_diyigerenwu,-2000);
        robot.delay(2000);
        mouseWheel(robot,PointContext.mumu_diyigerenwu,-2000);
        robot.delay(2000);

        while (true) {
            int color1 = ColorUtil.getColor(PointContext.mumu_diyigerenwu.x, PointContext.mumu_diyigerenwu.y).getRGB();
            int color12 = ColorUtil.getColor(PointContext.mumu_goumai.x, PointContext.mumu_goumai.y).getRGB();
            int color13 = ColorUtil.getColor(PointContext.mumu_sige1.x, PointContext.mumu_sige1.y).getRGB();
            moveMouseAndClick(robot, PointContext.mumu_diyigerenwu.x, PointContext.mumu_diyigerenwu.y);
            robot.delay(2000);
            int color2 = ColorUtil.getColor(PointContext.mumu_diyigerenwu.x, PointContext.mumu_diyigerenwu.y).getRGB();
            int color22 = ColorUtil.getColor(PointContext.mumu_goumai.x, PointContext.mumu_goumai.y).getRGB();
            int color23 = ColorUtil.getColor(PointContext.mumu_sige1.x, PointContext.mumu_sige1.y).getRGB();

           xinhaozhutiTask(robot);

            if (color1 == color2|| color12==color22||color13==color23) {
                moveMouseAndClick(robot, PointContext.mumu_diergerenwu.x, PointContext.mumu_diergerenwu.y);
                robot.delay(2000);
            }
            xinhaozhutiTask(robot);
            if(isFinished.get()){
                break;
            }
        }

    }

    public static void doXinHaoWinClose(Robot robot,boolean jineng_flag,boolean zhuzhan_flag)throws AWTException{
        if (isContainColor_quick(PointContext.mumu_woyoujingyan.x, PointContext.mumu_woyoujingyan.y, PointContext.mumu_woyoujingyan_color)) {
            moveMouseAndClick(robot, PointContext.mumu_woyoujingyan.x, PointContext.mumu_woyoujingyan.y);
        }
        if (isContainColor_quick(PointContext.mumu_shanghuigoumai.x, PointContext.mumu_shanghuigoumai.y, PointContext.mumu_shanghuigoumai_color)) {
            moveMouseAndClick(robot, PointContext.mumu_shanghuigoumai.x, PointContext.mumu_shanghuigoumai.y);
        }
        if (isContainColor_quick(PointContext.mumu_baitangoumai.x, PointContext.mumu_baitangoumai.y, PointContext.mumu_baitangoumai_color)) {
            moveMouseAndClick(robot, PointContext.mumu_baitangoumai.x, PointContext.mumu_baitangoumai.y);
        }
        if (isContainColor_quick(PointContext.mumu_shimenrenwu1.x, PointContext.mumu_shimenrenwu1.y, PointContext.mumu_shimenrenwu1_color)) {
            moveMouseAndClick(robot, PointContext.mumu_shimenrenwu1.x, PointContext.mumu_shimenrenwu1.y);
        }else if (isContainColor_quick(PointContext.mumu_shimenrenwu2.x, PointContext.mumu_shimenrenwu2.y, PointContext.mumu_shimenrenwu2_color)) {
            moveMouseAndClick(robot, PointContext.mumu_shimenrenwu2.x, PointContext.mumu_shimenrenwu2.y);
        }else if (isContainColor_quick(PointContext.mumu_shimenrenwu3.x, PointContext.mumu_shimenrenwu3.y, PointContext.mumu_shimenrenwu3_color)) {
            moveMouseAndClick(robot, PointContext.mumu_shimenrenwu3.x, PointContext.mumu_shimenrenwu3.y);
        } else if (isContainColor_quick(PointContext.mumu_shimenrenwu4.x, PointContext.mumu_shimenrenwu4.y, PointContext.mumu_shimenrenwu4_color)) {
            moveMouseAndClick(robot, PointContext.mumu_shimenrenwu4.x, PointContext.mumu_shimenrenwu4.y);
        }else if (isContainColor_quick(PointContext.mumu_shimenrenwu5.x, PointContext.mumu_shimenrenwu5.y, PointContext.mumu_shimenrenwu5_color)) {
            moveMouseAndClick(robot, PointContext.mumu_shimenrenwu5.x, PointContext.mumu_shimenrenwu5.y);
        }else if (isContainColor_quick(PointContext.mumu_shimenrenwu6.x, PointContext.mumu_shimenrenwu6.y, PointContext.mumu_shimenrenwu6_color)) {
            moveMouseAndClick(robot, PointContext.mumu_shimenrenwu6.x, PointContext.mumu_shimenrenwu6.y);
        }else if (isContainColor_quick(PointContext.mumu_shimenrenwu7.x, PointContext.mumu_shimenrenwu7.y, PointContext.mumu_shimenrenwu7_color)) {
            moveMouseAndClick(robot, PointContext.mumu_shimenrenwu7.x, PointContext.mumu_shimenrenwu7.y);
        }

        if (isContainColor_quick(PointContext.mumu_shimenguanbi.x, PointContext.mumu_shimenguanbi.y, PointContext.mumu_shimenguanbi_color)) {
            moveMouseAndClick(robot, PointContext.mumu_shimenguanbi.x, PointContext.mumu_shimenguanbi.y);
        }

        if (isContainColor_quick(PointContext.mumu_toutouguaiguanbi.x, PointContext.mumu_toutouguaiguanbi.y, PointContext.mumu_toutouguaiguanbi_color)) {
            moveMouseAndClick(robot, PointContext.mumu_toutouguaiguanbi.x, PointContext.mumu_toutouguaiguanbi.y);
        }


        if (isContainColor_quick(PointContext.mumu_yijixinshoulibao.x, PointContext.mumu_yijixinshoulibao.y, PointContext.mumu_yijixinshoulibao_color)) {
            moveMouseAndClick(robot, PointContext.mumu_yijixinshoulibao.x, PointContext.mumu_yijixinshoulibao.y);
            robot.delay(5000);
            moveMouseAndClick(robot, PointContext.mumu_guanbifuli.x, PointContext.mumu_guanbifuli.y);
        }
        if (isContainColor_quick(PointContext.mumu_lingqushengjijiangli.x, PointContext.mumu_lingqushengjijiangli.y, PointContext.mumu_lingqushengjijiangli_color)) {
            moveMouseAndClick(robot, PointContext.mumu_lingqushengjijiangli.x, PointContext.mumu_lingqushengjijiangli.y);
            robot.delay(5000);
            moveMouseAndClick(robot, PointContext.mumu_guanbifuli.x, PointContext.mumu_guanbifuli.y);
        }

        if (isContainColor_quick(PointContext.mumu_zhupanduan.x, PointContext.mumu_zhupanduan.y, PointContext.mumu_zhupanduan_color)) {
            moveMouseAndClick(robot, PointContext.mumu_zhu.x, PointContext.mumu_zhu.y);
        }

        if (isContainColor_quick(PointContext.mumu_jineng.x, PointContext.mumu_jineng.y, PointContext.mumu_jineng_color)&&!jineng_flag) {
            moveMouseAndClick(robot, PointContext.mumu_jineng.x, PointContext.mumu_jineng.y);
            robot.delay(2000);
            moveMouseAndClick(robot, PointContext.mumu_yijianshengji.x, PointContext.mumu_yijianshengji.y);
            robot.delay(2000);
            moveMouseAndClick(robot, PointContext.mumu_guanbijineng.x, PointContext.mumu_guanbijineng.y);
            jineng_flag=true;
        }

        if (isContainColor_quick(PointContext.mumu_zhuzhan.x, PointContext.mumu_zhuzhan.y, PointContext.mumu_zhuzhan_color)&&!zhuzhan_flag) {
            moveMouseAndClick(robot, PointContext.mumu_zhuzhan.x, PointContext.mumu_zhuzhan.y);
            robot.delay(2000);
            moveMouseAndClick(robot, PointContext.mumu_zhuzhandierge.x, PointContext.mumu_zhuzhandierge.y);
            robot.delay(2000);
            moveMouseAndClick(robot, PointContext.mumu_zhuzhanshangzhen.x, PointContext.mumu_zhuzhanshangzhen.y);
            robot.delay(2000);
            moveMouseAndClick(robot, PointContext.mumu_zhuzhanjiahao.x, PointContext.mumu_zhuzhanjiahao.y);
            robot.delay(2000);
            moveMouseAndClick(robot, PointContext.mumu_zhuzhandierge.x, PointContext.mumu_zhuzhandierge.y);
            robot.delay(2000);
            moveMouseAndClick(robot, PointContext.mumu_zhuzhanguanbi.x, PointContext.mumu_zhuzhanguanbi.y);
            zhuzhan_flag=true;
        }

        if(isContainColor_quick(PointContext.mumu_paobiaoquxiao.x, PointContext.mumu_paobiaoquxiao.y, PointContext.mumu_paobiaoquxiao_color)){
            moveMouseAndClick_quick(robot,PointContext.mumu_paobiaoquxiao.x,PointContext.mumu_paobiaoquxiao.y);
        }

        if (isContainColor_quick(PointContext.mumu_fuliguanbi.x, PointContext.mumu_fuliguanbi.y, PointContext.mumu_fuliguanbi_color)) {
            moveMouseAndClick(robot, PointContext.mumu_fuliguanbi.x, PointContext.mumu_fuliguanbi.y);
        }

        if (isContainColor_quick(PointContext.mumu_juanxianbanggongClose.x, PointContext.mumu_juanxianbanggongClose.y, PointContext.mumu_juanxianbanggongClose_color)) {
            moveMouseAndClick(robot, PointContext.mumu_juanxianbanggongClose.x, PointContext.mumu_juanxianbanggongClose.y);
        }
        if (isContainColor_quick(PointContext.mumu_sanjieqinyouClose.x, PointContext.mumu_sanjieqinyouClose.y, PointContext.mumu_sanjieqinyouClose_color)) {
            moveMouseAndClick(robot, PointContext.mumu_sanjieqinyouClose.x, PointContext.mumu_sanjieqinyouClose.y);
        }
        if (isContainColor_quick(PointContext.mumu_jinru1Close.x, PointContext.mumu_jinru1Close.y, PointContext.mumu_jinru1Close_color)) {
            moveMouseAndClick(robot, PointContext.mumu_jinru1Close.x, PointContext.mumu_jinru1Close.y);
        }

        if (isContainColor_quick(PointContext.mumu_chongwuClose.x, PointContext.mumu_chongwuClose.y, PointContext.mumu_chongwuClose_color)) {
            moveMouseAndClick(robot, PointContext.mumu_chongwuClose.x, PointContext.mumu_chongwuClose.y);
        }
        if (isContainColor_quick(PointContext.mumu_xingxiushouceClose.x, PointContext.mumu_xingxiushouceClose.y, PointContext.mumu_xingxiushouceClose_color)) {
            moveMouseAndClick(robot, PointContext.mumu_xingxiushouceClose.x, PointContext.mumu_xingxiushouceClose.y);
        }

    }

    public static void xinhaozhutiTask(Robot robot)throws  AWTException{
        if (isContainColor_quick(PointContext.mumu_shiyong.x, PointContext.mumu_shiyong.y, PointContext.mumu_shiyong_color)) {
            moveMouseAndClick(robot, PointContext.mumu_shiyong.x, PointContext.mumu_shiyong.y);
        }
        if (isContainColor_quick(PointContext.mumu_quxiaosanjieqiyuan.x, PointContext.mumu_quxiaosanjieqiyuan.y, PointContext.mumu_quxiaosanjieqiyuan_color)) {
            moveMouseAndClick(robot, PointContext.mumu_quxiaosanjieqiyuan.x, PointContext.mumu_quxiaosanjieqiyuan.y);
        }
        if (isContainColor_quick(PointContext.mumu_shifujinlile.x, PointContext.mumu_shifujinlile.y, PointContext.mumu_shifujinlile_color)) {
            moveMouseAndClick(robot, PointContext.mumu_shifujinlile.x, PointContext.mumu_shifujinlile.y);
        }
        if (isContainColor_quick(PointContext.mumu_canrenjujue.x, PointContext.mumu_canrenjujue.y, PointContext.mumu_canrenjujue_color)) {
            moveMouseAndClick(robot, PointContext.mumu_canrenjujue.x, PointContext.mumu_canrenjujue.y);
        }
        if (isContainColor_quick(PointContext.mumu_juqingheikuang.x, PointContext.mumu_juqingheikuang.y, PointContext.mumu_juqingheikuang_color)) {
            clickN_mumu(5);
        }

        if (isContainColor_quick(PointContext.mumu_baotuhongcha.x, PointContext.mumu_baotuhongcha.y, PointContext.mumu_baotuhongcha_color)) {
            moveMouseAndClick(robot, PointContext.mumu_baotuhongcha.x, PointContext.mumu_baotuhongcha.y);
        }
        if (isContainColor_quick(PointContext.mumu_goumai.x, PointContext.mumu_goumai.y, PointContext.mumu_goumai_color)) {
            moveMouseAndClick(robot, PointContext.mumu_goumai.x, PointContext.mumu_goumai.y);
        } else if (isContainColor_quick(PointContext.mumu_goumai2.x, PointContext.mumu_goumai2.y, PointContext.mumu_goumai2_color)) {
            moveMouseAndClick(robot, PointContext.mumu_goumai2.x, PointContext.mumu_goumai2.y);
        }
        if (isContainColor_quick(PointContext.mumu_shangjiao.x, PointContext.mumu_shangjiao.y, PointContext.mumu_shangjiao_color)) {
            moveMouseAndClick(robot, PointContext.mumu_shangjiao.x, PointContext.mumu_shangjiao.y);
        } else if (isContainColor_quick(PointContext.mumu_shangjiao2.x, PointContext.mumu_shangjiao2.y, PointContext.mumu_shangjiao2_color)) {
            moveMouseAndClick(robot, PointContext.mumu_shangjiao2.x, PointContext.mumu_shangjiao2.y);
        }
        if(isContainColor_quick(PointContext.mumu_liuge1.x, PointContext.mumu_liuge1.y, PointContext.mumu_liuge1_color)){
            moveMouseAndClick(robot, PointContext.mumu_liuge1.x, PointContext.mumu_liuge1.y);
            while (isContainColor_quick(PointContext.mumu_sige1.x, PointContext.mumu_sige1.y, PointContext.mumu_sige1_color)) {
                moveMouseAndClick(robot, PointContext.mumu_sige1.x, PointContext.mumu_sige1.y);
            }
            if(isContainColor_quick(PointContext.mumu_yige.x, PointContext.mumu_yige.y, PointContext.mumu_yige_color)){
                moveMouseAndClick(robot, PointContext.mumu_yige.x, PointContext.mumu_yige.y);
            }
        }else if(isContainColor_quick(PointContext.mumu_wuge1.x, PointContext.mumu_wuge1.y, PointContext.mumu_wuge1_color)){
            moveMouseAndClick(robot, PointContext.mumu_wuge1.x, PointContext.mumu_wuge1.y);
            while (isContainColor_quick(PointContext.mumu_sige1.x, PointContext.mumu_sige1.y, PointContext.mumu_sige1_color)) {
                moveMouseAndClick(robot, PointContext.mumu_sige1.x, PointContext.mumu_sige1.y);
            }
            if(isContainColor_quick(PointContext.mumu_yige.x, PointContext.mumu_yige.y, PointContext.mumu_yige_color)){
                moveMouseAndClick(robot, PointContext.mumu_yige.x, PointContext.mumu_yige.y);
            }
        }else if(isContainColor_quick(PointContext.mumu_sige1.x, PointContext.mumu_sige1.y, PointContext.mumu_sige1_color)){
            moveMouseAndClick(robot, PointContext.mumu_sige1.x, PointContext.mumu_sige1.y);
            while (isContainColor_quick(PointContext.mumu_sige1.x, PointContext.mumu_sige1.y, PointContext.mumu_sige1_color)) {
                moveMouseAndClick(robot, PointContext.mumu_sige1.x, PointContext.mumu_sige1.y);
            }
            if(isContainColor_quick(PointContext.mumu_yige.x, PointContext.mumu_yige.y, PointContext.mumu_yige_color)){
                moveMouseAndClick(robot, PointContext.mumu_yige.x, PointContext.mumu_yige.y);
            }
        }else if(isContainColor_quick(PointContext.mumu_sange1.x, PointContext.mumu_sange1.y, PointContext.mumu_sange1_color)){
            moveMouseAndClick(robot, PointContext.mumu_sange1.x, PointContext.mumu_sange1.y);
            while (isContainColor_quick(PointContext.mumu_sige1.x, PointContext.mumu_sige1.y, PointContext.mumu_sige1_color)) {
                moveMouseAndClick(robot, PointContext.mumu_sige1.x, PointContext.mumu_sige1.y);
            }
            if(isContainColor_quick(PointContext.mumu_yige.x, PointContext.mumu_yige.y, PointContext.mumu_yige_color)){
                moveMouseAndClick(robot, PointContext.mumu_yige.x, PointContext.mumu_yige.y);
            }
        }else if(isContainColor_quick(PointContext.mumu_erge1.x, PointContext.mumu_erge1.y, PointContext.mumu_erge1_color)){
            moveMouseAndClick(robot, PointContext.mumu_erge1.x, PointContext.mumu_erge1.y);
            while (isContainColor_quick(PointContext.mumu_sige1.x, PointContext.mumu_sige1.y, PointContext.mumu_sige1_color)) {
                moveMouseAndClick(robot, PointContext.mumu_sige1.x, PointContext.mumu_sige1.y);
            }
            if(isContainColor_quick(PointContext.mumu_yige.x, PointContext.mumu_yige.y, PointContext.mumu_yige_color)){
                moveMouseAndClick(robot, PointContext.mumu_yige.x, PointContext.mumu_yige.y);
            }
        }else if (isContainColor_quick(PointContext.mumu_yige.x, PointContext.mumu_yige.y, PointContext.mumu_yige_color)) {
            moveMouseAndClick(robot, PointContext.mumu_yige.x, PointContext.mumu_yige.y);
            // 下面是师门答题的
            while (isContainColor_quick(PointContext.mumu_sige1.x, PointContext.mumu_sige1.y, PointContext.mumu_sige1_color)) {
                moveMouseAndClick(robot, PointContext.mumu_sige1.x, PointContext.mumu_sige1.y);
            }
        }
    }

    public static void GetTask(Robot robot)throws AWTException{
        // 领取宝图任务

    }


    public static void clickN(int n) throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < n; i++) {
            // 跳过剧情位置
            moveMouseAndClick_quick(robot, PointContext.goumai.x, PointContext.goumai.y);
        }
    }

    public static void clickN_mumu(int n) throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < n; i++) {
            // 跳过剧情位置
            moveMouseAndClick_quick(robot, 1189, 37);
        }
    }
}