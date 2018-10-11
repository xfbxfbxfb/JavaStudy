package cn.xfb.GUIswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import �ָ����.Separater;
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
				// ����һ���ļ�ѡ����
				JFileChooser chooser = new JFileChooser();
				// ����һ���ļ���չ��������
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Java&&Text", "java", "text");
				// ���ļ�ѡ�������ù�����
				chooser.setFileFilter(filter);
				// �ļ�ѡ����������ʾѡ��Ի���
				int returnVal = chooser.showOpenDialog(getParent());
				// �ж϶Ի���ķ���ֵ
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					// System.out.println("��ѡ��򿪵��ļ�Ϊ��"+chooser.getSelectedFile().getName());
					File file = chooser.getSelectedFile();
					//����ı�����
					textArea.setText("");
					//��ȡ�ļ�
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
				System.out.println("ϵͳ�˳���");
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
