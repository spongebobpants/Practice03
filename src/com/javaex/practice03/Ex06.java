package com.javaex.practice03;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7이나 5로 i를 나눴을 때 0이 되는 게 참인 것
		
		int i =0;
		
		for(i=1; i<=100; i++) {
			if(i%5==0 && i%7==0) {
				System.out.println(i);
			}
		}
		
	}

}
