package cn.pad.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;

import sun.misc.BASE64Encoder;

public class ImageUtil {
	/**生成验证码图片 转 base64 并且保存图片验证码到session里
     * @param width 图片宽度
     * @param  height 图片高度
     * @param  session session域 用来保存验证码
     * @param length 验证码位数
     * @return 图片的base64串*/
    public String createImageWithVerifyCode(int width, int height, int length,HttpSession session) throws IOException {
        String png_base64="";
        //绘制内存中的图片
        BufferedImage bufferedImage = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        //得到画图对象
        Graphics graphics = bufferedImage.getGraphics();
        //绘制图片前指定一个颜色
        graphics.setColor(getRandColor(160,200));
        graphics.fillRect(0,0,width,height);
        //绘制边框
        graphics.setColor(Color.white);
        graphics.drawRect(0, 0, width - 1, height - 1);
        // 步骤四 四个随机数字
        Graphics2D graphics2d = (Graphics2D) graphics;
        graphics2d.setFont(new Font("宋体", Font.BOLD, 18));
        Random random = new Random();
        /*VerifyCodeUtils vcu = new VerifyCodeUtils();*/
        /*String word = VerifyCodeUtils.generateVerifyCode(4);*/
        String word = produceNumAndChar(4);
        // 定义x坐标
        int x = 10;
        for (int i = 0; i < word.length(); i++) {
            // 随机颜色
            graphics2d.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
            // 旋转 -30 --- 30度
            int jiaodu = random.nextInt(60) - 30;
            // 换算弧度
            double theta = jiaodu * Math.PI / 180;
            // 获得字母数字
            char c = word.charAt(i);
            //将c 输出到图片
            graphics2d.rotate(theta, x, 20);
            graphics2d.drawString(String.valueOf(c), x, 20);
            graphics2d.rotate(-theta, x, 20);
            x += 30;
        }
        //保存验证码
        session.setAttribute("code",word);
        // 绘制干扰线
        graphics.setColor(getRandColor(160, 200));
        int x1;
        int x2;
        int y1;
        int y2;
        for (int i = 0; i < 30; i++) {
            x1 = random.nextInt(width);
            x2 = random.nextInt(12);
            y1 = random.nextInt(height);
            y2 = random.nextInt(12);
            graphics.drawLine(x1, y1, x1 + x2, x2 + y2);
        }
        graphics.dispose();// 释放资源
        ByteArrayOutputStream baos = new ByteArrayOutputStream();//io流
        ImageIO.write(bufferedImage, "png", baos);//写入流中
        byte[] bytes = baos.toByteArray();//转换成字节
        BASE64Encoder encoder = new BASE64Encoder();
        png_base64 = encoder.encodeBuffer(bytes).trim();
        png_base64 = png_base64.replaceAll("\n", "").replaceAll("\r", "");//删除 \r\n
        return png_base64;
    }
    /**生成N位数字和字母混合的验证码
     * @param  num 验证码位数
     * @return code 生成的验证码字符串*/
    public String produceNumAndChar(int num){
        Random random = new Random();
        String code = "";
        String ch = "ABCDEFGHIJKLMNPQRSTUVWXYZ";
        String n = "123456789";
        for(int i=0;i<num;i++){
            int flag = random.nextInt(2);
            if(flag==0){//数字
                code+=n.charAt(random.nextInt(n.length()));
            }else{//字母
                code+=ch.charAt(random.nextInt(ch.length()));
            }
        }
        return code;
    }
    /**设置随机颜色*/
    private Color getRandColor(int fc, int bc) {
        // 取其随机颜色
        Random random = new Random();
        if (fc > 255) {
            fc = 255;
        }
        if (bc > 255) {
            bc = 255;
        }
        int r = fc + random.nextInt(bc - fc);
        int g = fc + random.nextInt(bc - fc);
        int b = fc + random.nextInt(bc - fc);
        return new Color(r, g, b);
    }

}
