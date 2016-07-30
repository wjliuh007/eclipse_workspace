package com.wjliuh.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.URL;

public class AuthTest {

	public static void main(String[] args) throws Exception {
		Authenticator.setDefault(new JavaAuthenticator("≤ª≥‹œ¬Œ 2010", "28793651kutian"));
		HttpURLConnection con = (HttpURLConnection)new URL("http://zhidao.baidu.com/ihome").openConnection();
		InputStream ins = con.getInputStream();

		BufferedReader reader = new BufferedReader(new InputStreamReader(ins));
		
		String line;
		while((line = reader.readLine())!=null){
			System.out.println(line);
		}
	}

}

class JavaAuthenticator extends Authenticator{
	private String userName;
	private String passWord;
	
	public JavaAuthenticator(String userName,String passWord){
		this.userName = userName;
		this.passWord = passWord;
	}
	
	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(userName, passWord.toCharArray());
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
