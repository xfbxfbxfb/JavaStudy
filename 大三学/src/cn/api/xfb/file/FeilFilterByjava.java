package cn.api.xfb.file;

import java.io.File;
import java.io.FileFilter;

public class FeilFilterByjava implements FileFilter {
	
	/**
	 * ����ָ����Ŀ¼����Ŀ¼�Ľ�β����ΪΪ���˵�Ҫ��
	 * @param suffix
	 */
	
	@Override
	public boolean accept(File pathname) {
		
		return pathname.isDirectory();
	}

	

}
