package chap11.example.sec110702;

public class StringEqualsExample {
	public static void main(String[] args) {
		
		String strVar1 = new String("김태희");
		String strVar2 = "김태희";
		String strVar3 = "김태희";
		
		
		if (strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
		
		System.out.println("----------------------");
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println(strVar2 == strVar3);
		System.out.println("----------------------");
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		System.out.println(strVar2.equals(strVar3));
		
	}
}
