package com.javaex.practice03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("숫자를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//7을 넣었을 경우
		for(int i=1; i<=num; i++) {
			for(int y=1; y<=i; y++) {
				System.out.print(i);
			}
			System.out.println();
		}
		sc.close();
	}

}
