package day0608;

import java.util.Scanner;

public class StringExam1 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String input = s.nextLine(); // 공백 포함 입력, 엔터치기 전까지 리턴

		String[] strarr = input.split(" ");
		
		// 나
//		String str = String.join(",", strarr);
//		System.out.println(str);
//		
//		System.out.println("모두 " + strarr.length + "개의 단어가 있습니다.");
		
		// 강사님
		for(int i=0; i<strarr.length; i++) {
			System.out.print(strarr[i] + ",");
		}

		System.out.printf("%n총 %d개의 단어가 있습니다.", strarr.length);
	
	}

}
