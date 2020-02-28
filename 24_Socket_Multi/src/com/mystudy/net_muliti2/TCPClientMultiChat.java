package com.mystudy.net_muliti2;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.InputMap;

// �޼��� �ۼ� ���� ���������� �����ϴ� ������ ����
// �޼��� ���� ���������� �����ϴ� ������ ����
public class TCPClientMultiChat {
	
	public static void main(String[] args) {

		//�۽�, ���� ������ �����ϰ� ����
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����� ID�� �Է� �ϼ���");
		System.out.print(">>");
		String name = scan.nextLine();
		
		Socket socket = null;
		//"192.168.0.100"
		try {
			//������ ������ IP�� ��Ʈ ����
			socket = new Socket("192.168.0.69", 10000);
			
			//�޼��� ������ ������ ���� ����(������� ����)
			ClientSender clientSender = new ClientSender(name,socket);
			clientSender.start();

			//�޼��� �ޱ� ������ ���� ����(������� ����)
			ClientReceiver clientRecevier = new ClientReceiver(socket);
			clientRecevier.start();
			
			}  catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	//�޼��� ������
	static class ClientSender extends Thread{
		Socket socket;
		String name;
		DataOutputStream out;
		

		ClientSender(String name, Socket socket) {
			this.name = name;
			this.socket = socket;
		    
			try {
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				System.out.println("[ ���ܹ߻� ] ClientSender ������ out ��ü ���� ����");
			}
		}
		@Override
		public void run() {
			
			//�޼��� �ۼ��ϰ�, �ۼ��� �޼��� ������ ����
			Scanner sc = new Scanner(System.in);
			if (out == null) {
				System.out.println("[���ܹ߻�] out ��ü�� null�Դϴ�.");
				return;
			}
			try {
				
				//ù��° �޼��� ���� : �̸�(����/���̵�)
				out.writeUTF(name);

				while (true) {
					//client �Է°� 
					String msg = sc.nextLine();
					// �Է°� ������ ���
					out.writeUTF(msg);
					
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}//ClientSender run method
	}//ClientSender class
	
	// �޼��� �ޱ� ������ �ۼ�
	static class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		
		public ClientReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	@Override
	public void run() {

	while(true) {
		try {
			String msg = in.readUTF();
			System.out.println(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	} // run method
	
	}// ClientReceiver class
	
}//TCPClientMultiChat class
