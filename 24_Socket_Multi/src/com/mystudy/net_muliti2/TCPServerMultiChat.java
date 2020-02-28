package com.mystudy.net_muliti2;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class TCPServerMultiChat {

	// clientName, clientOutStream;
	HashMap<String, DataOutputStream> clients; // ������ ���

	public static void main(String[] args) {
		new TCPServerMultiChat().serverStart();
	}

	TCPServerMultiChat() {
		clients = new HashMap<>();
	}

	// ���� ���� ���� ����ϴٰ�
	// Ŭ���̾�Ʈ�� �����ϸ�
	// �޽����� �ޱ����� ������ ����(�޽��� �а� ��ü���� ����)
	private void serverStart() {
		Socket socket = null;
		ServerSocket server = null;

		try {
			// ���� ��Ʈ ���� : 10000
			server = new ServerSocket(10000);

			System.out.println("[ ������ ���� �Ǿ����ϴ� ]");
			System.out.println(
					"���� IP�ּ� : ��Ʈ��ȣ - " + InetAddress.getLocalHost().getHostAddress() + ":" + server.getLocalPort());
			//Ŭ���̾�Ʈ�� �����Ҷ����� thread����
			while (true) {
				socket = server.accept();
				System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "] ����");
				// ���ӵ� Ŭ���̾�Ʈ�� ���� ó�� - ������ ����
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	// ���� ���� socket�� �̿��� �޼��� �ް�, ��ü���� ����
	// ������ �� : �ʵ� clients �� �߰�
	// ����� �� : �ʵ� clients ���� ���� ó��
	private class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in; // �޼����� ���� �� ���
		DataOutputStream out;;// �ʵ� clients�� ��� �� ���
		String ip;
		String name;

		ServerReceiver(Socket socket) {
			this.socket = socket;
			try {

				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());

				ip = socket.getInetAddress().getHostAddress();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		@Override
		public void run() {
			// ���� �� �� clients�� �߰�, ���� �� �� clients���� ����
			// �޼����� �ް�, ���ӵ� ��� ������� �޼��� ����
			try {

				// Ŭ���̾�Ʈ�� ���� ���� ù �޼����� Ŭ���̾�Ʈ name ����
				name = in.readUTF();
				System.out.println("������ >> " + name);

				// ��ü���� ������ ��� �˸�
				sendToAll("#" + name + "���� �����ϼ̽��ϴ�.");

				// ������ ������ ���(clients)�� ���
				clients.put(name, out);

				// �޼��� �а� ��ü���� ����(�ݺ�)
				while (true) {
					String msg = in.readUTF();
//					System.out.println(name + ">>" + msg); // ����ȭ�鿡 ���
//					System.out.println();
					sendToAll("[" + name +  "]" + ">>" + msg); // ������ �������� �޼��� ������
				}

			} catch (IOException e) {
				e.printStackTrace();

			} finally {
				//
				try {

					if (socket != null) {
						socket.close();
						System.out.printf("[%s Exit] \n", name);
						// client���� �ش� name key & value ����
						clients.remove(name);
						String outMsg = "<" + name + ">���� �������ϴ�.";
						sendToAll(outMsg);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		private void sendToAll(String str) {

			// ������ ��ü���� �޼��� ����
			Iterator<String> ite = clients.keySet().iterator();
			while (ite.hasNext()) {
				String key = ite.next();
				DataOutputStream out = clients.get(key);

				try {
					out.writeUTF(str);
				} catch (IOException e) {
					e.printStackTrace();

				}
			}
		}
	}

}
