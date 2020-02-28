package com.mystudy.ex08_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Queue {

	public static void main(String[] args) {
		// ť(Queue) : ���Լ���(FIFO)
		// Queue�� LinkedList ������Ÿ���� ���´�.
		
		
		System.out.println("--- ť(Queue) : ���Լ���(FIFO)");
		Queue<String> que = new LinkedList<>();
		
		que.offer("1");
		que.offer("2");
		que.offer("3");
		que.offer("4");
		System.out.println(que);
		System.out.println();
		//peek()�� �����͸� ��ȸ�� �ϰ� ������ �ʴ´�
		System.out.println("que.peek() : " + que.peek());  
		System.out.println("que.peek() : " + que.peek());
		System.out.println();
		

		
		System.out.println("que.size() : " + que.size());
		System.out.println("que.isEmpty() : " + que.isEmpty());
		System.out.println("que.peek() : " + que.peek());
		
		///////////////////////////////////////////////////
		//Queue�� ���� ������� ������ FIFO
		//[1, 2, 3, 4, 5] > 1 2 3 4 5
		//Stack�� �Ųٷ� ���´�LIFO
		//[1, 2, 3, 4, 5] > 5 4 3 2 1
		
		System.out.println("=== ����(Stack : LIFO - ���Լ���) ===");
		Stack<String> sct = new Stack<>();
		sct.push("1");
		sct.push("2");
		sct.push("3");
		sct.push("4");

		System.out.println(sct);
		System.out.println("st.peek() : " + sct.peek());
		
		
//		while(!que.isEmpty()) {
//			System.out.println("que.poll() : " + que.poll());
//			System.out.println("que : " + que);
//			System.out.println();
//		}
		
		System.out.println();
		System.out.println();
		System.out.println("que : " + que);
		System.out.println("sct : " + sct);
		while (!sct.isEmpty() ) {
			System.out.println();
			System.out.println("st.pop() : " + sct.pop() + "\t" + "st : " + sct);
			System.out.println("que.poll() : " + que.poll() + "\t" + "que : " + que);
			System.out.println();
		}
				
		
	}
}
