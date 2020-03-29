package Util;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ColorUtil {
    public static Color getColor(int x, int y) throws AWTException { // 函数返回值为颜色的RGB值。
        Robot rb = null; // java.awt.image包中的类，可以用来抓取屏幕，即截屏。
        System.out.println(System.currentTimeMillis());
        rb = new Robot();
        System.out.println(System.currentTimeMillis());
        Toolkit tk = Toolkit.getDefaultToolkit(); // 获取缺省工具包
        Dimension di = tk.getScreenSize(); // 屏幕尺寸规格
        Rectangle rec = new Rectangle(0, 0, di.width, di.height);
        BufferedImage bi = rb.createScreenCapture(rec);
        int pixelColor = bi.getRGB(x, y);
        System.out.println("rgb:"+pixelColor);
        Color color=new Color(16777216 + pixelColor);
        return color; // pixelColor的值为负，经过实践得出：加上颜色最大值就是实际颜色值。
    }
}
