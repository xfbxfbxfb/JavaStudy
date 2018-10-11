package cn.api.xfb.file;

import java.io.File;
import java.io.FilenameFilter;

public class FeilnameFilterByjava implements FilenameFilter {
	private String suffix;

	public FeilnameFilterByjava(String suffix) {
		super();
		this.suffix = suffix;
	}

	/**
	 * 在指定的文件目录过滤文件
	 */
	@Override
	public boolean accept(File dir, String name) {
		System.out.println(dir + "::" + name);
		return name.endsWith(suffix);
	}

}
