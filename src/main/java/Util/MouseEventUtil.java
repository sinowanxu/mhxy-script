package Util;


import Context.PointContext;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class MouseEventUtil {
    public static void moveMouseAndClick(Robot robot,int x,int y ) throws AWTException {
        int a = 20;

        Random random = new Random();
        x+=random.nextInt(3);
        y+=random.nextInt(3);
        robot.mouseMove(x, y);
        a = a+random.nextInt(20);
        a=30;
        robot.delay(a);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        a = random.nextInt(20);
        robot.delay(a);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1000);
    }

    public static void mouseWheel(Robot robot,Point p,int wheelAmt){
        // 负是滑轮向上
        robot.mouseMove(p.x,p.y);
        robot.mouseWheel(wheelAmt);
    }

    public static void pressF11(Robot robot){
        robot.keyPress(KeyEvent.VK_F11);
        robot.keyRelease(KeyEvent.VK_F11);
    }

    public static void moveMouseAndClick_quick(Robot robot,int x,int y ) throws AWTException {
        int a = 20;

        Random random = new Random();
        x+=random.nextInt(10);
        y+=random.nextInt(5);
        robot.mouseMove(x, y);
        a = a+random.nextInt(20);
        a=30;
        robot.delay(a);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        a = random.nextInt(20);
        robot.delay(a);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void moveMouseAndClickRight(Robot robot,int x,int y ) throws AWTException {
        int a = 1000;

        Random random = new Random();
        x+=random.nextInt(10);
        y+=random.nextInt(5);
        robot.mouseMove(x, y);
        a = Math.abs(random.nextInt())%100+50;
        robot.delay(a);
        robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
        a = Math.abs(random.nextInt())%50+50;
        robot.delay(a);
        robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
        robot.delay(1000);
    }

    public static void mousePressMoveDown(Robot robot,int x,int y,int delta){
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(300+new Random().nextInt(100));
        robot.mouseMove(x, y-delta);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
}
