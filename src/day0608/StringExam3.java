package day0608;

import java.io.IOException;
import java.util.Scanner;

public class StringExam3 {
	public static void main(String[] args) {
		
		System.out.print("영문 또는 숫자 입력 > ");
		
//		Scanner scan = new Scanner(System.in);
//		
//		String input = scan.next(); // 한 글자만 받을 거니까 그냥 next()
//		int str = input.charAt(0); // char가 int타입으로 자동형변환
//		// charAt(인덱스) : 문자열에서 인덱스번째의 문자를 반환
////		System.out.println(str);
//		
//		if ((str>=65 && str<=90) || (str>=97 && str<=122)) {	
//			System.out.println("입력하신 " + (char)str + "은 문자입니다.");
//		} else if (str>=48 && str<=57) {
//			System.out.println("입력하신 " + (char)str + "은 숫자입니다.");
//		} else {
//			System.out.println("입력한 값을 다시 확인하세요.");
//		}
		
		try {
			// System.in.read() : 입력한 값을 아스키코드 값으로 저장함 
			int str = System.in.read();
			
//			System.out.println(str);
			
			if ((str>=65 && str<=90) || (str>=97 && str<=122)) {
				System.out.println("입력하신 " + (char)str + "은 문자입니다.");
			} else if (str>=48 && str<=57) {
				System.out.println("입력하신 " + (char)str + "은 숫자입니다.");
			} else {
				System.out.println("입력한 값을 다시 확인하세요.");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
