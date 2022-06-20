package day0608;

public class Substring1 {
	public static void main(String[] args) {
		String s = "abcdefg";
		
//		String r = s.substring(3);
		String r = s.substring(3, 6); // 이상 미만!
				
		System.out.println(r);
		
		String ssn = "911206-1256932";
		
		// 주민번호 앞자리와 뒷자리를 분리하여 출력
		
		String firstNum = ssn.substring(0, 6);
		String secondNum = ssn.substring(7);
		System.out.println(firstNum);
		System.out.println(secondNum);
	}
}
