package day01;

public class TestClass03 {
	
	public static void main(String[] args) {
		System.out.println(100+100);
		System.out.println(100.123+100.234);
		System.out.println("100"+"100");
		System.out.println("안녕"+"하세요");
		System.out.println(100+"100");
		System.out.println(100+"원");
		System.out.println(100+200+"원"); // 앞에서부터 순차적으로 연산이 진행되니까
		System.out.println("안녕"+100+200); // > "안녕100"+200 > "안녕100200"
		System.out.println("금액은"+(200+500)+"원"); //괄호로 묶어주어라
		
	
	}
}
