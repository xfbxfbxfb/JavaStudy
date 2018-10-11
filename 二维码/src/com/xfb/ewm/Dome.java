package com.xfb.ewm;

import java.io.EOFException;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.encoder.ErrorCorrection;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class Dome {
	/**
	 * 
	 * @param bo
	 * @throws UnsupportedEncodingException 
	 */
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		//���ö�ά��Ŀ��
		int width = 255;
		int height =255;
		
		//��ά������
		String content="https://xfbxfbxfb.github.io/";
		//�������
		String contents =new String(content.getBytes("UTF-8"), "ISO-8859-1");
		//�����ά���ʽjpg,png,gif
		String format ="jpg";
		 //�ݴ���L7��M15��H30��Q25
		HashMap<EncodeHintType , Comparable> map = new HashMap<EncodeHintType, Comparable>();
		map.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
		
		//���ɶ�ά��//�����Ķ�������ά���ʽ��	
		try {
			//���ɶ�ά��
			BitMatrix encode = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, width, height);
//			�Ѷ�ά�������ͼƬ��
			File file = new File("E:\\javaͼƬ\\��ά��.jpg");
			MatrixToImageWriter.writeToPath(encode, format, file.toPath());
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
