package com.wjliuh.patch;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.wjliuh.base.AbstractExecutor;


public class ExtractPatchExecutor extends AbstractExecutor{

	private String gerExpRec;
	private String regx = "(\\w)+\\/(src)\\/((client)|(private)|(public))";
	private Pattern p = Pattern.compile(regx);
	
	public ExtractPatchExecutor(String projectDir,String targetDir,String gerExpRec){
		super(projectDir,targetDir);
		this.gerExpRec = gerExpRec;
	}
	
	@Override
	public File getCodeFile() {
		return new File(getProjectDir()+"/"+getGerExpRec());
	}

	@Override
	public File getBinaryFile() {
		
		return new File(getGerExpRec().replaceAll(regx, getProjectDir()+"/"+"bin").replace(".java", ".class"));
	}

	@Override
	public File getTargetBinaryFile() {
		Matcher m = p.matcher(getGerExpRec());
		m.find();
		String scope = m.group(3);
		String finalBinaryPath = getGerExpRec().replaceAll(regx,getTargetDir()+"/"+getScope(scope)).replace(".java", ".class");
		File fatherDir = new File(finalBinaryPath.substring(0, finalBinaryPath.lastIndexOf("/")));
		if(!fatherDir.exists()){
			fatherDir.mkdirs();
		}
		return new File(finalBinaryPath);
	}

	@Override
	public File getTargetCodeFile() {
		Matcher m = p.matcher(getGerExpRec());
		m.find();
		String scope = m.group(3);
		String finalBinaryPath = getGerExpRec().replaceAll(regx,getTargetDir()+"/"+getScope(scope));
		File fatherDir = new File(finalBinaryPath.substring(0, finalBinaryPath.lastIndexOf("/")));
		if(!fatherDir.exists()){
			fatherDir.mkdirs();
		}
		return new File(finalBinaryPath);
	}

	public String getGerExpRec() {
		return gerExpRec;
	}

	public void setGerExpRec(String gerExpRec) {
		this.gerExpRec = gerExpRec;
	}


}
