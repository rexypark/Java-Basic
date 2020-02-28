package com.mystudy.socket05_whileteacher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerWhile_Teacher {
	
	
	public static void main(String[] args) {
		
	
		ServerSocket server = null;
		Socket socket = null;
		
		InputStream is = null;
		OutputStream os= null;
		BufferedReader br= null;
		PrintWriter pw= null;
		
		
		try {
			server = new ServerSocket(10000);
			socket = server.accept();
			
			System.out.println(">> Ŭ���̾�Ʈ ���ӵ�");
			
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			//����Ʈ(byte) ó���迭�� ����(char) ó���迭�� ��ȯ
			InputStreamReader isr = new InputStreamReader(is);
			
			//����(������� ���ϰ� ���� ���� �����)
			br = new BufferedReader(isr);
			pw = new PrintWriter(os);
			
			//=================================================
			//�а� ���� �ݺ�
			System.out.println(">> ������ �б�");
			while (true) {
				String readVal = br.readLine();
				System.out.println("[ From Client ] : " + readVal);
				
				pw.println(readVal);
				pw.flush();
			
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(pw !=null) pw.close();
			if(br !=null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		System.out.println("���� ����");
		
	}
}
