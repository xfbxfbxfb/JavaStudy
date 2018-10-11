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
 * �´���һ��ͼ�ν���
 */
public class GUI���� {
	public static void main(String[] args) {
		//����һ������
		Frame frame = new Frame("�´���");
		//���ô����С
		frame.setSize(500,400);
		//���ô����λ��
		frame.setLocation(500, 300);
		//���ò���
		frame.setLayout(new FlowLayout());
		
		 /*
		  * �������������
		  * 
		  */
		
		//����ı���
		TextField tf = new TextField(40);
		//��Ӱ�ť
		Button button = new Button("��ť");
		/*
		 * �԰�ť�����¼�����
		 */
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//����ť������ȥʱ��Ҫ������
				System.out.println("��ť������� "+e);
				
			}
		});
		/*
		 * ���̼�����
		 * ʵ��ֻ����������
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
					System.out.println("����������0-9");
					e.consume();//ֱ��ȡ��Ĭ�ϴ���ʽ
				}
				//��ϼ���Ӧ��
				if(e.isControlDown()&&e.getKeyCode()==KeyEvent.VK_ENTER){
					System.out.println("contrl+code run");
					
				}
			}
		});
		//��ӵ�������
		frame.add(tf);
		frame.add(button);
		/*
		 * window������ͨ������������
		 * �����������������ʺϣ�
		 */
		frame.addWindowListener(new WindowAdapter() {//�������������ó��ٲ��ֵļ���

			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println("�����Ѵ�");
				super.windowOpened(e);
			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("���ڹر�");
				System.exit(0);
				super.windowClosing(e);
			}
		});
		/*
		 * ��������
		 */
		//window�е���������
		frame.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				System.err.println("�հױ������� ");
				super.mouseClicked(e);
			}
		});
		//����е���������
		button.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("��ť��������");
				if(e.getClickCount()==2){
					System.out.println("��ť��˫����");
				}
				super.mouseClicked(e);
			}
		});
		
		
		//������ʾ
		frame.setVisible(true);
		
		
	}
}
