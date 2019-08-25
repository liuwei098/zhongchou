package com.yc.atcrowdfunding.util; 

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ValidateColorServlet extends HttpServlet {

	public static final String CHECK_CODE_KEY = "CHECK_CODE_KEY";
	
	private static final long serialVersionUID = 1L;
	
	//设置验证图片的宽度, 高度, 验证码的个数
	private int width = 80;
	private int height = 40;
	private int codeCount = 6;
	
	//验证码字体的高度
	private int fontHeight = 4;
	
	//验证码中的单个字符基线. 即：验证码中的单个字符位于验证码图形左上角的 (codeX, codeY) 位置处
	private int codeX = 0;
	private int codeY = 0;
	
	//验证码由哪些字符组成
	char [] codeSequence = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz23456789".toCharArray();
	
	//初始化验证码图形属性
	public void init(){
		fontHeight = height - 2;
		codeX = width / (codeCount + 2);
		codeY = height - 4;
	}
	
	@RequestMapping("getValidCode")
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 创建一个宽100,高50,且不带透明色的image对象 100 50
        BufferedImage bi = new BufferedImage(100, 50, BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.getGraphics();
        //RGB色彩
        Color c = new Color(200, 150, 255);
        // 框中的背景色
        g.setColor(c);
        // 颜色填充像素
        g.fillRect(0, 0, 100, 50);

        // 定义验证码字符数组
        char[] ch = "ABCDEFGHIJKLMNPQRSTUVWXYZ0123456798".toCharArray();
        Random r = new Random();
        int len = ch.length;
        int index;
        StringBuffer sb = new StringBuffer();
        // 取出四个数字
        for (int i = 0; i < 4; i++) {
            // 循环四次随机取长度定义为索引
            index = r.nextInt(len);
            g.setColor(new Color(r.nextInt(88), r.nextInt(188), r.nextInt(255)));
            Font font = new Font("Times New Roman", Font.ITALIC, 18);
            g.setFont(font);
            g.drawString(ch[index] + "", (i * 18) + 10, 30);
            sb.append(ch[index]);
        }
        //放入Session中
        request.getSession().setAttribute("piccode", sb.toString());
        try {
            ImageIO.write(bi, "JPG", response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	
}
