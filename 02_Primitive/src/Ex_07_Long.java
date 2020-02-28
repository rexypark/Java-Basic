
public class Ex_07_Long {
	public static void main(String[] args) {
		// 정수형 long : 8 byte
		// 범위 : 충분히 큰 수
		// long 타입값 명시적 표현 : 숫자 + L 또는 l(영문 대소문자 열)
		
		long num1 = 20000000000000L;
		short num2 = 2324;
		
		System.out.println(num1 + num2);
		
		System.out.println("Long의 최댓값 : " + Long.MAX_VALUE);
		System.out.println("Long의 최소값 : " + Long.MIN_VALUE);
		
		System.out.println("===type 변환");
		
		byte numByte = 100;
		short numShort = 3000;
		int numInt = 3000000;
		long numLong = 50000000000L;
		
		numByte = (byte)numShort;
		System.out.println(numByte);
			
	}
}



















/*

 	  k = 0
 	  n = 1
 	  h = 1
 	  k = k+1
 	  n = n+k
 	  h = h + n
 	  
 	  k > 9
 	  
 	  
 	  피보나치
 	  
 	  abs = 1
 	  n =2
 	  
 	  c  = a + b
 	  s = s + c
 	  n = n+1
 	  n<10
 	  a = b
 	  b = c
 	  
 	  10진수 > 2진법
 	  bin(10)
 	  s
 	  dec > 10진수 값
 	  mok > 
 	  nmg > 
 	  
 	  mok = int(dec/ 2)
 	  nmg = dec -mok*2
	  s = s + 1
	  bin(s) = nmg
	  mok = 0
	  dec = mok
	  
	  8진수를 2진수로
	  
	  bin(100)
	  cnt 배열의 위치
	  pal 8진수 값
	  mok 자리수 뽑을 때 몫
	  nmg 자리수 뽑을 때 나머지
	  a 뽑아낸 8진수 자리수를 a로 치환한 후 2진수로 변환
	  m2 2진수로 변환시 몫
	  n2 2진수 변환시 나머지
	  
	  
	


*/ 