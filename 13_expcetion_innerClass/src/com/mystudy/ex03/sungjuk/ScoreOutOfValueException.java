package com.mystudy.ex03.sungjuk;


public class ScoreOutOfValueException extends SungJukProcessException{
	public ScoreOutOfValueException() {
		super("점수 범위(0~100)를 벗어난 값입니다.");
		
		
		
	}
}
