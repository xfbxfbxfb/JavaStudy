package cn.api.xfb.file;

import java.io.File;
import java.io.FileFilter;

public class FeilFilterByjava implements FileFilter {
	
	/**
	 * 过滤指定的目录，即目录的结尾的名为为过滤的要素
	 * @param suffix
	 */
	
	@Override
	public boolean accept(File pathname) {
		
		return pathname.isDirectory();
	}

	

}
