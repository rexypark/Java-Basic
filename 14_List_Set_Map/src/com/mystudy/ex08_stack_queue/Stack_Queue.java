package com.mystudy.ex08_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Queue {

	public static void main(String[] args) {
		// 큐(Queue) : 선입선출(FIFO)
		// Queue는 LinkedList 데이터타입을 갖는다.
		
		
		System.out.println("--- 큐(Queue) : 선입선출(FIFO)");
		Queue<String> que = new LinkedList<>();
		
		que.offer("1");
		que.offer("2");
		que.offer("3");
		que.offer("4");
		System.out.println(que);
		System.out.println();
		//peek()은 데이터를 조회만 하고 꺼내지 않는다
		System.out.println("que.peek() : " + que.peek());  
		System.out.println("que.peek() : " + que.peek());
		System.out.println();
		

		
		System.out.println("que.size() : " + que.size());
		System.out.println("que.isEmpty() : " + que.isEmpty());
		System.out.println("que.peek() : " + que.peek());
		
		///////////////////////////////////////////////////
		//Queue는 넣은 순서대로 나오고 FIFO
		//[1, 2, 3, 4, 5] > 1 2 3 4 5
		//Stack은 거꾸로 나온다LIFO
		//[1, 2, 3, 4, 5] > 5 4 3 2 1
		
		System.out.println("=== 스택(Stack : LIFO - 후입선출) ===");
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
