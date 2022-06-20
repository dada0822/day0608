package day0608;

public class IndexOf1 {
	public static void main(String[] args) {
		// indexOf() : 매개값으로 주어진 문자열이 
		// 시작되는 위치를 반환함. 없으면 -1 리턴
		
		String sub = "자바 프로그래밍";
		int loc = sub.indexOf("프로그래밍");
		System.out.println(loc);
		
		if(sub.indexOf("자바") != -1) {
			System.out.println("자바와 관련이 있군요");
		} else {
			System.out.println("자바와 관련이 없군요");
		}
	}
}
