package com.wjliuh.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NetworkService implements Runnable {
	private final ServerSocket serverSocket;
	private final ExecutorService pool;

	public NetworkService(int port, int poolSize) throws IOException {
		serverSocket = new ServerSocket(port);
		pool = Executors.newFixedThreadPool(poolSize);

	}

	@Override
	public void run() {
		try {
			for (;;) {
				pool.execute(new Handler(serverSocket.accept()));
			}
		} catch (IOException ex) {
			pool.shutdown();
		}

	}

	class Handler implements Runnable {
		private final Socket socket;

		Handler(Socket socket) {
			this.socket = socket;
		}

		public void run() {
			try {
				System.out.println(socket.toString());
				System.out.println(Thread.currentThread().getName());
				BufferedReader br = new BufferedReader(new InputStreamReader(
						socket.getInputStream(), "GBK"));
				StringBuilder sb = new StringBuilder();
				String temp;
				int index;
				while ((temp = br.readLine()) != null) {
					System.out.println(temp);
					if ((index = temp.indexOf("eof")) != -1) {// 遇到eof时就结束接收
						sb.append(temp.substring(0, index));
						break;
					}
					sb.append(temp);
				}
				System.out.println("服务端: " + sb);
				// 读完后写一句
				Writer writer = new OutputStreamWriter(
						socket.getOutputStream(), "UTF-8");
				writer.write("你好，客户端。");
				writer.write("eof\n");
				writer.flush();
				writer.close();
				br.close();
				socket.close();
			} catch (Exception ex) {

			}

		}

	}
	
	
	public static void main(String[] args){
		try{
			new Thread(new NetworkService(8899,4)).start();
		}catch(Exception ex){
			
		}
		
	}

}
