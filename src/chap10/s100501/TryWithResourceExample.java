package chap10.s100501;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			Integer.parseInt("abc");
//			throw new Exception();     //강제적으로 예외 발생시킴
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}
}