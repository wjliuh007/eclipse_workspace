package com.wjliuh.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class AbstractExecutor {

	/** 项目根目录 */
	private String projectDir;
	
	/** 保存补丁根目录 */
	private String targetDir;
	
	/** 输入流 */
	private InputStream is;
	
	/** 输出流 */
	private OutputStream os;
	
	public AbstractExecutor(String projectDir, String targetDir) {
		this.projectDir = projectDir;
		this.targetDir = targetDir;
	}

	/**
	 * 用于重写获取自定义的源码文件
	 */
	public abstract File getCodeFile();
	
	/**
	 * 用于重写获取自定义的二进制编译后class文件
	 */
	public abstract File getBinaryFile();

	/**
	 * 用于重写获取自定义的保存补丁的文件
	 */
	public abstract File getTargetBinaryFile();

	/**
	 * 用于重写获取自定义的保存补丁的源码文件
	 */
	public abstract File getTargetCodeFile();
	
	/**
	 * 复制class文件
	 */
	public void copyBinary(){
		if(!getBinaryFile().exists()){
			return;
		}
		doCopy(getBinaryFile(),getTargetBinaryFile());
		
	}
	
	/**
	 * 复制源码java文件
	 */
	public void copyCode(){
		if(!getCodeFile().exists()){
			return;
		}
		doCopy(getCodeFile(),getTargetCodeFile());
		
	}
	
	/**
	 * 复制操作
	 * @param src
	 * @param to
	 */
	private void doCopy(File src,File to) {
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(to);
			byte[] buffer = new byte[256];
			int read;
			while((read=is.read(buffer))!=-1){
				os.write(buffer, 0, read);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(null != is){
					is.close();
				}
				if(null != os){
					os.flush();
					os.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
	

	public String getProjectDir() {
		return projectDir;
	}
	public void setProjectDir(String projectDir) {
		this.projectDir = projectDir;
	}
	public void setTargetDir(String targetDir) {
		this.targetDir = targetDir;
	}
	public String getTargetDir() {
		return targetDir;
	}
	
	public String getScope(String scope){
		if("client".equals(scope)){
			return "client/classes";
		}else if("public".equals(scope)){
			return "classes";
		}else if("private".equals(scope)){
			return "META-INF/classes";
		}
		return null;
	}
	
}
