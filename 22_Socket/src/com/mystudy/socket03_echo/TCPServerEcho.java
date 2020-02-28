package com.mystudy.socket03_echo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class TCPServerEcho {

	public static void main(String[] args) {
		/* ������ : �������� ����ؼ� Ŭ���̾�Ʈ ���Ӵ��
		1. �������� ����ؼ� Ŭ���̾�Ʈ ���Ӵ��
		2. Ŭ���̾�Ʈ�� �����ϸ�
		2-1. Ŭ���̾�Ʈ�� ���� �޼����� �ް�,(�б�, Input)
			 > �����޼��� ȭ�� ���
		2-2. ���� �޼����� Ŭ���̾�Ʈ���� �ٽ� ����(����, Output)
		3. Ŭ���̾�Ʈ���� ���� �޼��� ���
		*/
		
		
		
		System.out.println(">> ���� ����");
		ServerSocket server = null;
		int port = 10000;
		
		
		try {
			
			System.out.println("[���� �����]");
			server = new ServerSocket(port);
			Socket socket = server.accept();
			System.out.println("[Ŭ���̾�Ʈ ����]");
			
			
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			//2-1. Ŭ���̾�Ʈ�� ���� �޼����� �ް�,(�б�, Input)
			// > �����޼��� ȭ�� ���
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			
			String readVal = br.readLine();
			System.out.println("[Ŭ���̾�Ʈ���� ���� �޼���] : " + readVal);
			
			//2-2. ���� �޼����� Ŭ���̾�Ʈ���� �ٽ� ����(����, Output)
			PrintWriter pw = new PrintWriter(os);
			
			//3. Ŭ���̾�Ʈ���� ���� �޼��� ���
			pw.println(readVal + " From Server");
			pw.flush();
			System.out.println("[���� ���� �޼���] : " + readVal + " From Server");
			
			pw.close();
			os.close();
			br.close();
			isr.close();
			is.close();
			System.out.println("[���� ����]");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
