package com.wjliuh.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.junit.Test;

import com.wjliuh.patch.ExtractPatchExecutor;

public class PatchService {
	
	@Test
	public void test(){
		doExtract("D:/ncDev/dev-workspace/MM_BD","C:/Users/JIE/Desktop","C:/Users/JIE/Desktop/cfg.txt");
	}
	
	public void doExtract(String prjDir,String patchDir,String cfg){
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(cfg))));
			String line;
			ExtractPatchExecutor executor = null;
			while((line=br.readLine())!=null){
				executor = new ExtractPatchExecutor(prjDir,patchDir,line);
				executor.copyBinary();
				executor.copyCode();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
