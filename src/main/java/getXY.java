import Util.ColorUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;

public class getXY {
    public static void main(String[] args)throws AWTException {
        testSubImage();
        while(true){
            try {
                int x=MouseInfo.getPointerInfo().getLocation().x;
                int y=MouseInfo.getPointerInfo().getLocation().y;
                System.out.println("x:"+x+","+"y:"+y);
                Color color=ColorUtil.getColor(x,y);
                System.out.println("color:"+color.toString());
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


    public static void testSubImage()throws AWTException {
        Robot rb = null; // java.awt.image包中的类，可以用来抓取屏幕，即截屏。
        rb = new Robot();
        Toolkit tk = Toolkit.getDefaultToolkit(); // 获取缺省工具包
        Dimension di = tk.getScreenSize(); // 屏幕尺寸规格
        Rectangle rec = new Rectangle(0, 0, di.width, di.height);
        BufferedImage bi = rb.createScreenCapture(rec);
        BufferedImage biSub=bi.getSubimage(0,0,100,100);
        Raster image=bi.getData();
        System.out.println("ss");
    }
}
