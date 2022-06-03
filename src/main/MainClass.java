package main;

import java.util.Scanner;

import tv.TVClass;

public class MainClass {
	
	public static void main(String[] args) {
		// 프로젝트 실행할 때 
		// 한명이 기본 틀 만들어서 git - hub 에 올리기
		
		Scanner input = new Scanner(System.in);
		int num;
		
		// 추가 내용
		TVClass tv = new TVClass();
		
		while(true) {
			System.out.println("1. TV");
			System.out.println("2. 냉장고");
			System.out.println("3. 에어컨");
			num = input.nextInt();
			
			switch(num) {
			
			case 1 : 
				// 추가 내용 
				tv.display();
				break;
			case 2 : break;
			case 3 : break;
			
			}
		}
	}

}
