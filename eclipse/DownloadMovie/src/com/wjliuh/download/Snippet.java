package com.wjliuh.download;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

public class Snippet {
	/**
	 * Description: 从FTP服务器下载文件
	 * @Version1.0 Jul 27, 2008 5:32:36 PM by 崔红保（cuihongbao@d-heaven.com）创建
	 * @param url FTP服务器hostname
	 * @param port FTP服务器端口
	 * @param username FTP登录账号
	 * @param password FTP登录密码
	 * @param remotePath FTP服务器上的相对路径
	 * @param fileName 要下载的文件名
	 * @param localPath 下载后保存到本地的路径
	 * @return
	 */
	public static boolean downFile(String url, int port,String username, String password, String remotePath,String fileName,String localPath) {
		boolean success = false;
		FTPClient ftp = new FTPClient();
		try {
			int reply;
			ftp.connect(url, port);
			//如果采用默认端口，可以使用ftp.connect(url)的方式直接连接FTP服务器
			ftp.login(username, password);//登录
			reply = ftp.getReplyCode();
			if (!FTPReply.isPositiveCompletion(reply)) {
				ftp.disconnect();
				return success;
			}
			ftp.changeWorkingDirectory(remotePath);//转移到FTP服务器目录
			FTPFile[] fs = ftp.listFiles();
			for(FTPFile ff:fs){
				if(ff.getName().equals(fileName)){
					File localFile = new File(localPath+"/"+ff.getName());
					
					OutputStream is = new FileOutputStream(localFile); 
					ftp.retrieveFile(ff.getName(), is);
					is.close();
				}
			}
			
			ftp.logout();
			success = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ftp.isConnected()) {
				try {
					ftp.disconnect();
				} catch (IOException ioe) {
				}
			}
		}
		return success;
	}
}

