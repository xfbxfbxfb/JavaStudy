package cn.api.xfb.GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * 新创建一个图形界面
 */
public class GUI基础 {
	public static void main(String[] args) {
		//创建一个窗体
		Frame frame = new Frame("新窗体");
		//设置窗体大小
		frame.setSize(500,400);
		//设置窗体的位置
		frame.setLocation(500, 300);
		//设置布局
		frame.setLayout(new FlowLayout());
		
		 /*
		  * 给窗体增加组件
		  * 
		  */
		
		//添加文本框
		TextField tf = new TextField(40);
		//添加按钮
		Button button = new Button("按钮");
		/*
		 * 对按钮进行事件监听
		 */
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//当按钮被按下去时所要做的事
				System.out.println("按钮被点击！ "+e);
				
			}
		});
		/*
		 * 键盘监视器
		 * 实现只能输入数字
		 */
		tf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
//				char key = e.getKeyChar();
//				int code = e.getKeyCode();
//				System.out.println(code+"..."+KeyEvent.getKeyText(code));
//				super.keyPressed(e);
				int code1 = e.getKeyCode();
				if(!(code1>=KeyEvent.VK_0 && code1<=KeyEvent.VK_9)){
					System.out.println("请输入数字0-9");
					e.consume();//直接取消默认处理方式
				}
				//组合键的应用
				if(e.isControlDown()&&e.getKeyCode()==KeyEvent.VK_ENTER){
					System.out.println("contrl+code run");
					
				}
			}
		});
		//添加到窗体中
		frame.add(tf);
		frame.add(button);
		/*
		 * window监视器通过窗口来监视
		 * 监视器的适配器更适合，
		 */
		frame.addWindowListener(new WindowAdapter() {//利用适配器来拿出少部分的监听

			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println("窗口已打开");
				super.windowOpened(e);
			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("窗口关闭");
				System.exit(0);
				super.windowClosing(e);
			}
		});
		/*
		 * 鼠标监听器
		 */
		//window中的鼠标监视器
		frame.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				System.err.println("空白被单击！ ");
				super.mouseClicked(e);
			}
		});
		//组件中的鼠标监视器
		button.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("按钮被单击！");
				if(e.getClickCount()==2){
					System.out.println("按钮被双击！");
				}
				super.mouseClicked(e);
			}
		});
		
		
		//窗体显示
		frame.setVisible(true);
		
		
	}
}
