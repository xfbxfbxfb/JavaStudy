package cn.xfb.GUIswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import 分割符类.Separater;
import javax.swing.JMenuBar;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class mywindow1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mywindow1 frame = new mywindow1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mywindow1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 454);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		setJMenuBar(menuBar);

		JMenu menu = new JMenu("\u6587\u4EF6");
		menuBar.add(menu);

		
		JMenuItem menuItem = new JMenuItem("\u6253\u5F00");
		JTextArea textArea = new JTextArea();
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 创建一个文件选择器
				JFileChooser chooser = new JFileChooser();
				// 创建一个文件扩展名过滤器
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Java&&Text", "java", "text");
				// 给文件选择器设置过滤器
				chooser.setFileFilter(filter);
				// 文件选择器调用显示选择对话框
				int returnVal = chooser.showOpenDialog(getParent());
				// 判断对话框的返回值
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					// System.out.println("你选择打开的文件为："+chooser.getSelectedFile().getName());
					File file = chooser.getSelectedFile();
					//清空文本区域
					textArea.setText("");
					//读取文件
					try {
						BufferedReader bufr = new BufferedReader(new FileReader(file));
						String line = null;
						while((line=bufr.readLine())!=null){
							textArea.append(line+Separater.LINE_SEPARATOR);
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		menu.add(menuItem);

		JMenuItem menuItem_1 = new JMenuItem("\u9000\u51FA");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("系统退出！");
				System.exit(0);
			}
		});
		menu.add(menuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		
		scrollPane.setViewportView(textArea);
		
	}

}
