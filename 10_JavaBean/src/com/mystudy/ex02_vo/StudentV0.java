package com.mystudy.ex02_vo;
/* 자바빈(JavaBean) 형태의 클래스
   V0(Value Object) : 값을 저장하기 위한 클래스
   DTO(Data transfer Object) : 값을 저장해서 전달하기 위한 클래스(객체)
 	-> XxxxVo, XxxxVo, XxxxDTO, XxxxDto
 */
public class StudentV0 {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	private int tot;
	private double avg;
	
	// 생성자 선언 -----------------
	// 생성자 : 성명, 국어, 영어, 수학 점수를 입력받는 생성자
	// 총점, 평균 값 자동 계산 처리
	
	public StudentV0(String name, int kor, int eng, int math) {
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		computeTotAvg();
	}
	
	// 메소드 선언 -----------------
	// sctter/getter 작성
	// 국어, 영어, 수학점수가 변경되면 총점, 평균 재계산 처리
	// 국어, 영어, 수학 점수는 0-100까지 값만 입력처리
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if(kor >= 0 && kor < 101) {
			this.kor = kor;
		} else {
			System.out.println("점수 잘못 입력[점수 : 1~100]");
		}
		
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		
		if(eng >= 0 && eng < 101) {
			this.eng = eng;
		} else {
			System.out.println("점수 잘못 입력[점수 : 1~100]");
		}
		
	}
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		if(math >= 0 && math < 101) {
			this.math = math;
		} else {
			System.out.println("점수 잘못 입력[점수 : 1~100]");
		}
	}
	
	public int getTot() {
		return tot;
	}
	
	public void setTot(int tot) {
		this.tot = tot;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	//computeTotAvg() 추가 : tot, avg 값 계산처리
	//printData() : 한사람의 데이터 화면출력
	
	public double computeTotAvg() {
		this.tot = kor + eng + math;
		this.avg = tot * 100 / 3 / 100.0;
		
		return this.avg; 
	}
	
	
	
	
	
	@Override
	public String toString() {
	
		return "StudentV0 [name = " + name + ", kor = " + kor + ", eng = " + eng + ", math = " + math + "]";
	}



	public String printData(){
		String info = name + "\t" + kor +  "\t" +  eng +  "\t" +  math +  "\t"+ tot +  "\t" +  avg;	
		
//		System.out.println(info);
		return info;
	}
	
	
}

