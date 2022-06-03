package com.itbank.java;
//. 자체가 폴더 workspace 확인 

import java.util.*;
import com.itbank.choi.*;
// 다른 package에 있는 method 가져올 경우 import 된다
// * : 모든 값을 의미 (해당 package의 모든 값 사용)

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
