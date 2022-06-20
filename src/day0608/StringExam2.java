package day0608;

import java.util.Scanner;

public class StringExam2 {
	public static void main(String[] args) {
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String num = "1234567890";
		
		// 나
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("영문 또는 숫자를 입력하세요 > ");
//		String input = s.next();
//		
//		if (alpha.indexOf(input) != -1 || alpha.indexOf(input.toLowerCase()) != -1) {
//			System.out.println("Input character : " + input);
//			System.out.println("입력하신 " + input + "은 문자입니다.");
//		} else if (num.indexOf(input) != -1) {
//			System.out.println("Input character : " + input);
//			System.out.println("입력하신 " + input + "은 숫자입니다.");
//		} else {
//			System.out.println("잘못 입력했습니다!");
//		}
		
		// 강사님
		System.out.print("영문 또는 숫자를 입력하세요 > ");
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		String temp = str.toLowerCase();
		
		int alphaIdx = alpha.indexOf(temp);
		int numIdx = num.indexOf(temp);
		
		System.out.print("입력받은 내용 " + str);
		
		if (alphaIdx != -1) {
			System.out.println("는 문자입니다.");
		} else if (numIdx != -1) {
			System.out.println("는 숫자입니다.");
		} else {
			System.out.println("를 다시 확인하세요!");
		}
		
	}

}