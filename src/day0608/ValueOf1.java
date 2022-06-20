package day0608;

public class ValueOf1 {
	public static void main(String[] args) {
		
		// int를 String으로 변환
		int iVal = 100;
		String strval1 = String.valueOf(iVal);

		// double을 String으로 변환하기 위해 ""을 더해줌
		double dVal = 200.0;
		String strval2 = dVal + ""; // 문자 + 숫자 > 문자!

		// 변경하고자 하는 타입.
		double sum1 = Integer.parseInt(strval1) + Double.parseDouble(strval2);
		System.out.println("strVal1 + strVal2 = " + sum1);

		double sum2 = Integer.valueOf(strval1) + Double.valueOf(strval2);
		System.out.println("strVal1 + strVal2 = " + sum2);

		// split("문자열") : 해당 문자열을 구분자로 나눠 배열에 저장
		String animal = "dog, cat, bear";
		String[] arr = animal.split(",");

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		// join() : 여러 문자열 사이에 구분자를 넣어서 결합함
		String str = String.join("-", arr);
		System.out.println(str);

	}

}
