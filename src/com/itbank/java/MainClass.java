package com.itbank.java;
//. ��ü�� ���� workspace Ȯ�� 

import java.util.*;
import com.itbank.choi.*;
// �ٸ� package�� �ִ� method ������ ��� import �ȴ�
// * : ��� ���� �ǹ� (�ش� package�� ��� �� ���)

public class MainClass {
	
	public static void main(String[] args) {
		
		TestClass t = new TestClass();
		t.test();
		
		com.itbank.choi.TestClass t01 = new com.itbank.choi.TestClass();
		t01.test();
	
		TestClass01 tt01 = new TestClass01();
		tt01.test01();
		
		
	}
}
