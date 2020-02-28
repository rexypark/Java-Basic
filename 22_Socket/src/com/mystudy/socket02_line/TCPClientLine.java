package com.mystudy.socket02_line;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientLine {

	public static void main(String[] args) {
		System.out.println(">>> Ŭ���̾�Ʈ ����");
		
		//0. ����� Socket ���� ����
		Socket socket = null;
		
		
		try {
			System.out.println("���� ��ǻ��IP : " + InetAddress.getLocalHost());
			System.out.println(">> ������ ���� ~~");
			//1. Socket ���� : ������ IP�ּ�, ��Ʈ ������ ������ ����
			socket = new Socket(InetAddress.getLocalHost(),10000);
		
			//2. �������� ���� in, out ����
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
//			OutputStreamWriter osw = new OutputStreamWriter(os);
			//PrintWriter�� byteŸ��, file, outputstream, ���� �ٹ��� �� ����
			//���۾� �ʿ� x
			PrintWriter pw = new PrintWriter(os);
			
			//3. ����(in) �����Ͱ� ������ �а�(read)
			//���� ����
			
			
			//4. ������ (out) �����Ͱ� ������ ����(write)
			
			String msg = "������ �������ϴ�.";
			pw.println(msg);
			pw.flush(); //���ۿ� �ִ� ������ ������ ���(����)
			System.out.println(">> �޼��� ���� �Ϸ�!");
			//5. stream / writer �ڿ� ����
			os.close();
			pw.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(">>> Ŭ���̾�Ʈ ����");
	}
}
