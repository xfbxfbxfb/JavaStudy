package cn.xfb.api.IO;

import java.io.File;
import java.io.FileFilter;

public class Filefilterbymy2 implements FileFilter {
	String suffix;
	public Filefilterbymy2() {
		super();
	}
	public Filefilterbymy2(String suffix) {
		super();
		this.suffix = suffix;
	}
	@Override
	public boolean accept(File pathname) {
		
		return pathname.getName().endsWith(suffix);
	}

}
