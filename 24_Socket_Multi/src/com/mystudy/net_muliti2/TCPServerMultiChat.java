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
	HashMap<String, DataOutputStream> clients; // 접속자 명단

	public static void main(String[] args) {
		new TCPServerMultiChat().serverStart();
	}

	TCPServerMultiChat() {
		clients = new HashMap<>();
	}

	// 서버 소켓 생성 대기하다가
	// 클라이언트가 접속하면
	// 메시지를 받기위한 쓰레드 생성(메시지 읽고 전체에게 전달)
	private void serverStart() {
		Socket socket = null;
		ServerSocket server = null;

		try {
			// 서버 포트 설정 : 10000
			server = new ServerSocket(10000);

			System.out.println("[ 서버가 시작 되었습니다 ]");
			System.out.println(
					"서버 IP주소 : 포트번호 - " + InetAddress.getLocalHost().getHostAddress() + ":" + server.getLocalPort());
			//클라이언트가 접속할때마다 thread생성
			while (true) {
				socket = server.accept();
				System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "] 접속");
				// 접속된 클라이언트에 대한 처리 - 쓰레드 생성
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	// 전달 받은 socket을 이용해 메세지 받고, 전체에게 전달
	// 생생될 때 : 필드 clients 에 추가
	// 종료될 때 : 필드 clients 에서 삭제 처리
	private class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in; // 메세지를 읽을 때 사용
		DataOutputStream out;;// 필드 clients에 등록 시 사용
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
			// 생성 될 때 clients에 추가, 종료 할 때 clients에서 삭제
			// 메세지를 받고, 접속된 모든 사람에게 메세지 전달
			try {

				// 클라이언트로 부터 받은 첫 메세지가 클라이언트 name 설정
				name = in.readUTF();
				System.out.println("접속자 >> " + name);

				// 전체에게 접속한 사람 알림
				sendToAll("#" + name + "님이 입장하셨습니다.");

				// 접속자 정보를 목록(clients)에 등록
				clients.put(name, out);

				// 메세지 읽고 전체에게 전달(반복)
				while (true) {
					String msg = in.readUTF();
//					System.out.println(name + ">>" + msg); // 서버화면에 출력
//					System.out.println();
					sendToAll("[" + name +  "]" + ">>" + msg); // 접속자 전원에게 메세지 보내기
				}

			} catch (IOException e) {
				e.printStackTrace();

			} finally {
				//
				try {

					if (socket != null) {
						socket.close();
						System.out.printf("[%s Exit] \n", name);
						// client에서 해당 name key & value 삭제
						clients.remove(name);
						String outMsg = "<" + name + ">님이 나갔습니다.";
						sendToAll(outMsg);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		private void sendToAll(String str) {

			// 접속한 전체에게 메세지 전달
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
