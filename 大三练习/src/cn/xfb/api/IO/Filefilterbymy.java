package cn.xfb.api.IO;

import java.io.File;
import java.io.FileFilter;

public class Filefilterbymy implements FileFilter {
	private String suffix;
	public Filefilterbymy(String suffix) {
		super();
		this.suffix = suffix;
	}

	@Override
	public boolean accept(File pathname) {

		return pathname.getName().endsWith(suffix);
	}

}
