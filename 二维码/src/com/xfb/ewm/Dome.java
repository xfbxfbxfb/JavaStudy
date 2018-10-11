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
		//设置二维码的宽高
		int width = 255;
		int height =255;
		
		//二维码内容
		String content="https://xfbxfbxfb.github.io/";
		//解决乱码
		String contents =new String(content.getBytes("UTF-8"), "ISO-8859-1");
		//定义二维码格式jpg,png,gif
		String format ="jpg";
		 //容错率L7，M15，H30，Q25
		HashMap<EncodeHintType , Comparable> map = new HashMap<EncodeHintType, Comparable>();
		map.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
		
		//生成二维码//传进的东西，二维码格式，	
		try {
			//生成二维码
			BitMatrix encode = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, width, height);
//			把二维码输出到图片上
			File file = new File("E:\\java图片\\二维码.jpg");
			MatrixToImageWriter.writeToPath(encode, format, file.toPath());
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
