package cn.api.xfb.GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GUIswing extends JFrame {

	protected static final String Line_SEPARAROT = System.getProperty("line.separator");
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIswing frame = new GUIswing();
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
	public GUIswing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.setBounds(455, 10, 132, 35);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();

		textField.setBounds(10, 11, 435, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 43, 577, 340);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		
		textArea.setBounds(0, 5, 567, 325);
		panel.add(textArea);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 通过文本框输入的路径在文本框中显示
				 * 思路：
				 * 
				 */
				showdir(textArea);
			}

			private void showdir(JTextArea textArea) {
				//获取路径
				String  str_dir = textField.getText();
				//将字符串封装为文件目录的路径
				File dir = new File(str_dir);
				//清空文本区域
				textArea.setText("");
				//判断
				if(dir.exists()&&dir.isDirectory()){
					File[] file = dir.listFiles();
					for(File f1 : file){
						textArea.append(f1.getName()+Line_SEPARAROT);	
					}
				}
			}
		});
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
					if(e.getKeyCode()==KeyEvent.VK_ENTER){
						//获取路径
						String  str_dir = textField.getText();
						//将字符串封装为文件目录的路径
						File dir = new File(str_dir);
						//清空文本区域
						textArea.setText("");
						//判断
						if(dir.exists()&&dir.isDirectory()){
							File[] file = dir.listFiles();
							for(File f1 : file){
								textArea.append(f1.getName()+Line_SEPARAROT);	
							}
						}
					}
			}
		});
	}
}
